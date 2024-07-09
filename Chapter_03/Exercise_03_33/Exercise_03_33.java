
package Exercise_03_33;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.33 (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price.
 */

public class Exercise_03_33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1: ");
        double weight1 = in.nextDouble();
        double price1 = in.nextDouble();
        System.out.println("Enter weight and price for package 2: ");
        double weight2 = in.nextDouble();
        double price2 = in.nextDouble();
        if (price1/weight1 < price2/weight2)
            System.out.println("Package 1 has a better price");
        else if (price1/weight1 == price2/weight2)
            System.out.println("Two packages have the same price.");
        else
            System.out.println("Package 2 has a better price");
        
    }
    
}
