package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity (name="COMPTE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISC_COMPTE" , discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Compte")



public class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private int id;
	private String rib;
	private Date dateOuvertureCpte;
	private String typeCpte;
	private String deviseCpte;
	private double soldeCpte;
	
	@ManyToOne
	private Client client;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="compte")
	private Collection<Operation> operations; 


	public Compte() {
		super();
		this.operations = new ArrayList<Operation>();
	}
	

	public Compte(int id, String rib, Date dateOuvertureCpte, String typeCpte, String deviseCpte, double soldeCpte) {
		super();
		this.id = id;
		this.rib = rib;
		this.dateOuvertureCpte = dateOuvertureCpte;
		this.typeCpte = typeCpte;
		this.deviseCpte = deviseCpte;
		this.soldeCpte = soldeCpte;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public Date getDateOuvertureCpte() {
		return dateOuvertureCpte;
	}
	public void setDateOuvertureCpte(Date dateOuvertureCpte) {
		this.dateOuvertureCpte = dateOuvertureCpte;
	}
	public String getTypeCpte() {
		return typeCpte;
	}
	public void setTypeCpte(String typeCpte) {
		this.typeCpte = typeCpte;
	}
	public String getDeviseCpte() {
		return deviseCpte;
	}
	public void setDeviseCpte(String deviseCpte) {
		this.deviseCpte = deviseCpte;
	}
	public double getSoldeCpte() {
		return soldeCpte;
	}
	public void setSoldeCpte(double soldeCpte) {
		this.soldeCpte = soldeCpte;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	
	

}
