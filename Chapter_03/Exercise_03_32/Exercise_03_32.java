package Exercise_03_32;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.32 (Geometry: point position) Given a directed line from point p0(x0, y0)
 * to p1(x1, y1), you can use the following condition to decide whether a point
 * p2(x2, y2) is on the left of the line, on the right, or on the same line (see
 * Figure 3.11): (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) => { >0 p2 is on the
 * left side of the line =0 p2 is on the same line
 * <0 p2 is on the right side of the line>
 *
 * }
 * Write a program that prompts the user to enter the three points for p0, p1,
 * and p2 and displays whether p2 is on the left of the line from p0 to p1, to
 * the right, or on the same line. Here are some sample runs:
 *
 * Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4 p2 is on the left
 * side of the line
 *
 * Enter three points for p0, p1, and p2: 1 1 5 5 2 2 p2 is on the same line
 *
 * Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5 p2 is on the right
 * side of the line
 *
 * @author DEJAND
 *
 */
public class Exercise_03_32 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = in.nextDouble(),
                y0 = in.nextDouble(),
                x1 = in.nextDouble(),
                y1 = in.nextDouble(),
                x2 = in.nextDouble(),
                y2 = in.nextDouble();

        double func = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (func > 0) {
            System.out.println("p2 is on the left side of the line");
        } else if (func == 0) {
            System.out.println("p2 is on the same line");
        } else {
            System.out.println("p2 is on the right side of the line");
        }

    }
}
