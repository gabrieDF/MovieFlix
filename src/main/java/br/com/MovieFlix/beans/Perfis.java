package br.com.MovieFlix.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Contratantes")
public class Perfis {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=80)
	private String nome;
	
	@Column(name="email", length=80)
	private String email;
	
	@Column(name="Telefone", length=80)
	private int telefone;
	
	@Column(name="CPF", length=80)
	private int cpf;
	
	@Column(name="CEP", length=80)
	private int cep;
	
	@Column(name="Senha", length=80)
	private int senha;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
