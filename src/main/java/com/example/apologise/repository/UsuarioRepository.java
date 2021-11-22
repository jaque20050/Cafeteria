package com.example.apologise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Long>{
	
	public List<UsuarioRepository>findAllUsuarioContainingIgnoreCase(String usuario);
}
