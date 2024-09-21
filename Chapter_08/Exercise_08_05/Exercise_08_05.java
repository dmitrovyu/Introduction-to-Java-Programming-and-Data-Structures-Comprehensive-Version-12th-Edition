
package Exercise_08_05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix.
 * Each element cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
 *
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum. Here is a sample run:
 *
 *      Enter matrix1:  1 2 3 4 5 6 7 8 9
 *      Enter matrix2:  0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *      The matrices are added as follows
 *      1.0 2.0 3.0  +   0.0 2.0 4.0  =   1.0 4.0 7.0
 *      4.0 5.0 6.0  +   1.0 4.5 2.2  =   5.0 9.5 8.2
 *      7.0 8.0 9.0  +   1.1 4.3 5.2  =   8.1 12.3 14.2
 *
 * @author DejanD
 */
public class Exercise_08_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];
        
        Scanner in = new Scanner(System.in);
        //input matrix a
        System.out.print(" Enter matrix1: ");
        for (int i = 0; i < 9; i++)
            a[i/3][i%3] = in.nextDouble();
        
        //input matrix b
        System.out.print(" Enter matrix2: ");
        for (int i = 0; i < 9; i++)
            b[i/3][i%3] = in.nextDouble();
        
        //adding matricies
        for (int i = 0; i < 9; i++)
            c[i/3][i%3] = a[i/3][i%3] + b[i/3][i%3];
        
        //Print results
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++){
            String plusSign = (i == 1) ? "+" : " ";
            String equalSign = (i == 1) ? "=" : " ";
            System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2] + "  " + plusSign + "  "
            + b[i][0] + " " + b[i][1] + " " + b[i][2] + "  " + equalSign + "  " + 
            c[i][0] + " " + c[i][1] + " " + c[i][2]);
        }
    }
}
