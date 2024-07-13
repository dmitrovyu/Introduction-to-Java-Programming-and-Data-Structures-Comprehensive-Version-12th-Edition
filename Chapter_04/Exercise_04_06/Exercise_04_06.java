
package Exercise_04_06;

import java.util.Locale;

/**
 * *4.6 (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points, as shown in Figure 4.4a. (Hint: Generate a random
 * angle a in radians between 0 and 2π, as shown in Figure 4.4b and the point
 * determined by this angle is (r^x cos(ά), r^x sin(ά))
 *
 * @author DejanD
 * */

public class Exercise_04_06 {
    public static final int RADIUS = 40;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double p1x = RADIUS * Math.cos(2*Math.PI*Math.random()),
               p1y = RADIUS * Math.sin(2*Math.PI*Math.random()),
               p2x = RADIUS * Math.cos(2*Math.PI*Math.random()),
               p2y = RADIUS * Math.sin(2*Math.PI*Math.random()),
               p3x = RADIUS * Math.cos(2*Math.PI*Math.random()),
               p3y = RADIUS * Math.sin(2*Math.PI*Math.random());
        
          // Compute three sides
        double a = Math.sqrt(Math.pow(p2x - p3x, 2) + Math.pow(p2y - p3y, 2));
        double b = Math.sqrt(Math.pow(p1x - p3x, 2) + Math.pow(p1y - p3y, 2));
        double c = Math.sqrt(Math.pow(p1x - p2y, 2) + Math.pow(p1y - p2y, 2));
        
             // Compute three angles
        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));
        //Display points
        System.out.println("The three points are: (" + p1x + ", " + p1y + ") " + 
                "(" + p2x + ", " + p2y + ") " + "(" + p3x + ", " + p3y + ") ");
        //Display angles
        System.out.println("The three angles are " +
                Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " +
                Math.round(angleC * 100) / 100.0);
    }
}
