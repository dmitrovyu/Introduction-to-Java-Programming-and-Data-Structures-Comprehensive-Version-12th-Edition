
package Exercise_06_23;

import java.util.Scanner;

/**
 *
 * (Occurrences of a specified character) Write a method that finds the number of 
 * occurrences of a specified character in a string using the following header:
 *          public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. Write a test program that 
 * prompts the user to enter a string followed by a character then displays the 
 * number of occurrences of the character in the string
 * @author DejanD
 */
public class Exercise_06_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string folowed by character: ");
        String str = in.next();
        char a =  in.next().charAt(0);
        System.out.println("In the: " + str + " there is " + count(str,a) + " " + a);
        
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a) count++;
        return count;
    }
}
