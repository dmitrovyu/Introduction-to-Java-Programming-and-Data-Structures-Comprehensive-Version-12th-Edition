
package Exercise_07_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Sorted?) Write the following method that returns true if the list is 
 * already sorted in nondecreasing order:
 *      public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list and displays 
 * whether the list is sorted or not. Here is a sample run. 
 * Note that the program first prompts the user to enter the size of the list.
 * 
 * @author DejanD
 */
public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of list: " );
        int listSize = in.nextInt();
        int[] list = new int[listSize];
        System.out.print("Enter the contents of the list: ");
        for (int i =0; i < listSize; i++){
            list[i] = in.nextInt();
        }
        System.out.print("The list has " + list.length + " integers ");
        for (int i =0; i < listSize; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println("");
        System.out.println("The list" + ((isSorted(list)) ? " is already" : " is not") + 
                " sorted");
        
    }
    public static boolean isSorted(int[] list){
        int[] orderedList = Arrays.copyOf(list, list.length);
        Arrays.sort(orderedList);
        for (int i = 0; i < list.length; i++){
            if (list[i] != orderedList[i])  return false;
        }
        return true;
    }
}
