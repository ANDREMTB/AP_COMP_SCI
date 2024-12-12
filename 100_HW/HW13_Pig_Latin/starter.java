/*
   * Author: Andre Sookazian
   * Date: 12/5/24
   * Collaborator(s):
*/

	
	
	
import java.util.Scanner;
public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to translate into Pig Latin:");

        String sentence = sc.nextLine();
        int start = 0;

        while (start < sentence.length()) {
            int spaces = sentence.indexOf(" ", start);
            if (spaces == -1) {
                System.out.print(pigLatin(sentence.substring(start)));
                break;
            }
            System.out.print(pigLatin(sentence.substring(start, spaces)) + " ");
            start = spaces + 1;
        }
    }

    public static String pigLatin(String word) {
        word = word.toLowerCase();
        String firstLetter = word.substring(0, 1);
        
        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")) {
            return word + "way";
        }

        return word.substring(1) + firstLetter + "ay";
    }
}
