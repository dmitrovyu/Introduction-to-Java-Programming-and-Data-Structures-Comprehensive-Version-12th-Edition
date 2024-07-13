package Exercise_04_01;

import java.util.Locale;
import java.util.Scanner;

/**
 * 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to
 * enter the length from the center of a pentagon to a vertex and computes the
 * area of the pentagon, as shown in the following figure. The formula for
 * computing the area of a pentagon is Area = (5 * s²) / [4 * tan(π/5)] , where
 * s is the length of a side. The side can be computed using the formula s = 2r
 * sin(π/5) , where r is the length from the center of a pentagon to a vertex.
 * Round up two digits after the decimal point. Here is a sample run:
 *
 * Enter the length from the center to a vertex: 5.5 The area of the pentagon is
 * 71.92
 *
 * @author DejanD
 *
 */
public class Exercise_04_01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        //radius of penthagon
        double r = in.nextDouble();
        //side of the penthagon
        double s = 2 * r * Math.sin(Math.PI / 5);
        //Area of the pethagon
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %4.2f", area);

    }
}
