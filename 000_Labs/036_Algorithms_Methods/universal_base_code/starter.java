/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int [] arr = new int [100]; 
	
	
	for (int i = 0; i<arr.length; i++) {
		arr[i] =  (int) (Math.random()*100);
	
	}
	
	arr[5].getArrayMax();

	}
}
