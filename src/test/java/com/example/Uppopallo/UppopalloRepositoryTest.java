package com.example.Uppopallo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Uppopallo.domain.Joukkue;
import com.example.Uppopallo.domain.Pelaaja;
import com.example.Uppopallo.domain.PelaajaRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UppopalloRepositoryTest {

	    @Autowired
	    private PelaajaRepository repository;

	    @Test
	    public void findByTitleShouldReturnBook() {
	        List<Pelaaja> pelaaja = repository.findByNimi("Mikko Mallikas");
	        assertThat(pelaaja).hasSize(1);
	        assertThat(pelaaja.get(0).getPelinumero()).isEqualTo(12);
	    }
	    
	    @Test
	    public void createNewTodo() {
	    	Pelaaja pelaaja = new Pelaaja("Testi henkilö", 0, 0, 0, 0, new Joukkue("PSK Kupla"));
	    	repository.save(pelaaja);
	    	assertThat(pelaaja.getId()).isNotNull();
	    }
	
}
