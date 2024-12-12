/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}
	public void toStringArray(int array) {
		for (i=0; i<arr.length; i++)
		System.out.println(arr[i]);
	}
	
public int getArrayAverage(int jack) {
	int jack = 0; 
	for (i = 0; i < arr.length; i++) {
		jack +=arr[i];
		int average =  jack / arr.length; 
		return average; 
		
	}
	public int getArrayMax(int max) {
		int max = arr[0]; 
		for(i = 1; i <arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The max is " + max);
		
}


public int getArrayMin(int min) {
		int min = arr[0]; 
		for(i = 1; i <arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The max is " + min);
		
}




}

