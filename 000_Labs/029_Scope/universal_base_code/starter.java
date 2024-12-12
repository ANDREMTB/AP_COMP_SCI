/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
	
			String statement = new String(shrek.name + " IS UGLY!");
			System.out.println(statement);
		
		
		donkey.interact(shrek);
		
		for(int i = 1; i < 6; i++){
			shrek.interact(donkey);
		
	if (i==5){
		System.out.println("That printed out " + i + " times");
	}
			

	}

}

}