package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Livret")

public class Livret extends Compte implements Serializable{
	
	private Date dateCalculInteret;
	

	public Livret() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livret(Date dateCalculInteret) {
		super();
		
		this.dateCalculInteret = dateCalculInteret;
	}
	
		
	//getters et setters

	public Date getDateCalculInteret() {
		return dateCalculInteret;
	}
	public void setDateCalculInteret(Date dateCalculInteret) {
		this.dateCalculInteret = dateCalculInteret;
	}
	
	
}
