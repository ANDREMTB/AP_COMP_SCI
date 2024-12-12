/*
 *	Author: Andre Sookazian
 *  Date: 9/11/24
 *	Collaborator(s): Jivan Avakian
*/
import java.util.Scanner;




class starter { 
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int number = sc.nextInt();
	System.out.println("Here are the next 5 numbers: ");
	System.out.println(number);
	System.out.println(number + 1);
	System.out.println(number + 2);
	System.out.println(number + 3);
	System.out.println(number + 4);
	System.out.println(number + 5);
	
	System.out.println("Here are the next 5 multiples of 5");
	System.out.println(number);
	System.out.println(number + 5);
	System.out.println(number + 10);
	System.out.println(number + 15);
	System.out.println(number + 20);
	
	System.out.println("Here is 5 divided by 100");
	System.out.println(number/100.0);
	System.out.println("Here is " + (number /10.0));
	System.out.println("Here is 5 divided by 10");
	System.out.println("Here is " + (number/10.0));
	
	


	}
}
