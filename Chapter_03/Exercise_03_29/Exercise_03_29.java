package Exercise_03_29;

import java.util.Locale;
import java.util.Scanner;

/**
 * **3.29 (Geometry: two circles) Write a program that prompts the user to
 * enter the center coordinates and radii of two circles and determines whether
 * the second circle is inside the first or overlaps with the first, as shown in
 * Figure 3.10. (Hint: circle2 is inside circle1 if the distance between the two
 * centers 6 = r1 - r2 and circle2 overlaps circle1 if the distance between the
 * two centers 6 = r1 + r2. Test your program to cover all cases.) Here are the
 * sample runs:
 *
 * Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13 Enter
 * circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5 circle2 is inside
 * circle1
 *
 * Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.7 5.5 Enter
 * circle2’s center x-, y-coordinates, and radius: 6.7 3.5 3 circle2 overlaps
 * circle1
 *
 * Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.5 1 Enter
 * circle2’s center x-, y-coordinates, and radius: 5.5 7.2 1 circle2 does not
 * overlap circle1
 *
 * @author DejanD
 *
 */
public class Exercise_03_29 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        //First circle
        System.out.println("Enter center coordinates and radius of the first circle: x,y,r");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double r1 = in.nextDouble();

        //Second circle
        System.out.println("Enter center coordinates and radius of the second circle: x,y,r");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double r2 = in.nextDouble();

        double distanceX = (x1 > x2) ? (x1 - x2) : (x2 - x1);
        double distanceY = (y1 > y2) ? (y1 - y2) : (y2 - y1);
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

        if (distance <= r1 - r2) {
            System.out.println("circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }

    }

}
