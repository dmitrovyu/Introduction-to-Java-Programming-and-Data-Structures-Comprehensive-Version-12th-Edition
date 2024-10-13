
package Exercise_09_12;

import java.util.Locale;
import java.util.Scanner;

/**
 *(Geometry: intersecting point) Suppose two line segments intersect.
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * equation. See Programming Exercise 3.25 for sample runs.
 * 
 * @author DejanD
 */
public class Exercise_09_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();
        /*     a            b                     e
         *  (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
         *     c            d                     f
         *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        */      
        double a = y1 - y2;
        double b = x1 - x2;
        double e = (y1 - y2)*x1 - (x1 - x2)*y1;
        double c = y3 - y4;
        double d = x3 - x4;
        double f = (y3 - y4)*x3 - (x3 - x4)*y3;
        
        LinearEquation equat = new LinearEquation(a,b,c,d,e,f);
        if (!equat.isSolvable()) System.out.println("The two lines are parallel");
        else System.out.printf("The intersecting point is at (%3.2f, %3.2f)", equat.getX(), equat.getY());
        
    }
    
}
