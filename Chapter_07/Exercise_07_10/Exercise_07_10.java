
package Exercise_07_10;

import java.util.Scanner;

/**
 *
 * (Find the index of the smallest element) Write a method that returns the index of 
 * the smallest element in an array of integers. If the number of such elements is 
 * greater than 1, return the smallest index. Use the following header:
 *      public static int indexOfSmallestElement(double[] array)
 * 
 * @author DejanD
 */
public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            array[i] = in.nextDouble();
        }
        System.out.println("The index of the minimal value is: " + indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
            index = i;
        }
        return index;
    }
}

