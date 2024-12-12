/*
 *	Author:  Andre Sookazian
 *  Date: 10/31/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	 


	
		      public static void main(String[] args) {
        
        PooleDwarf test = new PooleDwarf(randName(), 30); 
        
        
        

        System.out.println("Your random dwarf name is: " + test.getName());
        System.out.println("Age of the dwarf is: " + test.getAge());
        System.out.println("The number of repeats of the name " + test.getName() + " is: " + test.isSameName());
    }
}
	

