package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Um objeto EntityManagerFactory é uma fábrica de EntityManager.
		EntityManager em = emf.createEntityManager(); // EUm objeto ntityManager gerencia as operações de persistência em entidades. 
		
		em.getTransaction().begin(); // Inicia uma transação no contexto de persistência do EntityManager no Java. 
		em.persist(p1); // .persist() salva uma entidade em um banco de dados.
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); // Confirma uma transação no contexto de persistência do EntityManager no Java. 
		
		System.out.println("Pronto!");	
	}
}