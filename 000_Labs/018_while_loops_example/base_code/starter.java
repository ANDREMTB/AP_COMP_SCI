/*
 *	Author:  Andre Sookazian
 *  Date: 9/26/24
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	System.out.println("While Loop Example");
	      int c = 0;
	      while (true) {
	      	System.out.println(c);
	      	if (c==10) {
	      		break;
	      	}
	      	c=c+1;
	      }
		
		System.out.println("0-1000 Lab");
		int a = 0;
		while (true) { 
			System.out.println(a);
			if (a==1000) {
				break;
			}
			a=a+1;
		}
	}
}
