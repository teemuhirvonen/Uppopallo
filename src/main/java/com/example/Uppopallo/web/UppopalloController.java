package com.example.Uppopallo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Uppopallo.domain.PelaajaRepository;

@Controller
public class UppopalloController {
	
	@Autowired
	private PelaajaRepository repository;
	
	@RequestMapping(value="/pelaajalista", method=RequestMethod.GET)
	public String Uppopallo(Model model) {
		model.addAttribute("pelaaja", repository.findAll());
		return "pelaajalista";
	}
}