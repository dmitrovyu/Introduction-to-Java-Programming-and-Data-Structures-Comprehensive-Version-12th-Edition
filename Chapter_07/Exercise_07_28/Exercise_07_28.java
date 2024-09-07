
package Exercise_07_28;

import java.util.Scanner;

/**
 *(Math: combinations) Write a program that prompts the user to enter 10 integers 
 * and displays all combinations of picking two numbers from the 10 numbers.
 * @author DEJAN
 */
public class Exercise_07_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input = new int[10];
        System.out.print("Please enter 10 integers: ");
        for (int i = 0; i < 10; i++){
            input[i]  =  in.nextInt();
        }
        for (int i = 0; i < 10; i++){
            for (int j = i+1; j <10; j++){
                System.out.println(input[i] + " " + input[j]);
            }
        }
   }   
}
   
