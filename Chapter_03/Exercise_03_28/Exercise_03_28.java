package Exercise_03_28;

import java.util.Locale;
import java.util.Scanner;

/**
 * **3.28 (Geometry: two rectangles) Write a program that prompts the user to
 * enter the center x-, y-coordinates, width, and height of two rectangles and
 * determines whether the second rectangle is inside the first or overlaps with
 * the first, as shown in Figure 3.9. Test your program to cover all cases. Here
 * are the sample runs:
 *
 * Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43 Enter
 * r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3 r2 is inside r1
 *
 * Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5 Enter r2’s
 * center x-, y-coordinates, width, and height: 3 4 4.5 5 r2 overlaps r1
 *
 * Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 3 Enter r2’s
 * center x-, y-coordinates, width, and height: 40 45 3 2 r2 does not overlap r1
 *
 * @author Sharaf Qeshta
 *
 */
public class Exercise_03_28 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
        double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;

        if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2) {
            System.out.println("r2 is inside r1");
        } else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
