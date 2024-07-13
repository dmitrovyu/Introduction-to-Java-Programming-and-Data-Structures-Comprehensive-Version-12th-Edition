
package Exercise_04_22;

import java.util.Locale;
import java.util.Scanner;

/**
 * 4.22 (Check substring) Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 *
 *          Enter string s1: ABCD
 *          Enter string s2: BC
 *          BC is a substring of ABCD
 *
 *          Enter string s1: ABCD
 *          Enter string s2: BDC
 *          BDC is not a substring of ABCD
 *
 * @author DejanD
 * */
public class Exercise_04_22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = in.next();
        System.out.println("Enter string s2: ");
        String s2 = in.next();
        if (s1.contains(s2)) System.out.println(s2 + " is a substring of " + s1);
        else System.out.println(s2 + " is not a substring of " + s1);
        
    }
}
