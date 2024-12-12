/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue.");
	
	String answer1 = sc.nextLine();
	
	String a = new String("Wizard");
	String b = new String("Warrior");
	String c = new String("Rogue");
	String d = new String("wizard");
	String e = new String("warrior");
     String g = new String("rogue");
	if(a.equals(answer1)) {
		System.out.println("You are a Wizard! You need to use your magic to cure the people !");
	}
	
	else if(b.equals(answer1)) {
		System.out.println("You are a Warrior! Attack the enemies!");
	}
	
	else if(c.equals(answer1)) {
		System.out.println("You are a Rogue! Help the King through the maze");
	}
	else if(d.equals(answer1)) {
		System.out.println("You are a Wizard! You need to use your magic to cure the people !");
	}
	else if(e.equals(answer1)) {
		System.out.println("You are a Warrior! Attack the enemies!");
	}
	else if(g.equals(answer1)) {
		System.out.println("You are a Rogue! Help the King through the maze");
	}
	else {
		System.out.println("You have not typed in a role! Wrong input!");
	}
	}
}
