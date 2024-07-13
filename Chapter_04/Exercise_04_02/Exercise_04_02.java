package Exercise_04_02;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.2 (Geometry: great circle distance) The great circle distance is the
 * distance between two points on the surface of a sphere. Let (x1, y1) and (x2,
 * y2) be the geographical latitude and longitude of two points. The great
 * circle distance between the two points can be computed using the following
 * formula: d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1
 * - y2)) Write a program that prompts the user to enter the latitude and
 * longitude of two points on the earth in degrees and displays its great circle
 * distance. The average radius of the earth is 6,371.01 km. Note you need to
 * convert the degrees into radians using the Math.toRadians method since the
 * Java trigonometric methods use radians. The latitude and longitude degrees in
 * the formula are for north and west. Use negative to indicate south and east
 * degrees. Here is a sample run:
 *
 * Enter point 1 (latitude and longitude) in degrees: 39.55 −116.25 Enter point
 * 2 (latitude and longitude) in degrees: 41.5 87.37 The distance between the
 * two points is 10691.79183231593 km
 *
 * @author Sharaf Qeshta
 *
 */
public class Exercise_04_02 {

    public static final double RADIUS = 6371.01;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = in.nextDouble();
        double long1 = in.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = in.nextDouble();
        double long2 = in.nextDouble();

        // The great circle distance
        double d = RADIUS * Math.acos(Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.cos(Math.toRadians(long1 - long2)));
        System.out.println("The distance between the two points is " + d + " km");
    }
}
