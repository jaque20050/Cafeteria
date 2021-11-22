package com.example.apologise.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apologise.model.Cafe;
import com.example.apologise.repository.CafeRepository;

@RestController
@RequestMapping("/cafe")
@CrossOrigin("*")
public class CafeController {
	
	@Autowired
	private CafeRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cafe>>bucarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cafe>buscarPorId(@PathVariable(value = "id")Long id){
		return ResponseEntity.status(200).body(repository.findById(id).get());
	}
	@GetMapping("/cafe/{cafe}")
	public ResponseEntity<List<Cafe>> buscarPorCafePreto(@PathVariable String cafePreto) {
		return ResponseEntity.ok(repository.findAllByCafeContainingIgnoreCase(cafePreto));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
