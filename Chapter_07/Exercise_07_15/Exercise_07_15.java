package Exercise_07_15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the 
 * duplicate values in the array using the following method header:
 *          public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in 10 integers, invokes the method, and displays 
 * the distinct numbers separated by exactly one space. Here is a sample run of the program
 *          Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
 *          The distinct numbers are: 1 2 3 6 4 5
 * 
 * @author DejanD
 */
public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input =  new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            input[i] = in.nextInt();
        }
       
        System.out.print("The distinct numbers are: ");
        int[] distinct = eliminateDuplicates(input);
        for (int i =0; i < distinct.length; i++)
            System.out.print(distinct[i] + " ");
    }
    
    public static int[] eliminateDuplicates(int[] list){
        int[] distinct = new int[list.length];
        int j = 0;
        for (int i = 0; i < list.length; i++){
            if (!hasDuplicate(list[i], distinct)){
                distinct[j] = list[i];
                j++;
            }
        }
        //shorten array
        return Arrays.copyOfRange(distinct, 0, j);
      
    }
    
    //Helper method
    public static boolean hasDuplicate(int x, int[] distinct){
        for (int i = 0; i < distinct.length; i++){
            if ( x == distinct[i]) return true;
        }
        return false;
    }
}
