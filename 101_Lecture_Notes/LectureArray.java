/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 7, 8, 3, 2, 8, 4, 9};
        
        for(int i = 0; i < arr.length-1; i= i+2) {
            System.out.println(arr[i] + " " + arr[i+1]); 
            
        }
        int dupeCheck = 8; 
         for(int i = 0; i < arr.length; i= i+1) {
            if (dupeCheck == arr[i]) {
                System.out.println(i);
            }
        }
        
        
        
        
         for(int i = 0; i < arr.length-1; i= i+1) {
            if ( arr[i]== arr[i] +1) {
                System.out.println(arr[i] +" and " + arr[i]+1 );
            }
        }
        
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println(min);
            }
        }
        
        int max = arr[0];
        for (int i = 1;  i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max);
            }
        }
        System.out.println("This is " + arr.length);
       
        
        
	}
	
}