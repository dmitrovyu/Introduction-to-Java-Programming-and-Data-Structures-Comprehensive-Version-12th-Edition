
package Exercise_08_07;

import java.util.Scanner;

/**
 *
 * *8.7 (Points nearest to each other) Listing 8.3 gives a program that finds two points in
 * a two-dimensional space nearest to each other. Revise the program so it finds two
 * points in a three-dimensional space nearest to each other. Use a two-dimensional
 * array to represent the points. Test the program using the following points:
 * double[][] points = {{−1, 0, 3}, {−1, −1, −1}, {4, 1, 1},
 *  {2, 0.5, 9}, {3.5, 2, −1}, {3, 1.5, 3}, {−1.5, 4, 2},
 *  {5.5, 4, −0.5}};
 *
 *  The formula for computing the distance between two points (x1, y1, z1) and
 *  (x2, y2, z2) is √[(△x)² + (△y)² + (△z)²]
 * 
 * @author DejanD
 */
public class Exercise_08_07 {
    public static void main(String[] args) {
         double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};      

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[0],points[1]); // Initialize shortestDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++)
        {
            for (int j = i + 1; j < points.length; j++)
            {
                double distance = distance(points[i],points[j]); // Find distance

                if (shortestDistance > distance)
                {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }

        // Display result
        System.out.println("The closest two points are " +
                "(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ", " + points[p1][2] + ")");
        System.out.println("Distance between these points is: " + shortestDistance);
    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     */
    public static double distance(double[] point1, double[] point2){
        return Math.sqrt(Math.pow((point2[0] - point1[0]),2) + 
                Math.pow((point2[1] - point1[1]),2) + Math.pow((point2[2] - point1[2]),2));
    }

    
}
