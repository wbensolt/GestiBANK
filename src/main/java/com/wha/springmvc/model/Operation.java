package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="OPERATION")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("operation")
public class Operation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private int id;
	private double montant;
	private Date dateEffetOperation;
	private String libelle;
	private String ribDestinataire;
	
	@ManyToOne
	private Compte compte;
	
	@OneToOne(cascade=CascadeType.PERSIST,mappedBy="operation")
	private Notification notif;
	


	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(int id, double montant, Date dateEffetOperation, String libelle, String ribDestinataire) {
		super();
		this.id = id;
		this.montant = montant;
		this.dateEffetOperation = dateEffetOperation;
		this.libelle = libelle;
		this.ribDestinataire = ribDestinataire;
	}

	//getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateEffetOperation() {
		return dateEffetOperation;
	}

	public void setDateEffetOperation(Date dateEffetOperation) {
		this.dateEffetOperation = dateEffetOperation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRibDestinataire() {
		return ribDestinataire;
	}

	public void setRibDestinataire(String ribDestinataire) {
		this.ribDestinataire = ribDestinataire;
	}


		
	
	

}
