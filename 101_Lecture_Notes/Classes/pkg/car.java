/* 
    Lecture note example - Classes
*/
package pkg;


public class car{
    // Global Variables
    String model; 
    double maxSpeed; 
    String color; 
    boolean isElectric; 
    
    // COnstructors
    public car(){
        model = "Bus"; 
        maxSpeed = 1.1;
        isElectric = false; 
        color = "Blue and Red";
    }
   public car(String m, double s, String c){
       model =  m;
       maxSpeed = s; 
       isElectric = false; 
       color = c; 
   }
   public void paint(String c){
       color = c;
   }
   public void vroom() {
       int count = 0; 
       while (count < maxSpeed) {
           System.out.println(model + " goes VROOOOM");
           count = count + 10;
       }
   }
      
      
      
      
      
        
	
}