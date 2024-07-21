
package Exercise_05_50;

import java.util.Scanner;

/**
 *
 * (Count uppercase letters) Write a program that prompts the user to enter a string 
 * and displays the number of the uppercase letters in the string.
 *      Enter a string: Welcome to Java 
 *      The number of uppercase letters is 2
 * 
 * @author DejanD
 */
public class Exercise_05_50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        int upperCase = 0;
        for (int i = 0; i < input.length(); i++){
            if (Character.isUpperCase(input.charAt(i))) upperCase++;
        }
        System.out.println("The number of uppercase letters is " + upperCase);
    }
}
