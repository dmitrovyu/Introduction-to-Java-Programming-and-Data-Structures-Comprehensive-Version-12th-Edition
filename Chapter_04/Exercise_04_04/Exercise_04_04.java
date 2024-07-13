
package Exercise_04_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * 4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * Area = (6 * s²) / [4 * tan(π/6)]
 *  Write a program that prompts the user to enter the side of a hexagon and displays
 * its area. Here is a sample run:
 *
 *          Enter the side: 5.5
 *          The area of the hexagon is 78.59
 *
 * @author DejanD
 * */
public class Exercise_04_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the side: ");
        double side = in.nextDouble();
        double area = (6*side*side)/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the hexagon is %3.2f", area);
        
    }
    
}
