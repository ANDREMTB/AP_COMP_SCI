/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello user, is it raining today? If yes, type 1, if no, type 2");
	int answer1 = sc.nextInt();
	if (answer1==1) {
		System.out.println("Bring an umbrella"); 
		
	}
	if (answer1==2) {
		System.out.println("Bring suncreen");
	}
	System.out.println("Select and type a number in between 1 and 1000 ");
    int a = sc.nextInt();
    int b = (int)(Math.random()*999) +1; 
	
	if (a==b) {
		System.out.println("You are correct!");
	}
	if (a!=b) {
		System.out.println("You are not correct! Try again!");
		System.out.println("The answer is " + b);
	}
	}
}
