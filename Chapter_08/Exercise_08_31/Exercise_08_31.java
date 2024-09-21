
package Exercise_08_31;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * * *8.31 (Geometry: intersecting point) Write a method that returns the intersecting point of
 * two lines. The intersecting point of the two lines can be found by using the formula
 * given in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 * two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is:
 * public static double[] getIntersectingPoint(double[][] points)
 *  The points are stored in a 4-by-2 two-dimensional array points with (points
 * [0][0], points[0][1]) for (x1, y1). The method returns the intersecting point
 * or null if the two lines are parallel. Write a program that prompts the user to enter
 * four points and displays the intersecting point. See Programming Exercise 3.25
 * for a sample run.
 * 
 * Here are sample runs
 *
 *          Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 *          The intersecting point is at (2.88889, 1.1111)
 *
 *          Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 *          The two lines are parallel
 * 
 * @author DejanD
 */
public class Exercise_08_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] points = new double[4][2];
        System.out.println("Enter four points: ");
        for (int i = 0; i < 4; i++){
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        
        double[] intersectiongPoint = getIntersectingPoint(points);
        if (intersectiongPoint == null) System.out.println("The two lines are parallel");
        else System.out.printf("The intersecting point is at : (%5.3f, %5.3f)",
                intersectiongPoint[0],intersectiongPoint[1]);
        
    }
    
    public static double[] getIntersectingPoint(double[][] points){
        //Calculate slope for both lines
        double x1=points[0][0], y1=points[0][1],x2=points[1][0],y2=points[1][1];
        double x3=points[2][0], y3=points[2][1],x4=points[3][0],y4=points[3][1];
       double denominator = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        if (denominator == 0) {
            return null; // Lines are parallel or coincident
        }

        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denominator;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denominator;

        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            double x = x1 + ua * (x2 - x1);
            double y = y1 + ua * (y2 - y1);
            return new double[]{x, y};
        }

        return null; // Intersection point is not within the line segments
    }
}
