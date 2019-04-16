package com.example.Uppopallo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Uppopallo.domain.JoukkueRepository;
import com.example.Uppopallo.domain.Pelaaja;
import com.example.Uppopallo.domain.PelaajaRepository;

@Controller
public class UppopalloController {
	
	@Autowired
	private PelaajaRepository repository;
	
	@Autowired
	private JoukkueRepository jrepository;
	
	//Sisään kirjautuminen
	@RequestMapping(value="/login")
	public String login() {	
	    return "login";
	}
	
	//Etusivu
	@RequestMapping(value="/pelaajalista", method=RequestMethod.GET)
	public String Uppopallo(Model model) {
		model.addAttribute("pelaaja", repository.findAll());
		return "pelaajalista";
	}
	
	//Lisää pelaaja
	@RequestMapping(value = "/add")
	public String addPelaaja(Model model){
	model.addAttribute("pelaaja", new Pelaaja());
	model.addAttribute("joukkue", jrepository.findAll());
	return "lisaapelaaja";
	}
	
	//Tallennus
	@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String save(Pelaaja pelaaja){
		repository.save(pelaaja);
		return "redirect:pelaajalista";
	}
	
	//Poisto
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable("id") Long pelaajaId, Model model) {
	repository.deleteById(pelaajaId);
	return "redirect:../pelaajalista";
	}
	
	//Muokkaus
	@RequestMapping(value = "/edit/{id}")
	public String addBook(@PathVariable("id") Long pelaajaId, Model model){
		model.addAttribute("pelaaja", repository.findById(pelaajaId));
		model.addAttribute("joukkue", jrepository.findAll());
		return "muokkaapelaaja";
	}
}