
package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Conseiller")

public class Conseiller extends User implements Serializable {

	private String pseudo;
	private String psw;

	private int matricule;
	private Date dateContrat;

	@ManyToOne
	private Administrateur administrateur;

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "conseiller")
	private Collection<Client> clients;

	public Conseiller() {
		super();
		this.clients = new ArrayList<Client>();
	}

	public Conseiller(int matricule, Date dateContrat) {
		this.clients = new ArrayList<Client>();
		this.matricule = matricule;
		this.dateContrat = dateContrat;

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

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

}
