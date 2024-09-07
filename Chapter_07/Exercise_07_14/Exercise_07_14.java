package Exercise_07_14;

import java.util.Scanner;

/**
 *
 * (Compute gcd) Write a method that returns the gcd of an unspecified number of
 * integers. The method header is specified as follows: public static int
 * gcd(int... numbers) Write a test program that prompts the user to enter five
 * numbers, invokes the method to find the gcd of these numbers, and displays
 * the gcd.
 *
 * @author DejanD
 */
public class Exercise_07_14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Greatest common divisor: " + gcd(array));
    }
    
    //Return gcd for array
    public static int gcd(int... numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (gcd(gcd, numbers[i]) < gcd) {
                gcd = gcd(gcd, numbers[i]);
            }
        }
        return gcd;

    }

     // Return the gcd of two integers
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2;   // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Update gcd
            }
            k++;
        }
        return gcd; // Return gcd
    }
}
