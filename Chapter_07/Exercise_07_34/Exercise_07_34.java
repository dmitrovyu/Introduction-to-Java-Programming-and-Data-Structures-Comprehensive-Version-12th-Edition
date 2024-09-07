
package Exercise_07_34;

import java.util.Arrays;
import java.util.Scanner;

/**
 *(Sort characters in a string) Write a method that returns a sorted string 
 * using the following header:
 *          public static String sort(String s)
 * For example, sort("acb") returns abc.Write a test program that prompts 
 * the user to enter a string and displays the sorted string.
 * 
 * @author DEJAN
 */
public class Exercise_07_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        System.out.print("Sorted string: "  + sort(input));
    }
     public static String sort(String s){
         char[] arr = s.toCharArray();
         for (int i = 0; i < arr.length-1; i++){
             int smallest = i+1;
             for (int j = i+1; j < arr.length; j++){
                 if (arr[j]<arr[smallest]) smallest = j;
             }
             if (arr[i] > arr[smallest]){
                 char temp = arr[smallest];
                 arr[smallest] = arr[i];
                 arr[i] = temp;
             }
         }
         return new String(arr);
     }
}

