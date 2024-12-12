/*
 *	Author:Andre Sookazian
 *  Date:9/27/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number.");
	int a = sc.nextInt();
	System.out.println("Please enter a second number.");
	int b = sc.nextInt();
	if (a%2==0) {
		System.out.println(a + " is even");
	}
	else {
		System.out.println(a + " is odd");
	}
	if (b%2==0) {
		System.out.println(b + " is even");
	}
	else {
		System.out.println(b + " is odd");
	}
		if (a%3==0) {
			System.out.println(a + " is divisible by 3");
		}
		if (a%4==0) {
			System.out.println(a + " is divisible by 4");
		}
		if (a%5==0) {
			System.out.println(a + " is divisible by 5");
		}
		
		if (a%3!=0) {
			System.out.println(a + " is not divisible by 3");
		}
		if (a%4!=0) {
			System.out.println(a + " is not divisible by 4");
		}
		if (a%5!=0) {
			System.out.println(a + " is not divisible by 5");
		}
	if (a%3==0 && a%4==0 && a%5==0) {
		System.out.println(a + " is divisible by 3, 4, AND 5");
	}
	if (a%3!=0 && a%4!=0 && a%5!=0) {
		System.out.println( a + " is not divisible by 3, 4, AND 5");
	}
	if (b%3==0) {
		System.out.println(b + " is divisible by 3");
	}
	if (b%4==0) {
		System.out.println(b + " is divisible by 4");
	}
	if (b%5==0) {
		System.out.println(b + " is divisible by 5");
	}
	if (b%3!=0) {
		System.out.println(b + " is not divisible by 3");
	}
	if (b%4!=0) {
		System.out.println(b + " is not divisible by 4");
	}
	if (b%5!=0) {
		System.out.println(b + " is not divisible by 5");
	}
		if (b%3==0 && b%4==0 && b%5==0) {
		System.out.println( b + " is divisible by 3, 4, and 5");
	}
	if (b%3!=0 && b%4!=0 && b%5!=0) {
		System.out.println( b + " is not divisible by 3, 4, and 5");
	}
	}
}
