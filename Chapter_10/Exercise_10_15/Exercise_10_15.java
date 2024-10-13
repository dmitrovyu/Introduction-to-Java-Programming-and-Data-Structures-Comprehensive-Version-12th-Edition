
package Exercise_10_15;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum
 * rectangle that encloses a set of points in a two-dimensional plane, as shown in
 * Figure 10.24d. Write a method that returns a bounding rectangle for a set of
 * points in a two-dimensional plane, as follows:
 * public static MyRectangle2D getRectangle(double[][] points)
 * The Rectangle2D class is defined in Programming Exercise 10.13. Write a test
 * program that prompts the user to enter five points and displays the bounding
 * rectangle’s center, width, and height. Here is a sample run:
 *
 *          Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
 *          The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
 * 
 * @author DejanD
 */
public class Exercise_10_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] points = new double[5][2];
        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 2; j++)
                points[i][j] = in.nextDouble();
        MyRectangle2D rec = MyRectangle2D.getRectangle(points);
        System.out.println("The bounding rectangle's center (" + rec.getX() + ", " 
                            + rec.getY() + "), width " + rec.getWidth() + ", height " + rec.getHeight());
    }
}
