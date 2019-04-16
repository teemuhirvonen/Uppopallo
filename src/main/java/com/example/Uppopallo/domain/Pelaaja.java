package com.example.Uppopallo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pelaaja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	public String nimi;
	public int pelinumero, maalit, syotot, pisteet;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "joukkueid")
	private Joukkue joukkue;
	
	public Pelaaja() {
		
	}
	
	public Pelaaja(String nimi,int pelinumero,int maalit,int syotot,int pisteet, Joukkue joukkue) {
		super();
		this.nimi = nimi;
		this.pelinumero = pelinumero;
		this.maalit = maalit;
		this.syotot = syotot;
		this.pisteet = pisteet;
		this.joukkue = joukkue;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getPelinumero() {
		return pelinumero;
	}

	public void setPelinumero(int pelinumero) {
		this.pelinumero = pelinumero;
	}

	public int getMaalit() {
		return maalit;
	}

	public void setMaalit(int maalit) {
		this.maalit = maalit;
	}

	public int getSyotot() {
		return syotot;
	}

	public void setSyotot(int syotot) {
		this.syotot = syotot;
	}

	public int getPisteet() {
		return pisteet;
	}

	public void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}

	public Joukkue getJoukkue() {
		return joukkue;
	}

	public void setJoukkue(Joukkue joukkue) {
		this.joukkue = joukkue;
	}

	@Override
	public String toString() {
		if (this.joukkue != null) {
			return "Pelaaja id = " + id + "joukkue" + this.getJoukkue();
		}
	return "Pelaaja id" + id;
	}

}
