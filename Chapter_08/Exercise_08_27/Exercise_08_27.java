package Exercise_08_27;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * (Column sorting) Implement the following method to sort the columns in a
 * two-dimensional array. A new array is returned and the original array is
 * intact. public static double[][] sortColumns(double[][] m) Write a test
 * program that prompts the user to enter a 3 * 3 matrix of double values and
 * displays a new column-sorted matrix. Here is a sample run: Enter a 3−by−3
 * matrix row by row: 0.15 0.875 0.375 0.55 0.005 0.225 0.30 0.12 0.4 The
 * column−sorted array is 0.15 0.0050 0.225 0.3 0.12 0.375 0.55 0.875 0.4
 *
 * @author DejanD
 */
public class Exercise_08_27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] m = new double[3][3];
        System.out.println(" Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = in.nextDouble();
            }
        }
        double[][] n = sortColumns(m);
        System.out.println("The column-sorted array is");
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(n[i]));
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] copy = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            copy[i] = Arrays.copyOfRange(m[i], 0, m[i].length);
        }

        for (int j = 0; j < copy.length; j++) {
            boolean sorted = false;
            do {
                for (int i = 0; i < copy.length-1; i++) {
                    if (copy[i][j] > copy [i+1][j]) {
                        double temp = copy[i][j];
                        copy[i][j] = copy[i+1][j];
                        copy[i+1][j] = temp;
                        sorted = true;  
                    }
                } 
            }while (!sorted);
        }
        return copy;
    }
}
