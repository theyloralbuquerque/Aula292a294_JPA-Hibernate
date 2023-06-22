package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Define a classe como uma tabela no BD.
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id // Define id como uma coluna PK no BD. 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Define a coluna id como autoincrementável no BD.
	private Integer id;
	private String nome;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
}