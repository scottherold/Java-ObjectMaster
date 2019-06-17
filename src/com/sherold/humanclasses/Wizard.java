package com.sherold.humanclasses;

public class Wizard extends Human {
	// <----- Constructors ----->

	// Wizards have 50 health and 8 intelligence
	public Wizard() {
		intelligence = 8;
		health = 50;
	}
	
	// <----- Methods ----->
	// Heals a Human target in the amount of the Wizard's intelligence
	public void health(Human target) {
		target.health += this.intelligence;
	}
	
	// Reduces a Human target's health by 3x the Wizard's intelligence
	public void fireball(Human target) {
		target.health -= this.intelligence * 3;
	}

}
