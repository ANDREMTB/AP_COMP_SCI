/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
			public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What would you like your character to be named?");
	String Name = sc.nextLine();

	System.out.println("What would you like your Main Title to be?");
	String Title = sc.nextLine();
	
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue.");
	
	String position = sc.nextLine();
	
	if (position.equals("Wizard")) {
		System.out.println("You are a wizard! Use your magic to entertain the city!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else if (position.equals("Warrior")) {
		System.out.println("You are a Warrior! Attack the enemy!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else if (position.equals("Rogue")) {
		System.out.println("You are a Rogue! Use your strategic mind to create a new battle plan!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else if (position.equals("wizard")) {
		System.out.println("You are a wizard! Use your magic to entertain the city!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else if (position.equals("warrior")) {
		System.out.println("You are a Warrior! Attack the enemy!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else if (position.equals("rogue")) {
		System.out.println("You are a Rogue! Use your strategic mind to create a new battle plan!");
			System.out.println("Now that you have chosen your role, you have options to upgrade your traits: Strength, Dexterity, Intelligence, Charisma");
	System.out.println("You have 20 coins to spend on these traits, choose wisely!");
	System.out.println("Choose how many coins to use for Strength");
	}
	else {
		System.out.println(" Restart Please select a given role");
	}
    
	
	
	int coins = 20;
	
	
	int Strength = sc.nextInt();
	
	if (Strength>10 && coins>0) {
		System.out.println("Select a number of coins to spend that is less than or equal to 10");
		Strength = sc.nextInt();
	}
	
	
	coins = (coins - Strength);
	System.out.println("You now have " + coins + " coins left to spend.");
	
	
	System.out.println("Choose how many coins you would like to use for Dexterity now.");
	int Dexterity = sc.nextInt();
	
	if (Dexterity>10) {
		System.out.println("Please select a number of coins to spend that is less than or equal to 10.");
		Dexterity = sc.nextInt();
	}
	coins = (coins - Dexterity);
	 if (Dexterity>coins) {
		System.out.println("You do not have enough coins to buy" + Dexterity + "Dexterity points");
	}
	
	System.out.println("You have " + coins + " coins left to spend.");
	
	if (coins>0) {
		System.out.println("Choose how many coins to use for Intelligence.");
	}
	int Intelligence = sc.nextInt();
	
	if (Intelligence>10 && coins>0) {
		System.out.println("Please select a number of coins to spend that is less than or equal to 10.");
		Intelligence = sc.nextInt();
	}
	else if (Intelligence>coins) {
		System.out.println("You do not have enough coins to buy " + Intelligence + " Intelligence points");
		System.out.println("Please choose a number of coins to spend that you have");
	}
	coins = (coins-Intelligence);
	if (coins>=0) {
		
		System.out.println("You now have " + coins + " remaining");
		System.out.println("How many coins would you like to spend on Charisma?");
	}
	
	
	
	int Charisma = sc.nextInt();
	if (Charisma>10 && coins>0) {
		System.out.println("Please select a number of coins to spend that is less than or equal to 10");
		Charisma = sc.nextInt();
	}
	
	 else if (Charisma>coins) {
		System.out.println("You do not have enough coins to buy " + Charisma + " Charisma points");
		System.out.println("Choose a number of coins to use that you have");
	}

	
	coins = (coins - Charisma);
	
	
		
	
	if (coins>=0) {
		System.out.println("You now have " + coins + " coins remaining");
		System.out.println("Your name is " + Name);
		System.out.println("Your Title is " + Title);
		System.out.println("Your Role is a " + position + "!");
	System.out.println("Thank you for playing, user!");
	}
	

		BaseClass test = new BaseClass();


		
	}
}
