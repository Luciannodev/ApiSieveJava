package br.sieve.controller;

import br.sieve.model.Aluno;

public class AlunoForm {
	String nome;
	String senha;
	int idade;
	String sexo;
	double renda;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public Aluno converter() {
		
		return new Aluno(nome, senha, idade, sexo, renda);
	}
	
}
