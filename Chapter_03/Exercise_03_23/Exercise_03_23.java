
package Exercise_03_23;

import java.util.Locale;
import java.util.Scanner;

/**
 * **3.23 (Geometry: point in a rectangle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the rectangle centred at (1, 1)
 * with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4)
 * is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle
 * if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical
 * distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all
 * cases.) Here are two sample runs.
 *
 *          Enter a point with two coordinates: 2 2
 *          Point (2.0, 2.0) is in the rectangle
 *
 *          Enter a point with two coordinates: 6 4
 *          Point (6.0, 4.0) is not in the rectangle
 *
 * @author DejanD
 * */
public class Exercise_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a point with two coordinates: ");
        double coordX = input.nextDouble();
        double coordY = input.nextDouble();
        if ((coordX <= 10 / 2)  && (coordX >= -10 /2) 
                && (coordY <= 5.0 / 2) && (coordY > -5.0 /2))
            System.out.println("Point (" + coordX + ", " + coordY + ") is in the rectangle");
        else 
            System.out.println("Point (" + coordX + ", " + coordY + ") is not in the rectangle");
        
    }
    
}
