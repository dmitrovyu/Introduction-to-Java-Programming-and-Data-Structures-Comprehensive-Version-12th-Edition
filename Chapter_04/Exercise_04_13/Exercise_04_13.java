
package Exercise_04_13;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input. Here is a sample run:
 *
 *          Enter a letter: B
 *          B is a consonant
 *
 *          Enter a letter: a
 *          a is a vowel
 *
 *          Enter a letter: #
 *          # is an invalid input
 *
 * @author DejanD
 * */
public class Exercise_04_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = in.next();
        char letter = input.charAt(0);
        if (!Character.isLetter(letter))
            System.out.println(letter + " is an invalid input");
        else {
            String type = switch(letter){
                case 'A','E','O','I','U', 'a','e','o','i','u' -> "vowel";
                default ->  "consonant";    
            };
            System.out.println(letter + " is a " + type);
        }
        
    }
    
}
