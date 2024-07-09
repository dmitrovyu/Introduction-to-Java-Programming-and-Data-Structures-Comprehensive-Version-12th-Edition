
package Exercise_03_25;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.25 (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
 * The intersecting point of the two lines can be found by solving the following linear
 * equations:
 *  (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *  This linear equation can be solved using Cramer’s rule
 *  (see Programming Exercise 3.3). If the equation has no solutions,
 *  the two lines are parallel (see Figure 3.8c)
 *  Write a program that prompts the user to enter four points and displays the
 *  intersecting point. Here are sample runs
 *
 *          Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 *          The intersecting point is at (2.88889, 1.1111)
 *
 *          Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 *          The two lines are parallel
 *
 * @author DejanD
 *  */

public class Exercise_03_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.println(" Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        //First line
        double x1 = input.nextDouble(),
               y1 = input.nextDouble(),
               x2 = input.nextDouble(),
               y2 = input.nextDouble(),
        //Second line
               x3 = input.nextDouble(),
               y3 = input.nextDouble(),
               x4 = input.nextDouble(),
               y4 = input.nextDouble();
        
        //Calculate slope for both lines
        double mL1;
        double mL2;
        //check if lines are perpendicular to X axes
        if (x2-x1 != 0 ) {
            mL1 = (y2-y1) / (x2-x1);
        } else mL1 = 0;
        if (x3-x4 != 0) {
            mL2 = (y3-y4) / (x3-x4);
        } else mL2 = 0;
        
        if (mL1 == mL2)
            System.out.println("The two lines are parallel");
        else {
            
            //Calculate for the first line
            double a1 = y2 - y1;
            double b1 = x1 - x2;
            double c1 = (y2 - y1)*x1 + (x1-x2)*y1;
            
            //Calculate for the second line
            double a2 = y4-y3;
            double b2 = x3 - x4;
            double c2 = (y4-y3)*x3 + (x3-x4)*y3;
            System.out.println(a1  + ", " + b1 + ", " + c1);
            //calculate Determinants and point
            double D = a1 * b2 - a2 * b1;
            double x = (c1 * b2 - c2 * b1)/D;
            double y =   (a1 *c2 - a2 * c1) / D;
            
            System.out.printf("The intersecting point is at : (%5.3f, %5.3f)",x,y);
            
        }
    }
    
}
