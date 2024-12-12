/*
 *	Author:  Andre Sookazian
 *  Date: 10/1/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Hello user, please choose a number from 1 to a 1000. This is a guessing game.");
		
		Scanner sc = new Scanner(System.in);
		
		int guess = sc.nextInt();
		
		int special = (int) (Math.random()*1000);
		
		while (guess!=special) {
			
				if (guess>special) {
					System.out.println(guess + " is greater than the answer, " + special);
				}
				if (guess<special) {
					System.out.println(guess + " is less than the answer, " + special);
				}
			if (guess==special) { 
				System.out.println("You are correct! The game is done!");
			}
			System.out.println("You are not correct. Try again.");
				guess = sc.nextInt();
			
		}
		
		



		
	}
}
