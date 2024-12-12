/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me 1 random number");
		int a = sc.nextInt();
		System.out.println("Give me 1 random number");
		int b = sc.nextInt();
		System.out.println("Give me 1 random number");
		int c = sc.nextInt();
		if (a > c && a > b) {
			System.out.println("The first number is the largest");
		}
		else if (b > a && b > c) {
			System.out.println("The second number is the largest");
		}
		else if (c > a && c > b) {
			System.out.println("The third number is the largest");
		}
		else {
			System.out.println("C is not an integer");
		}

		
		
		
		
	
	}
}
