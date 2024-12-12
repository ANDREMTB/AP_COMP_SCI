/*
 *	Author:  Andre Sookazian
 *  Date: 10/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("You do not have a role, user. Would you like to be a rogue, warrior, or wizard in the empire.");
		myCharacter test = new myCharacter();
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		if (!character.equals("Rogue") || (!character.equals("Warrior") || (!character.equals("Wizard") || (!character.equals("wizard") || (!character.equals("rogue") || (!character.equals("warrior"))))))) {
		System.out.println("That is not a valid response. ");
}
if (character.equals("Rogue") || (character.equals("Warrior") || (character.equals("Wizard") || (character.equals("wizard") || (character.equals("rogue") || (character.equals("warrior")))))))  {
	System.out.println("You are now a " + test.myCharacter(character));
}

		
	}
}
