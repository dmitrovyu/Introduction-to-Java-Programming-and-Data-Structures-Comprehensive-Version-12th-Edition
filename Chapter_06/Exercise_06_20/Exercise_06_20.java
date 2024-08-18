
package Exercise_06_20;

import java.util.Scanner;

/**
 *
 * (Count the letters in a string) Write a method that counts the number of letters in 
 * a string using the following header:
 * public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays
 * the number of letters in the string.
 * 
 * @author DejanD
 */
public class Exercise_06_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        System.out.println("No. of letters is: " + countLetters(s));
        
    }
    public static int countLetters(String s){
        int noOfLetters = 0;
        for (int i = 0; i <s.length(); i++){
            if (Character.isLetter(s.charAt(i))) noOfLetters++;
        }
        return noOfLetters;
    }
}
