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
	@DiscriminatorValue("CpteCourant")

	public class CompteCourant extends Compte implements Serializable{
		
		private double decouvertAutorise;
		private double debitAutorise;
		
//		//permet de faire le lien avec la cle etrangere dans l'entité compte
//		@OneToOne(mappedBy="Compte")
//		private Compte compte;
//		
		public CompteCourant() {
			super();
			// TODO Auto-generated constructor stub
		}
		
				
		public CompteCourant(double decouvertAutorise, double debitAutorise) {
			super();
			
			this.decouvertAutorise = decouvertAutorise;
			this.debitAutorise = debitAutorise;
		}
		//getters et setters
		
		public double getDecouvertAutorise() {
			return decouvertAutorise;
		}

		public void setDecouvertAutorise(double decouvertAutorise) {
			this.decouvertAutorise = decouvertAutorise;
		}

		public double getDebitAutorise() {
			return debitAutorise;
		}

		public void setDebitAutorise(double debitAutorise) {
			this.debitAutorise = debitAutorise;
		}
		
		
		
		
		
		
		
		
	}


