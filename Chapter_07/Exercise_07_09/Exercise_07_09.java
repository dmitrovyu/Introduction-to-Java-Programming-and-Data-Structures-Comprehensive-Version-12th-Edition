
package Exercise_07_09;

import java.util.Scanner;

/**
 *(Find the smallest element) Write a method that finds the smallest element in an 
 * array of double values using the following header:
 *      public static double min(double[] array)
 * Write a test program that prompts the user to enter 10 numbers, invokes this 
 * method to return the minimum value, and displays the minimum value. Here is a 
 * sample run of the program:
 *      Enter 10 numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
 *      The minimum number is 1.5
 * 
 * @author DejanD
 */
public class Exercise_07_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            array[i] = in.nextDouble();
        }
        System.out.println("The minimum number is: " + min (array));
    }
    public static double min(double[] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
