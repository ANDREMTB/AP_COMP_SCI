/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;


class starter{
    public static void main(String args[]) {
        car mobile = new car();
        car batmobile = new car("Lambo", 525, "Black");
        batmobile.paint("pink");
        mobile.vroom();
        batmobile.vroom();
    } 
}
    
	