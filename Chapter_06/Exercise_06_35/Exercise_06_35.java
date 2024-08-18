
package Exercise_06_35;

import java.util.Scanner;

/**
 *
 * @author DEJAN
 */
public class Exercise_06_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = in.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }
     public static double area(double side){
         double area = (5 * side * side) / (4 * Math.tan(Math.PI/5));
         return area;
     }
}
