package com.example.Uppopallo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Joukkue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long joukkueid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="joukkue")
			private List<Pelaaja> pelaaja;

	
	public Joukkue() {
		
	}
	
	public Joukkue(String name) {
		this.name = name;
	}
	
	public long getJoukkueid() {
		return joukkueid;
	}
	public void setJoukkueid(long joukkueid) {
		this.joukkueid = joukkueid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public List<Pelaaja> getPelaaja() {
		return pelaaja;
	}

	public void setPelaaja(List<Pelaaja> pelaaja) {
		this.pelaaja = pelaaja;
	}

	@Override
	public String toString() {
		return "joukkueid" + joukkueid + ", name=" + name;
	}
	
	
	
}

