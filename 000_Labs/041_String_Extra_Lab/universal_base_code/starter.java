/*
 *	Author:  Andre Sookazian
 *  Date: 12/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
Scanner sc = new Scanner(System.in); 
System.out.println("User, please enter a sentence. ");
String sentence = sc.nextLine(); 
System.out.println("The sentence is: " + sentence);





int space1 = sentence.indexOf(" ");
int spacenum2 = sentence.indexOf(" ", space1 +1);
int space3 = sentence.indexOf(" ", spacenum2 +1);

if(space1 == -1 || spacenum2 ==1) {
	System.out.println("Sorry user, the sentence cannot be converted.");
	return; 
}
		String word1 = sentence.substring(0, space1); 
		String word2 = sentence.substring(space1 + 1, spacenum2);
		String word3 = sentence.substring(spacenum2 + 1);
	
		
	System.out.println("The opposite of this sentence in reverse will be- "   + word3 + " " +   word2 + " "  + word1 );
	}
}
