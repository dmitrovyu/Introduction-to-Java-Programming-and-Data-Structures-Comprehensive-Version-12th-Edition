
package Exercise_07_18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The 
 * bubble-sort algorithm makes several passes through the array. On each pass, 
 * successive neighboring pairs are compared. If a pair is not in order, its values are 
 * swapped; otherwise, the values remain unchanged. The technique is called a bubble 
 * sort or sinking sort because the smaller values gradually “bubble” their way to 
 * the top, and the larger values “sink” to the bottom. Write a test program that reads 
 * in 10 double numbers, invokes the method, and displays the sorted numbers.
 * @author DejanD
 */
public class Exercise_07_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] num = new double[10];
        System.out.println("Enter 10 double numbers: ");
        for (int i =0; i < 10; i++){
            num[i] = in.nextDouble();
        }
        System.out.println("Sorted array of numbers: ");
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
    //Sorting both arrays with bubble sort
    public static void bubbleSort(double[] num){
        for (int i= 0; i < num.length; i++){
            for (int j = i+1; j < num.length; j++){
                if (num[i] > num[j]){
                    double temp =num[i];
                    num[i] = num[j];
                    num[j] = temp;
                
              }
            }
        } 
    }
}
