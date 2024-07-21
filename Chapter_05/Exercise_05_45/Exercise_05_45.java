
package Exercise_05_45;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Statistics: compute mean and standard deviation) In business applications, you
 * are often asked to compute the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the
 * ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter 10 numbers and displays the mean
 * and standard deviations of these numbers using the following formula:
 * Here is a sample run:
 *
 *          Enter 10 numbers: 1 2 3 4.5 5.6 6 7 8 9 10
 *          The mean is 5.61
 *          The standard deviation is 2.99794
 *
 * @author DejanD
 */
public class Exercise_05_45 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double sum = 0.0;
        double dev = 0.0;
        for (int i = 0; i < 10; i ++) {
            double input = in.nextDouble();
            sum += input;
            dev += Math.pow(input, 2);
        }
        System.out.printf("The mean is %5.2f\n",(sum/10));
        double deviation = Math.sqrt(((dev-(Math.pow(sum, 2)/10))/9));
        System.out.printf("The standard deviation is %3.5f", deviation);
        
        
    }
}
