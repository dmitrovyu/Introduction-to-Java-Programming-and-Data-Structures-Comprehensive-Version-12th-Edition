
package Exercise_08_34;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  (Geometry: rightmost lowest point) In computational geometry, often you need
 * to find the rightmost lowest point in a set of points. Write the following method
 * that returns the rightmost lowest point in a set of points:
 * public static double[]
 *  getRightmostLowestPoint(double[][] points)
 *  Write a test program that prompts the user to enter the coordinates of six points
 * and displays the rightmost lowest point. Here is a sample run:
 *
 *      Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
 *      The rightmost lowest point is (6.5, −7.0)
 * @author DejanD
 */
public class Exercise_08_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter 6 points: ");
        double[][] points = new double[6][2];
        for (int i = 0; i < 6; i++){
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        double[] point = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + point[0] + ", " + point[1] + ")");
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        int rightmostIndex = 0;
        double rightmostX = points[0][0];
        double rightmostY = points[0][1];
        for (int i = 0; i < points.length; i++){
            if (points[i][1] < rightmostY){
                rightmostIndex = i;
                rightmostX = points[i][0];
                rightmostY = points[i][1];
            }
            else if (points[i][1] == rightmostY && points[i][0] > rightmostX ){
                rightmostIndex = i;
                rightmostX = points[i][0];
                rightmostY = points[i][1];
                
            }
        }
        return points[rightmostIndex];
    }
}
