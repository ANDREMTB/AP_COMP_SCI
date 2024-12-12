/*
 *	Author: Andre Sookazian
 *  Date:10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
			michael.raiseSalary(35);
		michael.employeeToString();
	
		double y = michael.getAnnualSalary();
		System.out.println("Annual Salary is: " + y);
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.raiseSalary(50);
		Dwight.employeeToString();
		
		
		double a = Dwight.getAnnualSalary();
		System.out.println("Annual Salary is: " + a);
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
			Jim.raiseSalary(30);
		Jim.employeeToString();
	
		double x = Jim.getAnnualSalary();
		System.out.println("Annual Salary is: " +x);
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.raiseSalary(15);
		Pam.employeeToString();
	double g = 	Pam.getAnnualSalary();
	System.out.println("Annual Salary is: " +g);
	
		Employee Jake = new Employee(2014, "Jake", "Wesle", 3010);
		Jake.raiseSalary(10);
		Jake.employeeToString();
		double ff = Jake.getAnnualSalary();
	System.out.println("Annual Salary is: " + ff);
	}
}
