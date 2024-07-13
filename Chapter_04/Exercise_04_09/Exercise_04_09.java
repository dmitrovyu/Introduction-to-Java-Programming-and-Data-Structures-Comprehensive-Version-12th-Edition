
package Exercise_04_09;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.9 (Find the character of an ASCII code) Write a program that receives a character
 * and displays its ASCII code (an integer between 0 and 127). Here is a sample run:
 *
 *          Enter a character: E
 *          The ASCII code for character E is 69
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = in.next();
        int num_ASCII = (int) character.charAt(0);
        System.out.println("he ASCII code for character " + character + " is " + num_ASCII);
        
    }
}
