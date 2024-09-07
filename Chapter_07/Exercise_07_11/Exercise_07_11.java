
package Exercise_07_11;

import java.util.Scanner;

/**
 *
 * *7.11 (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 * deviation of numbers. This exercise uses a different but equivalent formula to
 * compute the standard deviation of n numbers.
 * To compute the standard deviation with this formula, you have to store
 * the individual numbers using an array, so they can be used after the mean is obtained.
 * Your program should contain the following methods:
 *
 * public static double deviation(double[] x)
 *
 * public static double mean(double[] x)
 *
 * Write a test program that prompts the user to enter 10 numbers and displays the
 * mean and standard deviation, as presented in the following sample run:
 *
 *          Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
 *          The mean is 3.11
 *          The standard deviation is 1.55738
 *
 * @author DejanD
 * */
public class Exercise_07_11 {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i <10; i++){
            array[i] = in.nextDouble();
        }
        System.out.printf("The mean is %3.2f\n", mean(array));
        System.out.printf("The standard deviation is %3.5f",deviation(array));
                
    }
     /** Compute the deviation of double values */ 
    public static double deviation(double[] x){
        double mean = mean(x);
        double sum = 0;
        for (int i = 0; i < x.length; i++){
            sum+= Math.pow(x[i]-mean, 2);
        }
        return Math.sqrt(sum/(x.length-1));
    }
    /** Compute the mean of an array of double values */
    public static double mean(double[] x){
        double sum = 0;
        for (double n : x){
            sum += n;
        }
        return sum / x.length;
    }
}
