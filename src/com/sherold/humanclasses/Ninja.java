package com.sherold.humanclasses;

public class Ninja extends Human {
	// <----- Constructors ----->
	
	// Ninja must have 10 stealth, instead of 3
	public Ninja() {
		stealth = 10;
	}
	
	// <----- Methods ----->
	
	// Attacks a Human target by stealth
	public void steal(Human target) {
		target.health -= this.stealth;
		this.health += this.stealth; 
	}
	
	// Runs away and reduces Ninja health by 10
	public void runAway() {
		health -= 10;
	}

}
