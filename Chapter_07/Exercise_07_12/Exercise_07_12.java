
package Exercise_07_12;

import java.util.Scanner;

/**
 *
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by 
 * copying it to a new array. Rewrite the method that reverses the array passed in 
 * the argument and returns this array. Write a test program that prompts the user to 
 * enter 10 numbers, invokes the method to reverse the numbers, and displays the 
 * numbers
 * 
 * @author DejanD
 */
public class Exercise_07_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            array[i] = in.nextDouble();
        }
        System.out.print("Reversed array: " );
        double[] reversed = reverse(array);
        for (int i = 0; i < reversed.length; i++){
            System.out.print(reversed[i] + " ");
        }
        
    }
    public static double[] reverse(double[] list) {
    for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
      double temp = list[i];
      list[i] = list[j];
      list[j] = temp;
    }

    return list;
  }

    
}
