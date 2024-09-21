package Exercise_08_26;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * (Row sorting) Implement the following method to sort the rows in a
 * two-dimensional array. A new array is returned and the original array is
 * intact. public static double[][] sortRows(double[][] m) Write a test program
 * that prompts the user to enter a 3 * 3 matrix of double values and displays a
 * new row-sorted matrix. Here is a sample run:
 *
 * @author DEJAN
 */
public class Exercise_08_26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = in.nextDouble();
            }
        }
        
        double[][] copy = sortRows(m);
        
        System.out.println("The row-sorted array is");
        for (int i =0; i < copy.length; i++){
            for (int j = 0; j < copy[i].length; j++){
            System.out.print(copy[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double[][] sortRows(double[][] m) {
        double[][] copy = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            copy[i] = Arrays.copyOfRange(m[i], 0, m.length);
        }

        for (int i = 0; i < copy.length; i++) {
            boolean sorted;
            do {
                sorted = false;
                double temp = 0;
                for (int j = 0; j < copy[i].length - 1; j++) {
                    if (copy[i][j] > copy[i][j + 1]) {
                        temp = copy[i][j];
                        copy[i][j] = copy[i][j + 1];
                        copy[i][j + 1] = temp;
                        sorted = true;
                    }
                }
            } while (!sorted);
        }
        return copy;
    }

}
