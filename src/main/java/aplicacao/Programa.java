package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Um objeto EntityManagerFactory é uma fábrica de EntityManager.
		EntityManager em = emf.createEntityManager(); // EUm objeto ntityManager gerencia as operações de persistência em entidades. 
		
		Pessoa p = em.find(Pessoa.class, 2); // Recuperei um registro para que EntityManager possa monitorá-lo.
		em.getTransaction().begin();
		em.remove(p);                        // .remove() remove um registro do BD, desde que ele esteja monitorado pelo EntityManager.
		em.getTransaction().commit();
		
		System.out.println("Pronto!");	
		emf.close();
		em.close();
	}
}