package br.sieve.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.sieve.controller.dto.AlunoDto;
import br.sieve.model.Aluno;
import br.sieve.repository.AlunosRepository;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

	@Autowired
	private AlunosRepository alunosRepository;

	@PostMapping
	public void cadastrar(@RequestBody AlunoForm form) {
		Aluno aluno = form.converter();
		alunosRepository.save(aluno);
	}

	@GetMapping
	public List<AlunoDto> listar() {
		List<Aluno> alunos = alunosRepository.findAll();
		return AlunoDto.converter(alunos);
	}
	
	@GetMapping("/{id}")
	public AlunoDto detalhar(@PathVariable Long id) {
		Optional<Aluno> aluno = alunosRepository.findById(id);
		return  new AlunoDto(aluno.get());
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<AlunoDto> atualizar(@PathVariable Long id,@RequestBody AttAlunoForm form) {
		Aluno aluno = form.atualizar(id, alunosRepository);
		return ResponseEntity.ok(new AlunoDto(aluno));
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		alunosRepository.deleteById(id);
	}
}
