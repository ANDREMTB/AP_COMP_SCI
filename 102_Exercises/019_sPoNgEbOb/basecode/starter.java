/*
	Author: Andre Sookazian
	Date:   12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter any, one word.");

String sentence = sc.nextLine();
while(true) {
	if (sentence.indexOf(" ")==-1) {
		System.out.println(spongeCase(sentence) + " ");
		break;
	}
	int space = sentence.indexOf(" ");
	String word = sentence.substring(0, space); 
	spongeCase(word); 
	System.out.println(spongeCase(word)+ " ");
	sentence = sentence.substring(space+1); 
	
}

	
}
	
	public static String spongeCase(String word) {
		String result = " ";

	


for (int i = 0; i< word.length(); i++) {
	String letter = word.substring(i, i+1);
	if(i%2==0) {
		 letter = letter.toLowerCase(); 
	}
	

	else {
	letter = letter.toUpperCase();
	}

	result = result + letter; 
		
	}
	
	return result; 
}
	}
