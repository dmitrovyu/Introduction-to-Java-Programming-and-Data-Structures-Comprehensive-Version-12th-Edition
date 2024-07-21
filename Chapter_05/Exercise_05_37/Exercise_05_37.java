
package Exercise_05_37;

import java.util.Scanner;

/**
 *
 * (Decimal to binary) Write a program that prompts the user to enter a decimal 
 * integer then displays its corresponding binary value. Don’t use Java’s Integer.
 * toBinaryString(int) in this program.
 * @author DEJAN
 */
public class Exercise_05_37 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int decimal = in.nextInt();
        String binary = "";
        while (decimal >= 1){
            int bit = decimal % 2;
            binary = bit + binary;
            decimal /= 2;
        }
       
        System.out.println("Binary: " + binary);
       
        
    }
}
