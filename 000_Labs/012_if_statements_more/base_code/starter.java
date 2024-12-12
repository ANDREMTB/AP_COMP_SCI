/*
 *	Author:  Andre Sookazian
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Select two variables from the following(a, b, c) and the following answer to the equation is shown");
String text = sc.nextLine();
	int a = 158;
	int b = 190; 
	int c = 190;
	if(a>b) {
	System.out.println(a>b);
	}
	else if(a<b) {
		System.out.println(a<b);
		System.out.println("A is less than b");
		System.out.println("158 is less than 190");
	}
	if(c>b) {
		System.out.println(c>b);
		System.out.print("158<190");
	
	}
	else if(c<b) {
	System.out.println(c<b);
	}
	else {
		System.out.println(c==b);
		System.out.println("C is equal to B");
		System.out.println("190 = 190");
	}
	if(a>c) {
		System.out.println(a>c);
		System.out.println("A is greater than c");
	}
	else if(a<c) {
		System.out.println(a<c);
		System.out.println("A is less than C");
		System.out.println("158 is less than 190");
	}
	else {
		System.out.println(a==c);
		System.out.println("A is equal to C");
	}
	
	

	}
}

