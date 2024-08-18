
package Exercise_06_06;

import java.util.Scanner;

/**
 *
 * (Display patterns) Write a method to display a pattern as follows:
 *              1
 *            2 1
 *          3 2 1
 *            ...
 *n n–1 ... 3 2 1
 * The method header is
 *          public static void displayPattern(int n)
 * 
 * Write a test program that prompts the user to enter a number n and invokes
 * displayPattern(n) to display the pattern.
 * 
 * @author DejanD
 */
public class Exercise_06_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = in.nextInt();
        displayPattern(n);
        
    }
    public static void displayPattern(int n) {
        for (int i = 1; i <=n; i++){
            for (int j = n; j > 0 ; j--) {
                if (j <= i) System.out.print(j+"\t");
                else System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
