
package Exercise_07_30;

import java.util.Scanner;

/**
 *
 * (Pattern recognition: consecutive four equal numbers) Write the following 
 * method that tests whether the array has four consecutive numbers with the same value:
 *      public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers
 * and displays it if the series contains four consecutive numbers with the same value.
 * Your program should first prompt the user to enter the input size—i.e., 
 * the number of values in the series. 
 * 
 * Here are sample runs:
 * 
 * Enter the number of values: 8 
 * Enter the values: 3 4 5 5 5 5 4 5 
 * The list has consecutive fours
 * Enter the number of values: 9 
 * Enter the values: 3 4 5 5 6 5 5 4 5 
 * The list has no consecutive fours
 * 
 * @author DejanD
 */
public class Exercise_07_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        if (isConsecutiveFour(arr)) 
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values){
        int consecutive = 0;
        for (int i = 0; i < values.length-1; i++){
            if (values[i] == values[i+1]) {
                consecutive++;
                if (consecutive == 3) return true;
            }
            else consecutive = 0;
        }
        return false;
    }
    
}
