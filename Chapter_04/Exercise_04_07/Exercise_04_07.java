
package Exercise_04_07;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order.
 * Use console format to display two digits after the decimal point.
*/
public class Exercise_04_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the radius of the bounding circle: ");
        double radius = in.nextDouble();
        //coordinates of starting point
        double x2 = 0;
        double y2 = radius;
        //rotation to point p1 Turning clockwise by 72° and the horizontal axis is 90°−72°=18°
        double x1 = radius*Math.cos(Math.toRadians(18));
        double y1 = radius*Math.sin(Math.toRadians(18));
        //rotation to point p5 Turning clockwise by 72° and the horizontal axis is 90°−72°-72°=-54°
        double x5 = radius*Math.cos(Math.toRadians(-54));
        double y = radius*Math.sin(Math.toRadians(-54));
    }
}
