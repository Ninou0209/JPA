/* IST & CC CLOSSET Marine LENOIR Guillaume */ 
package com.example.JPATest;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorColumn(name="CategoryVehicule" , discriminatorType=DiscriminatorType.STRING)

public abstract class Vehicule {

	/* ----------------------------------Declarations-------------------------------*/
	
	protected long plateNumber;
	private Collection<Rent> rent = new ArrayList<Rent>();
	
	/*-----------------------------------Constructeur------------------------------*/ 
	
	public Vehicule() {
		super();
	}
	
	public Vehicule(long plateNumber) {
		super();
		this.plateNumber = plateNumber;
	}
	
	
	/* ------------------------------Acces en lecture et ecriture-------------------*/
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="vehicule")
	public Collection<Rent> getRent() {
		return rent;
	}
	
	public void setRent(Collection<Rent> rent) {
		this.rent = rent;
	}

	@Id
	public long getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(long plateNumber) {
		this.plateNumber = plateNumber;
	}

	
	
	

}
