
package Exercise_09_10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + c = 0. The class contains:
 * ■ Private data fields a, b, and c that represent three coefficients.
 * ■ A constructor with the arguments for a, b, and c.
 * ■ Three getter methods for a, b, and c.
 * ■ A method named getDiscriminant() that returns the discriminant, which
 * is b2 - 4ac.
 * ■ The methods named getRoot1() and getRoot2() for returning two roots
 * of the equation
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * Draw the UML diagram for the class then implement the class. Write a test
 * program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 *          Enter a, b, c: 1.0 3 1
 *          The equation has two roots -0.381966 and -2.61803
 *
 *          Enter a, b, c: 1 2.0 1
 *          The equation has one root -1.0
 *
 *          Enter a, b, c: 1 2 3
 *          The equation has no real roots
 * 
 * 
 * @author DejanD
 */
public class Exercise_09_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        QuadraticEquation equatation = new QuadraticEquation(a,b,c);
        if (equatation.getDiscriminant() < 0) System.out.println("The equation has no roots.");
        else if (equatation.getDiscriminant() == 0) System.out.printf("The equation has one root: %3.3f", 
                 equatation.getRoot1());
        else System.out.printf("The equation has two roots: %3.3f and %3.3f",equatation.getRoot1()
                                ,equatation.getRoot2());
    }
}
