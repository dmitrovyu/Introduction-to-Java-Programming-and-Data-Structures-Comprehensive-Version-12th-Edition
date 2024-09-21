package Exercise_08_01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Sum elements column by column) Write a method that returns the sum of all the elements
 * in a specified column in a matrix using the following header:
 *      public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 * Here is a sample run:
 *
 *      Enter a 3−by−4 matrix row by row:
 *      1.5 2 3 4
 *      5.5 6 7 8
 *      9.5 1 3 1
 *
 *     Sum of the elements at column 0 is 16.5
 *     Sum of the elements at column 1 is 9.0
 *     Sum of the elements at column 2 is 13.0
 *     Sum of the elements at column 3 is 13.0
 * 
 * @author DejanD
 */
public class Exercise_08_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                m[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < m[0].length; i++){
            System.out.println("Sum of the elements at column " + i + " is " + 
                    sumColumn(m,i));
        }
    }
    public static double sumColumn(double[][] m, int index){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][index];
        }
        return sum;
    }
}
