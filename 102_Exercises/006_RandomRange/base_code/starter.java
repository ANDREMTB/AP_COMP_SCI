/*
 *	Author: Andre Sookazian
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int text = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int number = sc.nextInt();
		System.out.println("Your range is " + text + " to " + number);
		System.out.println("Here are 5 number generated in that range.");
		System.out.print(Math.random()*number + text); 	System.out.print(" , ");	System.out.print(Math.random()*number + text); 	System.out.print(" , ");	System.out.print(Math.random()*number + text); 	System.out.print(" , ");	System.out.print(Math.random()*number + text); 	System.out.print(" , ");	System.out.print(Math.random()*number + text); 	System.out.print(" , ");	System.out.print(Math.random()*number + text);
		
	
	
		
		
	}
}
