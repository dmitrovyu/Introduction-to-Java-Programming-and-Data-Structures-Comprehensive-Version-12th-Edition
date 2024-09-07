
package Exercise_07_02;

import java.util.Scanner;

/**
 *
 * Reverse the numbers entered) Write a program that reads 10 integers then displays 
 * them in the reverse of the order in which they were read.
 * @author DEJAN
 */
public class Exercise_07_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[10];
        System.out.print("Please enter 10 int numbers: ");
        for (int i = 0; i < 10; i++){
            list[i] = in.nextInt();
        }
        
        
    // Display the array reversely
        System.out.print("Reversed: ");
        for (int i = list.length-1; i>=0; i--){
            System.out.print(list[i] + " ");
        }
    }
}
