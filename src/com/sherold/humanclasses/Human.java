package com.sherold.humanclasses;

public class Human {
	// <----- Attributes ----->
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	// <----- Constructors ----->
	// Default Human
	public Human() {
		strength = 3;
		intelligence = 3;
		stealth = 3;
		health = 100;		
	}
	
	// <----- Methods ----->
	// Displays health
	public void displayHealth() {
		System.out.println("Current health is: " + health);
	}
	
	// Attacks another Human target
	public void attack(Human target) {
		target.health -= this.strength;
	}
}
