
package Exercise_05_38;

import java.util.Scanner;

/**
 *
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 *  integer and displays its corresponding octal value. Don’t use Java’s Integer.
 *  toOctalString(int) in this program.
 * 
 * @author DejanD
 */
public class Exercise_05_38 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int decimal = in.nextInt();
        String octal = "";
        while (decimal >= 1){
            int bit = decimal % 8;
            octal = bit + octal;
            decimal /= 8;
        }
        //Print string reverse
        System.out.print("Decimal number in octal is: " + octal);
        
        
        
    }
}
