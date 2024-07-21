
package Exercise_05_51;

import java.util.Scanner;

/**
 *
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some
 * sample runs:
 *
 *          Enter the first string: Welcome to C++
 *          Enter the second string: Welcome to programming
 *          The common prefix is Welcome to
 *
 *          Enter the first string: Atlanta
 *          Enter the second string: Macon
 *          Atlanta and Macon have no common prefix
 * 
 * @author DEJAN
 */
public class Exercise_05_51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = in.nextLine();
        String prefix = "";
        for (int i =0; i <string1.length() && i<string2.length(); i++){
            if (string1.charAt(i) == string2.charAt(i)) prefix += string1.charAt(i);
            else break;
        }
        
        if (string1.charAt(0) == string2.charAt(0)) { 
            System.out.println("The common prefix is " + prefix);
        } else {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
         }
}
}

