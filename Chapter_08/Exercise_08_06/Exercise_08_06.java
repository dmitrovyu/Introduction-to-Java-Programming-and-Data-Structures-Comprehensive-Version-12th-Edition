
package Exercise_08_06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * * **8.6 (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][]
 *  multiplyMatrix(double[][] a, double[][] b)
 *  To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + g + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their product. Here is a sample run:
 *
 *      Enter matrix1: 1 2 3 4 5 6 7 8 9
 *      Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *      The multiplication of the matrices is
 *      1 2 3   0 2.0 4.0    5.3 23.9 24
 *      4 5 6 * 1 4.5 2.2  = 11.6 56.3 58.2
 *      7 8 9   1.1 4.3 5.2  17.9 88.7 92.4
 * 
 * @author DejanD
 */
public class Exercise_08_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        
        
        Scanner in = new Scanner(System.in);
        //input matrix a
        System.out.print(" Enter matrix1: ");
        for (int i = 0; i < 9; i++)
            a[i/3][i%3] = in.nextDouble();
        
        //input matrix b
        System.out.print(" Enter matrix2: ");
        for (int i = 0; i < 9; i++)
            b[i/3][i%3] = in.nextDouble();
        
        double[][] c = multiplyMatrix(a,b);
        
        //Print results
        System.out.println("The multiplication of the matrices is");
        for (int i = 0; i < 3; i++){
            String multiSign = (i == 1) ? "+" : " ";
            String equalSign = (i == 1) ? "=" : " ";
            System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2] + "  " + multiSign + "  "
            + b[i][0] + " " + b[i][1] + " " + b[i][2] + "  " + equalSign + "  " + 
            c[i][0] + " " + c[i][1] + " " + c[i][2]);
        }
        
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[3][3];
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][0] * b[0][j]  + a[i][1] * b[1][j] + a[i][2] * b[2][j];
                c[i][j] = Math.round(c[i][j]*10.0)/10.0;
            }
        }
        return c;
    }
}
