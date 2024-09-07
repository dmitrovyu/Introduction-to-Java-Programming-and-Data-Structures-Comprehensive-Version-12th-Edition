
package Exercise_07_20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Revise selection sort) In Listing 7.8, you used selection sort to sort an array. The 
 * selection-sort method repeatedly finds the smallest number in the current array 
 * and swaps it with the first. Rewrite this program by finding the largest number and 
 * swapping it with the last. Write a test program that reads in 10 double numbers, 
 * invokes the method, and displays the sorted numbers.
 * @author DejanD
 */
public class Exercise_07_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] num = new double[10];
        System.out.println("Enter 10 double numbers: ");
        for (int i =0; i < 10; i++){
            num[i] = in.nextDouble();
        }
        System.out.println("Sorted array of numbers: ");
        selectionSort(num);
        System.out.println(Arrays.toString(num));
        
    }
    //Sorting  array with selection-sort
    public static void selectionSort(double[] num){
        for (int i = 0; i < num.length; i++){
            double max = num[i];
            int pos = i;
            for (int j = i+1; j < num.length; j++){
                if (num [j] > max ) {
                    pos = j;
                    max = num[j];
                }
            }
            double temp = num[i];
            num[i] = num[pos];
            num[pos] = temp;
         }
    }
}
