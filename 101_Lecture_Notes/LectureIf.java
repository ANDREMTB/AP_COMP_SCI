/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("A man that has 3 ways to go on a path to his school in the morning");
        System.out.println("1. Take the direct route");
        System.out.println ("2. Take the scenic route");
        System.out.println("3. Take the alternate route");
        
        int answer1= sc.nextInt();
        
        if(answer1 == 1){
            System.out.println("You take the direct and straight route! WOuld you like to continue through it?");
            
        }
        else if(answer1 == 2){
             System.out.println (" You take the scenic, fascinating route. Would you continue glaring at the scenery?");
        }
        else if(answer1 == 3){
            System.out.println("You take the alternate, peaceful route. Would you continue exploring?");
        }
        else{
            System.out.println("You didn't type a correct answer!");
        }
        int answer2 = sc.nextInt();
        
        if(answer2 == 1){
            System.out.println("You get to the destination rapidly.");
        }
        else if(answer2 == 2){
            System.out.println("You enjoy the beauty of the landscape and all of the flowing water.");
        }
        else if(answer2 == 3){
            System.out.println("You will come across the multiple animals and insects and you will discover lovely trees.");
        }
        
	}
}