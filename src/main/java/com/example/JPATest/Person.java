/* IST & CC CLOSSET Marine LENOIR Guillaume */ 
package com.example.JPATest;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	/* ----------------------------------Declarations-------------------------------*/
	
	private String name;
	private long id;
	private Collection<Rent> rent = new ArrayList<Rent>();
	
	/*-----------------------------------Constructeur------------------------------*/ 
	
	public Person() {
		super();
		
	}

	public Person(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	} 
	
	/* ------------------------------Acces en lecture et ecriture-------------------*/
	
	@OneToMany(mappedBy="person")
	public Collection<Rent> getRent() {
		return rent;
	}

	public void setRent(Collection<Rent> rent) {
		this.rent = rent;
	}

	@Id
	/* if we want use an id aléatoire */ 
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/ 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
