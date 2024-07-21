
package Exercise_05_14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find 
 * the greatest common divisor of two integers n1 and n2 is as follows: First find d 
 * to be the minimum of n1 and n2, then check whether d, d–1, d–2, …, 2, or 1 is 
 * a divisor for both n1 and n2 in this order. The first such common divisor is the 
 * greatest common divisor for n1 and n2. Write a program that prompts the user to 
 * enter two positive integers and displays the gcd.
 * 
 * @author DEJAN
 */
public class Exercise_05_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first integer n1: ");
        int n1 = in.nextInt();
        System.out.print("Please enter the second integer n2: ");
        int n2 = in.nextInt();
        int d = (n1 < n2) ? n1 : n2;
        System.out.println("");
        while (d > 0){
            if (n1 % d == 0 && n2 % d == 0) break;
            d--;
        }
        System.out.println("The greatest common divisor of two integers " + n1 + " and " + n2 + " is " + d);
                
        
    }
}
