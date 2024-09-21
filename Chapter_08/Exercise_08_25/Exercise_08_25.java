
package Exercise_08_25;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * * *8.25 (Markov matrix) An n * n matrix is called a positive Markov matrix if each
 * element is positive and the sum of the elements in each column is 1. Write the
 * following method to check whether a matrix is a Markov matrix:
 *          public static boolean isMarkovMatrix(double[][] m)
 *  Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and tests whether it is a Markov matrix. Here are sample runs:
 *
 *          Enter a 3−by−3 matrix row by row:
 *          0.15 0.875 0.375
 *          0.55 0.005 0.225
 *          0.30 0.12 0.4
 *          It is a Markov matrix
 *
 *          Enter a 3−by−3 matrix row by row:
 *          0.95 -0.875 0.375
 *          0.65 0.005 0.225
 *          0.30 0.22 -0.4
 *          It is not a Markov matrix
 * @author DejanD
 */
public class Exercise_08_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i <3; i++)
            for (int j=0; j < 3; j++)
                matrix[i][j]=in.nextDouble();
        if (isMarkovMatrix(matrix))
            System.out.println("It is a Markov matrix");
        else 
            System.out.println("It is not a Markov matrix");
                
    }
    public static boolean isMarkovMatrix(double[][] m){
        //check if each element is positive
        for (int i=0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (m[i][j] < 0) return false;
        
        //check if the sum of the element in a column equals 1
        for (int i = 0; i < 3; i++){
            double sum = 0;
            for (int j = 0; j < 3; j++){
                sum += m[j][i];
            }
            if (sum !=1.0) return false;
        }    
        return true;
    }
}
