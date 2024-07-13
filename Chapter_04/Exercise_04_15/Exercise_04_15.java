
package Exercise_04_15;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.15 (Phone key pads) The international standard letter/number mapping found on the
 * telephone is shown below:
 * Write a program that prompts the user to enter a lowercase or uppercase letter and
 * displays its corresponding number. For a nonletter input, display invalid input.
 *
 *          Enter a letter: A
 *          The corresponding number is 2
 *
 *          Enter a letter: a
 *          The corresponding number is 2
 *
 *          Enter a letter: +
 *          + is an invalid input
 *
 * @author DejanD
 * */
public class Exercise_04_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a letter: ");
        char letter = Character.toUpperCase(in.next().charAt(0));
        int num = (int) letter;
        if (!Character.isLetter(letter)) 
            System.out.println(letter + " is not a valid input");
        else {
            num = (num-59)/3;
            if (letter == 'S' || letter =='V' || letter == 'Y' || letter == 'Z')
                num--;
            System.out.println("The corresponding number is " + num);
        }
        
    }
    
}
