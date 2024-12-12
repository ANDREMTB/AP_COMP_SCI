/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Select and type a number in between 1 and 1000 ");
    int a = sc.nextInt();
    int b = (int)(Math.random()*999) +1; 
    if (a>b) {
    	System.out.println("You are higher than the correct number!");
    }
    if (a<b) {
    	System.out.println("You are lower than the correct number!");
    }
    else if (a==b){
    	System.out.println("You are correct!");
    }
    System.out.println("The number was " + b);
	}
}
