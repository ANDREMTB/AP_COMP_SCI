/*
 *	Author: Andre Sookazian
 *  Date:  11/9/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
int [] array = new int [20];
int Duplicates = 0;
for (int i = 0; i < array.length; i++) {
	array[i] = (int) (Math.random()*10 +1);
	
}
for (int i =0; i < array.length; i++) {
	System.out.println(array[i]);
}
int number = (int) (Math.random()*10 +1);
System.out.println("The random number is " + number);

for (int i = 0; i<array.length; i++) {
	if (number == array[i]) {
		Duplicates++;
		System.out.println("A duplicate has been found at " + i);
		System.out.println("There have been found " + Duplicates + " duplicates.");
		System.out.println();
	}
}
for (int i = 1; i < array.length; i++) {
	if (array[i] == array[i-1] ){
		System.out.println(" The index is " + i + " and " + (i-1) + " are the same duplicates of " + array[i]);
}

	}
}
}