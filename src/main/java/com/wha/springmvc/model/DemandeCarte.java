package com.wha.springmvc.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DemandeCarte")
public class DemandeCarte extends DemandeClient implements Serializable{

	private String ObjetCarte;
	
	public DemandeCarte() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
