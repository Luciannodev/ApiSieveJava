package br.sieve.controller;

import br.sieve.model.Aluno;
import br.sieve.repository.AlunosRepository;

public class AttAlunoForm {
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

	public Aluno atualizar(Long id, AlunosRepository alunosRepository) {
		Aluno aluno = alunosRepository.getOne(id);
		if(nome!=null) {
			aluno.setNome(nome);
		};
		if(senha!=null) {
			aluno.setSenha(senha);
		};
		if(idade!=0) {
			aluno.setIdade(idade);
		};
		if(renda!=0) {
			aluno.setRenda(renda);;
		};
		if(sexo!=null) {
			aluno.setSexo(sexo);;
		};
	
		return aluno;
	}
}
