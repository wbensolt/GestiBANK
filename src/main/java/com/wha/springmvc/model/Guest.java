package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
@DiscriminatorValue("Guest")
//messagetest
public class Guest extends User implements Serializable{
		
	private Date dateDemande;
	private String status;
	
	@OneToOne(cascade=CascadeType.PERSIST,mappedBy="guest")
	private Documents docs;
	
	@OneToOne(mappedBy="guests")
	private Client client;
	@ManyToOne
	private Administrateur administrateur;
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public Documents getDocs() {
		return docs;
	}

	public void setDocs(Documents docs) {
		this.docs = docs;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}