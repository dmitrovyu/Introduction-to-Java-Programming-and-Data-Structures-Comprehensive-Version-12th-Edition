
package Exercise_08_15;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 * whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are
 * on the same line:
 * public static boolean sameLine(double[][] points)
 *  Write a program that prompts the user to enter five points and displays whether
 * they are on the same line. Here are sample runs:
 *
 *          Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
 *          The five points are not on the same line
 *
 *          Enter five points: 1 1 2 2 3 3 4 4 5 5
 *          The five points are on the same line
 *
 * @author DejanD
 */
public class Exercise_08_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] points = new double[5][2];
        
        System.out.print(" Enter five points: ");
        for (int i = 0; i < 5; i++){
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        
        if(sameLine(points)) System.out.println("The five points are on the same line");
        else System.out.println("The five points are not on the same line");
    }
    
    public static boolean sameLine(double[][] points){
        boolean result = true;
        for (int i = 0; i < points.length - 3; i++){
            result = result && onTheSameLine(points[i][0], points[i][1],
                                             points[i+1][0], points[i+1][1], 
                                             points[i+2][0], points[i+2][1]);
        }
        return result;
    }
    
    
    
    public static double getComparison(double x0, double y0,
                                       double x1, double y1,
                                       double x2, double y2)
    {
        return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
    }
    
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1,
                                        double x2, double y2)
    {
        return getComparison(x0, y0, x1, y1, x2, y2) == 0;
    }
    
}
