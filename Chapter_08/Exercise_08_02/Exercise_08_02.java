package Exercise_08_02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Sum the major diagonal in a matrix)) Write a method that sums all the
 * numbers in the major diagonal in an n * n matrix of double values using the
 * following header:
 *      public static double sumMajorDiagonal(double[][] m)
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * elements on the major diagonal. Here is a sample run:
 *
 *      Enter a 4−by−4 matrix row by row:
 *      1 2 3 4.0
 *      5 6.5 7 8
 *      9 10 11 12
 *      13 14 15 16
 *
 *      Sum of the elements in the major diagonal is 34.5
 * @author DEJAN
 */
public class Exercise_08_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                m[i][j] = in.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + 
                sumOfMajorDiagonal(m));
        
    }
    public static double sumOfMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
}
