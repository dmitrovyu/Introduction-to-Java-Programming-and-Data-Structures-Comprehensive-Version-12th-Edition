
package Exercise_03_19;

import java.util.Scanner;

/**
 * **3.19 (Compute the perimeter of a triangle) Write a program that reads three edges for a
 * triangle and computes the perimeter if the input is valid. Otherwise, display that the
 * input is invalid. The input is valid if the sum of every pair of two edges is greater
 * than the remaining edge.
 *
 * @author DejanD
 * */
public class Exercise_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three egdes of triangle: ");
        double edge1 = input.nextDouble(),
               edge2 = input.nextDouble(),
               edge3 = input.nextDouble();
        boolean isValid = (edge1 < (edge2 + edge3)) &&
                          (edge2 < (edge1 + edge3)) &&
                          (edge3 < (edge1 + edge2));
        if (isValid) System.out.println("The perimeter is: " + (edge1 + edge2 + edge3));
        else System.out.println("The input is invalid");
               
    }
}
