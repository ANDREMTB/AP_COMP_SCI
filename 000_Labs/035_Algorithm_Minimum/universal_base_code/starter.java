/*
 *	Author:  Andre Sookazian
 *  Date: 11/8/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

Random random = new Random();
        
        int purple = random.nextInt(150) + 51;  
        
     
        int[] jake = new int[purple];
        
    
        for (int i = 0; i < jake.length; i++) {
            jake[i] = random.nextInt(100) + 1;  
        }

        
        System.out.println("THe Array size IS: " + jake.length);  
        for (int i = 0; i < jake.length; i++) {
            System.out.print(jake[i] + " ");
	}
	
	   int min = jake[0];  
        for (int i = 1; i < jake.length; i++) {
            if (jake[i] < min) {
                min = jake[i];
            }
        }
 System.out.println();
        System.out.println("Minimum value: " + min);
	 
	 int max = jake[0]; 
for (int i = 1; i < jake.length; i++) {  
    if (jake[i] > max) {
        max = jake[i];
    }
}
System.out.println("The max is " + max);





if (jake.length > 0) {
    int sum = 0;
    for (int i = 0; i < jake.length; i++) {
        sum += jake[i]; 
    }

    double average = (double) sum / jake.length; 
    System.out.println("The AVerage is goig to be " + average);

}

System.out.println("The nimber of elements is :" + jake.length);









}
}


