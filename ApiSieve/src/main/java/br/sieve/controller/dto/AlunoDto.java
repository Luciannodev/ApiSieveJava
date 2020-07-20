package br.sieve.controller.dto;

import java.util.List;
import java.util.stream.Collectors;



import br.sieve.model.Aluno;

public class AlunoDto {
	String nome;
	int idade;
	String sexo;
	double renda;

	public AlunoDto(Aluno aluno) {
		this.nome = aluno.getNome();
		this.idade = aluno.getIdade();
		this.sexo = aluno.getSexo();
		this.renda = aluno.getRenda();
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public double getRenda() {
		return renda;
	}

	public static List<AlunoDto> converter(List<Aluno> alunos) {
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}

}
