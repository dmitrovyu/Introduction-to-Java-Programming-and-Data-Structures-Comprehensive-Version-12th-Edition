
package Exercise_03_22;

import java.util.Scanner;

/**
 * **3.22 (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0) with
 * radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as
 * shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is. 
 * Test your program to cover all cases.) Two sample runs are shown below:
 *
 *      Enter a point with two coordinates: 4 5
 *      Point (4.0, 5.0) is in the circle
 *
 *      Enter a point with two coordinates: 9 9
 *      Point (9.0, 9.0) is not in the circle
 *
 * @author DejanD
 * */
public class Exercise_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coordX = input.nextDouble();
        double coordY = input.nextDouble();
        double dist = Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2));
        if (dist < 10) System.out.println("Point (" + coordX + ", " + coordY + ") is in the circle");
        else System.out.println("Point (" + coordX + ", " + coordY + ") is not in the circle");
    }
    
    
    
    
}
