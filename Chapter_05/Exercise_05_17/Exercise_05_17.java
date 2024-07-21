
package Exercise_05_17;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Display pyramid) Write a program that prompts the user to enter an integer from 
 * 1 to 15 and displays a pyramid, as presented in the following sample run:
 * 
 * Enter the number of lines: 7 
 *                  1
 *               2  1  2
 *            3  2  1  2  3
 *         4  3  2  1  2  3  4
 *      5  4  3  2  1  2  3  4  5
 *   6  5  4  3  2  1  2  3  4  5  6
 * 7  6  5  4  3  2  1  2  3  4  5  6  7
 * 
 * @author DEJAN
 */
public class Exercise_05_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number of lines: ");
        int rows = in.nextInt();
        String line = "";
        for (int i= 1; i <= rows; i++) {
            for (int j = rows; j >= 1; j--){
                line += (j <= i) ? (j + "  "): "   ";
            }
            for (int k = 2; k<=rows; k++){
                line += (k <= i) ? (k + "  "): "   ";
            }
           System.out.println(line);
           line = "";
        }
        
    }
}
