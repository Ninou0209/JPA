/* IST & CC CLOSSET Marine LENOIR Guillaume */ 
package com.example.JPATest;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {
	
	/* ----------------------------------Declarations-------------------------------*/
	
	private int numberOfSeats;
	
	/*-----------------------------------Constructeur------------------------------*/ 
	
	public Car() {
		super();
	}
	
	public Car(long plateNumber, int numberOfSeats) {
		super(plateNumber);
		this.numberOfSeats = numberOfSeats;
	}

	/* ------------------------------Acces en lecture et ecriture-------------------*/
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	

}