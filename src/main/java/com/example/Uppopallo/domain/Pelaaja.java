package com.example.Uppopallo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelaaja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String nimi;
	int pelinumero, maalit, syotot, pisteet;
	
	public Pelaaja() {
		
	}
	
	public Pelaaja(String nimi,int pelinumero,int maalit,int syotot,int pisteet) {
		this.nimi = nimi;
		this.pelinumero = pelinumero;
		this.maalit = maalit;
		this.syotot = syotot;
		this.pisteet = pisteet;
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

	@Override
	public String toString() {
	return "Pelaaja id= " + id + ", Nimi= " + nimi;
	}

}
