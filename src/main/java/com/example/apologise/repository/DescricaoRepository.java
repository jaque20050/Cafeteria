package com.example.apologise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescricaoRepository extends JpaRepository<DescricaoRepository, Long>{
	
	public List<DescricaoRepository>findAllByDescricaoContainingIgnoreCase(String descricao);
}
