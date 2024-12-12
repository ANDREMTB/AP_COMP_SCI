/*
 *	Author: Andre Sookazian
 *  Date:10/3/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

System.out.println("Welcome gambler, this is a slots casino. Would you like to play? You start with 100 dollars.");
String Yes = sc.nextLine();
 	if (Yes.equals("No") || (Yes.equals("n")) || (Yes.equals("N")) || (Yes.equals("no"))) {
System.out.println("Good choice, don't gamble");
}

int dollars=100;
while (Yes.equals("Yes") || (Yes.equals("yes")) || (Yes.equals("y")) || (Yes.equals("Y")) ) {
	System.out.println("Would you like to place a wager?");
	String answer= sc.nextLine();
	
	if (answer.equals("No") || (answer.equals("n")) || (answer.equals("N")) || (answer.equals("no"))) {
System.out.println("Good choice, don't gamble");

System.out.println("You have left with " + dollars + " dollars");
break;
}
  if (answer.equals("Yes") || (answer.equals("yes")) || (answer.equals("Y")) || (answer.equals("y"))) {
	System.out.println("How much of a wager would you like to place?");

	int wager = sc.nextInt();

	



int a = (int) (Math.random()*11);
int b = (int) (Math.random()* 11);
int c = (int) (Math.random()* 11);
System.out.print( " | " + a + " | ");
System.out.print(b + " | ");
System.out.println(c + " | ");

if (a==b || a==c || b==c) {
	System.out.println("Win! Two of the numbers match!");
	
	dollars = wager*2+dollars;
	System.out.println("You now have " +dollars);
	System.out.println("Would you like to play again?");
}
if (a==b && b==c && c==a) {
System.out.println("Win! All three are the same number! Slots jackpot!");
	
dollars = wager*3+dollars;

System.out.println(dollars);

} 
 
 if (a!=b && b!=c && c!=a) {
	System.out.println("You have lost your money. None of the numbers match!");
dollars = dollars - wager;
	System.out.println("Sorry! You now have " + dollars);
 }
if (dollars<wager) {
	System.out.println("You do not have enough money to bet that much!");
}
if (dollars<0) {
	System.out.println("You are out of money");
}

if (dollars==0) {
System.out.println("You are out of money. See you next time!");
}


	


}
	}
}

}