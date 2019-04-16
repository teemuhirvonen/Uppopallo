package com.example.Uppopallo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.example.Uppopallo.domain.User;
import com.example.Uppopallo.domain.Joukkue;
import com.example.Uppopallo.domain.JoukkueRepository;
import com.example.Uppopallo.domain.Pelaaja;
import com.example.Uppopallo.domain.PelaajaRepository;
import com.example.Uppopallo.domain.UserRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class UppopalloApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UppopalloApplication.class);
		}
	public static void main(String[] args) {
		SpringApplication.run(UppopalloApplication.class, args);
	}
	
	
	//Valmiiksi syötetty tieto luokkiin
	@Bean
	public CommandLineRunner demo(PelaajaRepository repository, JoukkueRepository jrepository, UserRepository urepository) {
	return (args) -> {
	Joukkue joukkue = new Joukkue("Riihimäen Urheilusukeltajat");
	jrepository.save(joukkue);
	joukkue = new Joukkue("Hämeenlinnan Urheilusukeltajat");
	jrepository.save(joukkue);
	joukkue = new Joukkue("Tampereen Urheilusukeltajat");
	jrepository.save(joukkue);
	joukkue = new Joukkue("West Coast UWR");
	jrepository.save(joukkue);
	joukkue = new Joukkue("Urheilusukeltajat");
	jrepository.save(joukkue);
	joukkue = new Joukkue("PSK Kupla");
	jrepository.save(joukkue);	
		
	Pelaaja pelaaja = new Pelaaja("Mikko Mallikas", 12, 4, 2, 6, jrepository.findByName("Riihimäen Urheilusukeltajat").get(0));
	repository.save(pelaaja);
	pelaaja = new Pelaaja("Risto Reipas", 10, 2, 6, 8, jrepository.findByName("PSK Kupla").get(0));
	repository.save(pelaaja);
	
	User user1 = new User("user","$2a$10$JsrwDHAsuTskZmFYLDPPWeEx8xWnRciC8zCTau5xWZacx9Avo1kFe", "USER");
	User user2 = new User("admin","$2a$10$JsrwDHAsuTskZmFYLDPPWeEx8xWnRciC8zCTau5xWZacx9Avo1kFe", "ADMIN");
	urepository.save(user1);
	urepository.save(user2);
	};
	}

}
