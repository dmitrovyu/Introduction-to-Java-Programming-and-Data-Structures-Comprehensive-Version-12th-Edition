
package Exercise_08_30;

import java.util.Locale;
import java.util.Scanner;

/**
 *(Algebra: solve linear equations) Write a method that solves the following 2 * 2
 * system of linear equations: exist as photo
 * The method header is:
 * public static double[] linearEquation(double[][] a, double[] b)
 *  The method returns null if a00a11 - a01a10 is 0. Write a test program that
 * prompts the user to enter a00, a01, a10, a11, b0, and b1 and displays the result. If
 * a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is
 * similar to Programming Exercise 3.3.
 * 
 * @author DejanD
 */
public class Exercise_08_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] a = new double[2][2];
        double[] b = new double[2];
        System.out.println("Enter a00, a01, a10, a11, b0 and b1: ");
        for (int i = 0; i < 2; i++)
            for (int j=0; j <2; j++)
                a[i][j] =  in.nextDouble();
        b[0] = in.nextDouble();
        b[1] = in.nextDouble();
        double[] result = linearEquation(a, b);
        if (result == null) System.out.println("The equation has no solution.");
        else System.out.println("x is : " + result[0] + " and y is: " + result[1]);
        
        
    }
    public static double[] linearEquation(double[][] a, double[] b){
        double[] result = new double[2];
        double z = (a[0][0]*a[1][1] - a[0][1]*a[1][0]);
        if (z == 0) return null;
        else {
            result[0] = (b[0] * a[1][1] - b[1] * a[0][1])/z;
            result[1] = (b[1] * a[0][0] - b[0] * a[1][0])/z;
        }
        
        return result;
                
    }
    
}
