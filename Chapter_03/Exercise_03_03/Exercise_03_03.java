
package Exercise_03_03;

import java.util.Scanner;

/**
 * *3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 *
 *      Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
 *      x is -2.0 and y is 3.0
 *
 *      Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
 *      The equation has no solution
 *
 * @author DejanD
 *
 **/
public class Exercise_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble(),
               b = input.nextDouble(),
               c = input.nextDouble(),
               d = input.nextDouble(),
               e = input.nextDouble(),
               f = input.nextDouble();
        double check = a * d - b * c;
        if (check == 0) System.out.println("The equatation has no solution");
        else System.out.println("x is " + (e * d - b * f) / check + " and y is " + 
                (a *f - e * c) / check);
        
    }
}
