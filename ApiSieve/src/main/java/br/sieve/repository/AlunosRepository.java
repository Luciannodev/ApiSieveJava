package br.sieve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sieve.model.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long>{

}
