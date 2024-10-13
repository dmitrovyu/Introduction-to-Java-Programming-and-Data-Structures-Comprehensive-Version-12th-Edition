package Exercise_09_13;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  * **9.13 (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices in
 * a two-dimensional array with row and column as int types and maxValue as a
 * double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 *  The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array. Here is a sample run:
 *
 *              Enter the number of rows and columns in the array: 3 4
 *              Enter the array:
 *              23.5 35 2 10
 *              4.5 3 45 3.5
 *              35 44 5.5 9.6
 *              The location of the largest element is 45 at (1, 2)
 *
 * @author DejanD
 */
public class Exercise_09_13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        
         // Prompt the user to enter a two-dimensional array
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = in.nextInt();
        int column = in.nextInt();
        double[][] a = new double[row][column];
        
        // Create a matrix
        System.out.println("Enter the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = in.nextDouble();
            }
        }
        
        // Get and instance of Loacation
        Location loc = Location.locateLargest(a);
        
        // Display the location of the largest element in the array
        System.out.println("The location of the largest element is " + loc.maxValue
                + " at (" + loc.row + ", " + loc.column + ")");
    }

}
