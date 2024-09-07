
package Exercise_07_31;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * * **7.31 (Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list:
 * public static int[] merge(int[] list1, int[] list2)
 *  Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. See liveexample.pearsoncmg.com/dsanimation/
 * MergeSortNeweBook.html for an animation of the implementation. Write a test
 * program that prompts the user to enter two sorted lists and displays the merged
 * list. Here is a sample run. Note the first number in the input indicates the number
 * of the elements in the list. This number is not part of the list.
 *
 *
 *          Enter list1 size and contents: 5 1 5 16 61 111
 *          Enter list2 size and contents: 4 2 4 5 6
 *          list1 is 1 5 16 61 111
 *          list2 is 2 4 5 6
 *          The merged list is 1 2 4 5 5 6 16 61 111
 * 
 * @author DejanD
 */
public class Exercise_07_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int list1Size = in.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++){
            list1[i] = in.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int list2Size = in.nextInt();
        int[] list2 = new int[list2Size];
        for (int i = 0; i < list2Size; i++){
            list2[i] = in.nextInt();
        }
        
        System.out.println("list1 is " + Arrays.toString(list1));
        System.out.println("list2 is " + Arrays.toString(list2));
        System.out.println("The merged list is " + Arrays.toString(merge(list1, list2)));
    }
    
     public static int[] merge(int[] list1, int[] list2){
         int curr1=0, curr2=0;
         int[] merged = new int[list1.length + list2.length];
         for (int i = 0; i < merged.length; i++){
             if (curr1 >= list1.length){
                 merged[i] = list2[curr2];
                 curr2++;
                 continue;
             }
             if(curr2 >= list2.length) {
                 merged[i] = list1[curr1];
                 curr1++;
                 continue;
             }
          
             if (list1[curr1] < list2[curr2]){
                 merged[i] = list1[curr1];
                 curr1++;
                
             }
             else {
                 merged[i] = list2[curr2];
                 curr2++;
               
             }
             
         }
         return merged;
     }
}
