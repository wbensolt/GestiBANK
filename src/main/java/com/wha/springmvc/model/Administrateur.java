package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//ceci est un test
@Entity
@DiscriminatorValue("Admin")
public class Administrateur extends User implements Serializable{

	
	private String pseudo;
	private String psw;
	
	private int matricule ;

	private Date dateContrat;

	@OneToMany(cascade={CascadeType.ALL},mappedBy="administrateur")
	private Collection<Guest> guest;

	@OneToMany(cascade={CascadeType.ALL},mappedBy="administrateur")
	private Collection<Conseiller> conseillers;

	
	public Administrateur (){
		super();
		this.guest = new ArrayList<Guest>();
		this.conseillers = new ArrayList<Conseiller>();
	}



	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public Collection<Guest> getGuest() {
		return guest;
	}

	public void setGuest(Collection<Guest> guest) {
		this.guest = guest;
	}

	public Collection<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}




}