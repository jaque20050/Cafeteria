package com.example.apologise.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apologise.model.Cafe;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long>{
	
	public List<Cafe>findAllByCafeContainingIgnoreCase(String cafe);
}
