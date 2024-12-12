/*
 *	Author:  Andre Sookazian
 *  Date:10/24/24
*/


package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	String role; 

	public MyCharacter() {
		role = "no role"; 
		
		
	}
		public String yay(String a){
 role = a;
 if (role.equals("Rogue") || role.equals("rogue")) {
 	System.out.println("You are a sneaky person. ");
 	return role; 
 	
 }
   if (role.equals("Wizard") || role.equals("wizard")) {
 	System.out.println("Use your magic and potions to heal the city");
 	return role; 
 }
  if (role.equals("Warrior") || role.equals("warrior")) {
 	System.out.println("You are a warrior, so fight the enemies and attack the opposing empire!");
 return role; 
 }
 else {
 	System.out.println("This is not a real response, please try again.");
 	
 }
 return role;
} 
public void myToString(String f, int x, int y, int l, int b, int r) {
System.out.println("Your role is " + f);
System.out.println("Your strength trait is " + x);
System.out.println("Your dexterity trait is " + y);
System.out.println("Your intelligence trait is " + l);
System.out.println("Your constitution trait is " + b);
System.out.println("Your charisma trait is " + r);
}
}