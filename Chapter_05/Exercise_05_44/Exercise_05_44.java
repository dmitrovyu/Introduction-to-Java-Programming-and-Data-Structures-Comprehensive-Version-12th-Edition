
package Exercise_05_44;

import java.util.Scanner;

/**
 * (Computer architecture: bit-level operations) A byte value is stored in 8 bits. Write
 * a program that prompts the user to enter a byte integer and displays the 8 bits for
 * the integer. Here are sample runs:
 *
 *              Enter an integer: 5
 *              The 8 bits are 00000101
 *
 *              Enter an integer: –5
 *              The 8 bits are 11111011
 * @author DejanD
 */
public class Exercise_05_44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an interger: ");
        byte input = in.nextByte();
        String bits = "";
        for (int i = 0; i < 8; i++){
            int bit = input & 1;
            bits = bit + bits;
            input >>= 1;
        }
        System.out.println("Binary: " + bits);
        
    }
}
