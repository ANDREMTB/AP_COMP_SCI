/*
 *	Author:  Andre Sookazian
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Hello user, please type a desired name.");
	String a =sc.nextLine();
	System.out.println("How many times would you like me to repeat the name?");
int b = sc.nextInt();
 
while (b > 0) {
	System.out.println(a);

	--b;
}





	}
}
