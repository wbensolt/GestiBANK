package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Documents implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private long id;
	
	ArrayList<String> docs;

	@OneToOne
	private Guest guest;
	
	public Documents() {
		super();
		docs = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getDocs() {
		return docs;
	}

	public void setDocs(ArrayList<String> docs) {
		docs = docs;
	}

}
