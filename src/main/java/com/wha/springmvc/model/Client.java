package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@DiscriminatorValue("Client")
 
public class Client extends User implements Serializable{
	
	private String matricule;
	private String psw;
	private Date dateAffectation;
	private int nbEnfant;
	private String situation;
	private Double salaire;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
	private Collection<Compte> cptes; 
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
	private Collection<Notification> notifs; 
	
	@OneToMany(cascade={CascadeType.ALL},mappedBy="client")
	private Collection<DemandeClient> demandeClients; 
	
	@ManyToOne
	private Conseiller conseiller;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Guest guests;

	
	
	public Client () {
		super();
		this.cptes = new ArrayList<Compte>();
		this.demandeClients = new ArrayList<DemandeClient>();
		this.notifs = new ArrayList<Notification>();
	}
	
	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public int getNbEnfant() {
		return nbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}



	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Collection<Compte> getCptes() {
		return cptes;
	}

	public void setCptes(Collection<Compte> cptes) {
		this.cptes = cptes;
	}

	public Collection<DemandeClient> getDemandeClients() {
		return demandeClients;
	}

	public void setDemandeClients(Collection<DemandeClient> demandeClients) {
		this.demandeClients = demandeClients;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Guest getGuests() {
		return guests;
	}

	public void setGuests(Guest guests) {
		this.guests = guests;
	}
	
	
	
}
	
	
	
	
	
	