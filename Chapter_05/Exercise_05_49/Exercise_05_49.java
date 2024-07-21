
package Exercise_05_49;

import java.util.Scanner;

/**
 *
 * (Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels. 
 * Write a program that prompts the user to enter a string, and displays the number of 
 * vowels and consonants in the string.
 * 
 * @author DejanD
 */
public class Exercise_05_49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        int vowels = 0;
        int consonants = 0;
        int other = 0;
        
        for (int i = 0; i < input.length(); i++){
            char ch = (Character.isLetter(input.charAt(i))) ? Character.toLowerCase(input.charAt(i)) : '~';
            switch(ch){
                case 'a', 'e', 'i','o','u' -> vowels++;
                case '~' -> other++;
                default -> consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
        
        
    }
    
}
