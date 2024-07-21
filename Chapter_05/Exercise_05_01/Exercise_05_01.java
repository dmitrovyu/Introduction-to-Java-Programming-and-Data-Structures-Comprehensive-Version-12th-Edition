
package Exercise_05_01;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Count positive and negative numbers and compute the average of numbers) 
 * Write a program that reads an unspecified number of integers, determines how 
 * many positive and negative values have been read, and computes the total and average
 * of the input values (not counting zeros). Your program ends with the input 0. 
 * Display the average as a floating-point number. 
 * Here are sample runs:
 *  Enter an integer, the input ends if it is 0: 1 2 –1 3 0 
 *  The number of positives is 3
 *  The number of negatives is 1
 *  The total is 5.0
 *  The average is 1.25
 * 
 *  Enter an integer, the input ends if it is 0: 0 
 *  No numbers are entered except 0
 * 
 * @author DEJAN
 */
public class Exercise_05_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int noOfPositives = 0;
        int noOfNegatives = 0;
        double total = 0;
        int input;
        while ((input = in.nextInt()) != 0){
            if (input > 0) noOfPositives ++;
            else noOfNegatives++;
            total += input;
        }
        if (noOfPositives == 0 && noOfNegatives == 0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.println("The number of positives is " + noOfPositives);
            System.out.println("The number of negatives is " + noOfNegatives); 
            System.out.println("The total is " + total);
            System.out.println("The average is " + ((total)/(noOfPositives + noOfNegatives)));
        }
        
        
    }
    
}
