
package Exercise_03_34;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.34 (Geometry: point on line segment) Exercise 3.32 shows how to test whether a point
 * is on an unbounded line. Revise Exercise 3.32 to test whether a point is on a line
 * segment. Write a program that prompts the user to enter the three points for p0,
 * p1, and p2 and displays whether p2 is on the line segment from p0 to p1. Here are
 * some sample runs:
 *
 *             Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 *             (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 *
 *              Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 *              (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_03_34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double  x0 = in.nextDouble(),
                y0 = in.nextDouble(),
                x1 = in.nextDouble(),
                y1 = in.nextDouble(),
                x2 = in.nextDouble(),
                y2 = in.nextDouble();
               

        double func = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        
         if (func == 0 && (((x1 > x0) ? ((x2 < x1) && (x2 > x0)) : ((x2 > x1) &&(x2 < x0))))) {
            System.out.println("(" + x2 +", " + y2 + ")" + "is on the same line segment from (" + x1 + ", " + y1 +")" + 
                    "and (" + x0 + ", " + y0 + ")");
        } else {
            System.out.println("(" + x2 +", " + y2 + ")" + "is not on the same line segment from (" + x1 + ", " + y1 +")" + 
                    "and (" + x0 + ", " + y0 + ")");
        }

    }
    
}
