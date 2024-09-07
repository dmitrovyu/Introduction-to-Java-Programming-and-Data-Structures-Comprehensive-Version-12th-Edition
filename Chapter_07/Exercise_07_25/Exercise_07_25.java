
package Exercise_07_25;

import java.util.Scanner;

/**
 *
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic
 * equation using the following header:
 *          public static int solveQuadratic(double[] eqn, double[] roots)
 * The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 * array eqn and the real roots are stored in roots. The method returns the 
 * number of real roots. See Programming Exercise 3.1 on how to solve a 
 * quadratic equation.
 * Write a program that prompts the user to enter values for a, b, and c and 
 * displays the number of real roots and all real roots.
 * 
 * @author DejanD
 */
public class Exercise_07_25 {
    public static void main(String[] args) {
        double[] eqn = new double[3];
        double[] roots = new double [2];
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a, b, c: ");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();
        
        int noOfRealRoots = solveQuadratic(eqn,roots);
        if (noOfRealRoots == 2) System.out.printf("Equatation has two real roots: %3.5f , %3.5f" 
                ,roots[0], roots[1]);
        else if(noOfRealRoots == 1) System.out.printf("Equatation has one real root: %3.5f", 
                roots[0]);
        else System.out.println("Equatation has no real roots.");
        
         
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b, 2) - 4 * a * c;
            
            if (discriminant > 0) {
                       roots[0] = ((-b + Math.sqrt(discriminant)) / 2 * a);
                       roots[1] = ((-b - Math.sqrt(discriminant)) / 2 * a);
                       return 2;
                       
            }
            else if (discriminant == 0) {
                        roots[0]=((-b) / 2 * a);
                        return 1;
            }           
        return 0;
    }
}
