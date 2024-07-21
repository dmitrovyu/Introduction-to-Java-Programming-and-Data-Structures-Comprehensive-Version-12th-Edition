
package Exercise_05_46;

import java.util.Scanner;

/**
 *
 * (Reverse a string) Write a program that prompts the user to enter a string and
 * displays the string in reverse order.
 *
 *      Enter a string: ABCD
 *      The reversed string is DCBA
 *
 * @author DejanD
 */
public class Exercise_05_46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a string: ");
        String input = in.nextLine();
        String output = "";
        for (int i = input.length()-1; i >= 0 ; i--){
            output += input.charAt(i);
        }
        System.out.println("The reversed string is " + output);;
    }
}
