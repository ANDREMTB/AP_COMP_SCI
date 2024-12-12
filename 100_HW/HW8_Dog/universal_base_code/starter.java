/*
 *	Author: Andre Sookazian
 *  Date: 10/26/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Dog firstDog = new Dog("Jake");
	firstDog.setAge(5);
	
	Dog secondDog = new Dog("Maddie, Peter");
	if (firstDog.isSleeping()) {
		System.out.println(firstDog.getName() + " is now sleeping on the Couch");
	}
	
	else {
		firstDog.bark();
		if (!secondDog.isSleeping()) {
			secondDog.bark();
		}
	}
	
	}
}