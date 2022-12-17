package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {
	
	Boolean existsByEmail(String email);
	
	
	
	
}
