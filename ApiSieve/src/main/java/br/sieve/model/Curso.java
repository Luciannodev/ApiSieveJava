package br.sieve.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Curso {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	long id;
	String nome;
	String descricao;
	@OneToMany(mappedBy = "curso")
	List<Aluno> alunos = new ArrayList<>();
	@OneToOne
	Prova prova;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Prova getProvas() {
		return prova;
	}

	public void setProvas(Prova prova) {
		this.prova = prova;
	}

}
