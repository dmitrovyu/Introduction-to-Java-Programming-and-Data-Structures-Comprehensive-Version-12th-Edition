
package Exercise_04_20;

import java.util.Locale;
import java.util.Scanner;

/**
 * 4.20 (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its first character
 *
 *
 * @author DejanD
 * */
public class Exercise_04_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println("String length: " + input.length());
        System.out.println("The first character: " + input.charAt(0));
        
    }
}
