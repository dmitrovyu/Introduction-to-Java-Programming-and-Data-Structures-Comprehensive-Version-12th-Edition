
package Exercise_09_11;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Algebra: 2 * 2 linear equations) Design a class named 
 * LinearEquation for a 2 * 2 system of linear equations:
 *
 *          ax + by = e    x = (ed - bf) / (ad - bc)
 *          cx + dy = f    y = (af - ec) / (ad - bc)
 * The class contains:
 * ■ Private data fields a, b, c, d, e, and f.
 * ■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■ Six getter methods for a, b, c, d, e, and f.
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■ Methods getX() and getY() that return the solution for the equation.
 * Draw the UML diagram for the class then implement the class. Write a test program
 * that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” 
 * See Programming Exercise 3.3 for sample runs.
 *
 * @author DejanD
 */
public class Exercise_09_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();
        
        LinearEquation equat = new LinearEquation(a, b, c, d, e, f);
        if (equat.isSolvable()) System.out.printf("x is %3.3f and y is %3.3f", equat.getX() 
                , equat.getY());
        else System.out.println("The equation has no solution");
        
    }
}
