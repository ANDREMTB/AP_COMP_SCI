/*
 *	Author: Andre Sookazian
 *  Date:10/12/24
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num) {
		
		int dividing = 2; 
		while (dividing < num) {
			if (num % dividing == 0) {
				return false;
			}
			dividing++;
		}
		return true; 
	}
	
public static void printPrimes(int maximum) {
	int now = 2; 
	while (now < maximum) {
		if (checkPrime(now)) {
			System.out.println(now);
		}
		now++;
	}
	
}
	
	
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Hello user, please type an integer: ");
		int input = sc.nextInt();
		System.out.println("You will now see all the prime numbers below this number. ");
		printPrimes(input);
	}
	
	
	
}




