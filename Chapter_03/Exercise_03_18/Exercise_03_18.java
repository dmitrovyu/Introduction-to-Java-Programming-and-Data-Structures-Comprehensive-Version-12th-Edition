
package Exercise_03_18;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.18 (Cost of shipping) A shipping company uses the following function to calculate the
 * cost (in dollars) of shipping based on the weight of the package (in pounds).
 * c(w) =
 **//*      2.5, if 0 < w <= 2
 *          4.5, if 2 < w <= 4
 *          7.5, if 4 < w <= 10
 *          10.5, if 10 < w <= 20
 *  Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 20, display a message “the
 * package cannot be shipped.”
 *
 * @author DejanD
 * */

public class Exercise_03_18 {
    public static void main(String[] args) {
        
        System.out.print("Please enter the weight of the package: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double weight = input.nextDouble();
        if ( weight <=0 ) System.out.println("Invalid input.");
        else if (weight > 20) System.out.println("The package can not be shipped.");
        else {
            double costOfShipping = 0;
            if (weight <= 1) costOfShipping = 3.5;
            else if (weight <= 3) costOfShipping = 5.5;
            else if (weight <= 10) costOfShipping = 10;
            else costOfShipping = 20;
            
            System.out.println("Total cost for shipping: " + weight + " pounds is " + costOfShipping + "$");
        }
    }
}
