/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        
        greeting("John");
        greeting("Jake");
        greeting("Kale");
        greeting("Kyle");
        double num = raise(6000, 6);
        System.out.println("Your salary is " + num);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        System.out.println("Your salary is " + num);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	
	public static void greeting(String name){
	    System.out.println("Hello there " + name + " !");
	    
	}
	
	public static void printAnimal(){
	        System.out.println("      __             ");
	       System.out.println("    .--()°'.'  ");
	         System.out.println(" '|, . ,' ");
	       System.out.println("    !_-(_\\ ");
	       return;
	}
}