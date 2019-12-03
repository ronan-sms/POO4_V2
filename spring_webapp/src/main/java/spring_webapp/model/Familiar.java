package spring_webapp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Familiar {
	@NotNull(message="Obrigatório")
	@NotBlank(message="Obrigatório")
	private String nome;
	private String genero;
	@NotNull(message="Obrigatório")
	@Min(value=18, message="Não pode ser menor que 18")
	@Max(value=120, message="Não pode ser maior que 120")
	private int idade;
	private String servicos;
	
	
	public Familiar() {
		super();
	}
	
	
	public Familiar(String nome, String genero, int idade, String servicos) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.servicos = servicos;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getServicos() {
		return servicos;
	}
	public void setServicos(String servicos) {
		this.servicos = servicos;
	}
	
	
	
}
