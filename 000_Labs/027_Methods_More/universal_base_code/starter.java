/*
 *	Author:  
 *  Date: 
*/


import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("You do not have a role, user. Would you like to be a rogue, warrior, or wizard in the empire.");
		Character test = new Character();
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		
		
		
		
		
		if (!character.equals("Rogue") && (!character.equals("Warrior") && (!character.equals("Wizard") && (!character.equals("wizard") && (!character.equals("rogue") && (!character.equals("warrior"))))))) {
			System.out.println("That is not a valid response. ");
		}
		
		
		if (character.equals("Rogue") || (character.equals("rogue")))  {
			System.out.println("You are now a " + character);
			test.myToString("Rogue", 5, 6, 7 , 8, 9);
		}
		if ((character.equals("Warrior") || (character.equals("warrior"))))  {
			System.out.println("You are now a " + character);
			test.myToString("Warrior", 8, 9, 10 , 11, 12);
		}
		if ((character.equals("Wizard") || (character.equals("wizard"))))  {
			System.out.println("You are now a " + character);
			test.myToString("Wizard", 10, 1, 0 , 12, 5);
		}
		
	}
}
