/*
 *	Author: Andre Sookazian
 *  Date:10/20/24
 *	Collaborator(s):
*/

import pkg.Cipher; 
import java.util.Scanner;

class Starter {
    public static void main(String[] args) {
        int c = 1;
        Scanner sc = new Scanner(System.in); 
        Cipher cipher = new Cipher(); 

        while (c < 30) {
            System.out.println("Please type in a word message: ");
            String message = sc.nextLine();
            String encodedMessage = cipher.encode(message);
            System.out.println("Encoded message: " + encodedMessage);

            System.out.println("Enter a key for special encoding: ");
            int key = sc.nextInt();
            sc.nextLine(); 

            String keyedEncodedMessage = cipher.keyedEncoded(encodedMessage, key);
            System.out.println("Keyed message: " + keyedEncodedMessage);
            c++;
        }

        
    }
}