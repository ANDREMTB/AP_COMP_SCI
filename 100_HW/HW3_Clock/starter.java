/*
 *	Author:Andre Sookazian
 *  Date:9/20/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Hello, select the day tomorrow and the alarm for tomorrow will be set: 0-6 (0 is Sunday, 6 is Saturday");
int answer1 = sc.nextInt();
 if (answer1==0) {
  System.out.println("The alarm is set for tomorrow:");
 	System.out.println("It is Sunday, the Weekend! Wake up, it is 10:00 AM!");
 }
 	if (answer1==1) {
 	 System.out.println("The alarm is set for tomorrow:");
 	System.out.println("It is a Monday! Wake up, it is 7:00 AM");
 	}
 	if (answer1==2) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("It is Tuesday! Wake up, it is 7:00 AM");
 	}
 	if (answer1==3) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("It is Wednesday! Wake up, it is 7:00 AM");
 	}
 	if (answer1==4) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("It is Thursday! Wake up, it is 7:00 AM");
 	}
 	if (answer1==5) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("It is Friday! Wake up, it is 7:00 AM!");
 	}
 	if (answer1==6) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("It is Saturday, the Weekend! Wake up, it is 10:00 AM!");
 	}
 	else if(answer1==7) {
 	 System.out.println("The alarm is set for tomorrow:");
 	 System.out.println("Not a correct day for an alarm.");
 	}
 	
 	
 
   }
 }
 
	


