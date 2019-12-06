/* IST & CC CLOSSET Marine LENOIR Guillaume */ 
package com.example.JPATest;

import com.example.JPATest.Vehicule;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {
	
	/* ----------------------------------Declarations-------------------------------*/
	
	private int maxWeight;

	/*-----------------------------------Constructeur------------------------------*/ 
	
	public Van(long plateNumber, int maxWeight) {
		super(plateNumber);
		this.maxWeight = maxWeight;
	}

	public Van() {
		super();
	}
	
	/* ------------------------------Acces en lecture et ecriture-------------------*/
	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
}
