package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Um objeto EntityManagerFactory é uma fábrica de EntityManager.
		EntityManager em = emf.createEntityManager(); // EUm objeto ntityManager gerencia as operações de persistência em entidades. 
		
		Pessoa p = em.find(Pessoa.class, 2); // .find() chamado a partir de um objeto EntityManager permite obter uma linha do BD buscando pelo id(PK).
											 // O primeiro argumento é a classe (entidade) que representa a tabela.
											 // O segundo argumento é o id da linha que eu desejo recuperar.		
		System.out.println(p);
		System.out.println("Pronto!");	
		emf.close();
		em.close();
	}
}