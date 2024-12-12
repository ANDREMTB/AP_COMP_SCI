package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	 public static int SpecialSQUARES(int n) {
        int count = 0; 
        int track = 1;  
        
       
        while (count < n) {
          
            int sum = track * (track + 1) / 2;
            
            
            int root = (int) Math.sqrt(sum);
            if (root * root == sum) {
               
                System.out.println(sum);
                count++;
            }
            
            track++; 
        }
        return n; 
    }
	
}
