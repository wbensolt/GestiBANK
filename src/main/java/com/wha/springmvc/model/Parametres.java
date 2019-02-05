package com.wha.springmvc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parametres implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private long id;
	
	double SeuilRemenunre;
	double taux;
	double tauxAgios;
	double plafondLivret;
	double tauxMoyen;
	
	
	
	public Parametres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSeuilRemenunre() {
		return SeuilRemenunre;
	}
	public void setSeuilRemenunre(double seuilRemenunre) {
		SeuilRemenunre = seuilRemenunre;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getTauxAgios() {
		return tauxAgios;
	}
	public void setTauxAgios(double tauxAgios) {
		this.tauxAgios = tauxAgios;
	}
	public double getPlafondLivret() {
		return plafondLivret;
	}
	public void setPlafondLivret(double plafondLivret) {
		this.plafondLivret = plafondLivret;
	}
	public double getTauxMoyen() {
		return tauxMoyen;
	}
	public void setTauxMoyen(double tauxMoyen) {
		this.tauxMoyen = tauxMoyen;
	}
	
	

}
