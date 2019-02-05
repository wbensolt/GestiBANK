package com.wha.springmvc.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DemandeChequier")
public class DemandeChequier extends DemandeClient implements Serializable {

	private String ObjetChequier;
	public DemandeChequier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
