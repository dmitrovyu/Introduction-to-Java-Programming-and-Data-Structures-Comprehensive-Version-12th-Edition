
package Exercise_03_27;

import java.util.Locale;
import java.util.Scanner;

/**
 * **3.27 (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle. Here are the sample runs:
 *
 *          Enter a point’s x- and y-coordinates: 100.5 25.5
 *          The point is in the triangle
 *
 *          Enter a point’s x- and y-coordinates: 100.5 50.5
 *          The point is not in the triangle
 *
 * @author DejanD
 * */

public class Exercise_03_27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        /* Formula for the line of triangle is y = 100-x/2
        */
        double calcY = 100 - x / 2; // calculate the y coord on triangle line
        if ( x < 0 || x > 200 || y < 0)
            System.out.println("The point is not in the triangle");
        else if (y <= calcY)
            System.out.println("The point is in the triangle");
        else 
            System.out.println("The point is not in the triangle");
        
    }
}
