package com.ads.ava3.model;

import java.util.Date;

public class Cliente {
	
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	private String endereco;
	private String cidade;
	private String estado;
	private Date dataDoCadastro;
	
	
	public Cliente() {
	}


	public Cliente(Long id, String nome, String cpf, String telefone, String email, String endereco, String cidade,
			String estado, Date dataDoCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.dataDoCadastro = dataDoCadastro;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Date getDataDoCadastro() {
		return dataDoCadastro;
	}


	public void setDataDoCadastro(Date dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}


	
	
	
	
}
