
package Exercise_06_05;

import java.util.Locale;
import java.util.Scanner;

/**
 *  (Sort three numbers) Write a method with the following header 
 * to display three numbers in increasing order:
 *          public static void displaySortedNumbers(
 *          double num1, double num2, double num3)
 * 
 * Write a test program that prompts the user to enter three numbers
 * and invokes the method to display them in increasing order.
 * 
 * @author DejanD
 */
public class Exercise_06_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = in.nextDouble();
        displaySortedNumbers(num1,num2,num3);
        
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
         if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Numbers in incrisinig orders: " + num1 + " " + num2 + " " + num3);
    }
}
