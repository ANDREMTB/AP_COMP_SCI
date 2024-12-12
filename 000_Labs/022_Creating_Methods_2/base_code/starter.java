/*
 *	Author:  Andre Sookazian
 *  Date: 10/10/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		

	int answer =	pow(5, 4);
	System.out.println("answer = " + answer);
	}

	public static int pow(int a, int b) {
	
		int c =1; 
		while (b != 0) {
			if ((b & 1) == 1){
				c = c * a;
			}
				a = a * a;
				b = b >> 1; 
			}
			System.out.println(c);
			return c;

	        
		
		}


}


	

