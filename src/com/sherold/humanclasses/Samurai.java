package com.sherold.humanclasses;

public class Samurai extends Human {
	// <----- Attributes ----->
	// List is needed to count Samurai numbers.
	private static int numberOfSamurai;
	
	// <----- Constructors ----->
	// Samurai start with 200 health
	public Samurai() {
		health = 200;
		numberOfSamurai++;
	}
	
	// <----- Methods ----->
	// Sets target Human's health to 0, and reduces Samurai health by 1/2
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = this.health / 2;
	}
	
	// Adds 1/2 of Samuri's current health, to the Samurai's total health
	public void meditate() {
		health += health / 2;
	}
	
	// Displays numberOfSamurai
	public static int howMany() {
		return numberOfSamurai;
	}
}
