/*
 *	Author:  Andre Sookazian
 *  Date: 11/21/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			
			
	System.out.println("Hello user, enter any word please.");

 String gorilla = sc.nextLine(); 
 
 
System.out.println();
 int i = 0; 
 for (i = 0; i < gorilla.length(); i++) {
 System.out.println(gorilla.substring(i, i+1));
 }
 System.out.println();
  System.out.println();

 for (i = 0; i < gorilla.length(); i++) {
     System.out.print(gorilla.substring(i,i+1) + " ");
 


}

	}
}
