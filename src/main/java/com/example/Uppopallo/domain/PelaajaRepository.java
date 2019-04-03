package com.example.Uppopallo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PelaajaRepository extends CrudRepository<Pelaaja, Long> {
	
	List<Pelaaja> findByNimi(String Nimi);
	
}
