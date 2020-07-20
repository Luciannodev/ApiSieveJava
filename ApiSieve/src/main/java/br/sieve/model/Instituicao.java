package br.sieve.model;

import java.util.ArrayList;

public class Instituicao {
	String nome;
	ArrayList<Curso>cursos = new ArrayList<Curso>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
