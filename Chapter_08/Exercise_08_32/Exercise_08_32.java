
package Exercise_08_32;

import java.util.Locale;
import java.util.Scanner;

/**
 *(Geometry: area of a triangle) Write a method that returns the area of a triangle
 * using the following header:
 *      public static double getTriangleArea(double[][] points)
 *  The points are stored in a 3-by-2 two-dimensional array points with points
 * [0][0] and points[0][1] for (x1, y1). The triangle area can be computed
 * using the formula in Programming Exercise 2.19. 
 * The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = √[s(s - side1)(s - side2)(s - side3)]
 * The method returns 0 if the three points are on the same line. 
 * Write a program that prompts the user to enter
 * three points of a triangle and displays the triangle’s area. Here are the sample runs:
 *
 *              Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
 *              The area of the triangle is 2.25
 *
 *              Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
 *              The three points are on the same line
 *
 * @author DejanD
 */
public class Exercise_08_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < 3; i++){
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        double area = getTriangleArea(points);
        if (area == 0 ) System.out.println("The three points are on the same line");
        else System.out.printf("The area of the triangle is %5.2f ", area);
    }
    public static double getTriangleArea(double[][] points){
        
        //the distance between two points is
        // the square root of ((x2 - x1) ** 2) + ((y2 - y1) ** 2)

        // side 1
        double sideOne = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2)
                + Math.pow(points[1][1] - points[0][1], 2));

        // side 2
        double sideTwo = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2)
                + Math.pow(points[2][1] - points[1][1], 2));

        // side 3
        double sideThree = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2)
                + Math.pow(points[0][1] - points[2][1], 2));
      
        double s = (sideOne + sideTwo + sideThree) / 2;
        double sa = s * (s - sideOne) * (s - sideTwo) * (s - sideThree);
        if (sa > 0) return Math.sqrt(sa);
        else return 0;
      

    }
}
