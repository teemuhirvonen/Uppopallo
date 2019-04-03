package com.example.Uppopallo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Uppopallo.domain.Pelaaja;
import com.example.Uppopallo.domain.PelaajaRepository;

@SpringBootApplication
public class UppopalloApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppopalloApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PelaajaRepository repository) {
	return (args) -> {
	Pelaaja pelaaja = new Pelaaja("Mikko Mallikas", 12, 4, 2, 6);
	repository.save(pelaaja);
	pelaaja = new Pelaaja("Risto Reipas", 10, 2, 6, 8);
	repository.save(pelaaja);
	};
	}

}
