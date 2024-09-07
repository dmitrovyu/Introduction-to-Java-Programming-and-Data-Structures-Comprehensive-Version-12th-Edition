package Exercise_07_08;

import java.util.Scanner;

/**
 * (Average an array) Write two overloaded methods that return the
 * average of an array with the following headers:
 *      public static double average(int[] array)
 *      public static double average(double[] array)
 * Write a test program that prompts the user to enter 10 integers, invokes the first 
 * method, then displays the average value; prompts the user to enter 10 double 
 * values, invokes the second method, then displays the average value.
 * 
 * @author DejanD
 */
public class Exercise_07_08 {
    public static void main(String[] args) {
        int[] integers = new int[10];
        double[] doubles = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 10 integer numbers: ");
        for (int i = 0; i <10; i++){
            integers[i] = in.nextInt();
        }
        System.out.println("Average value of 10 integers is: " + average(integers));
        System.out.println("Please enter 10 double numbers: ");
        for (int i = 0; i <10; i++){
            doubles[i] = in.nextDouble();
        }
        System.out.println("Average value of 10 doubles is: " + average(doubles));
    }
    public static double average(int[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static double average(double[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}
