
package Exercise_07_32;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * **7.32 (Partition of a list) Write the following method that partitions the list using the
 * first element, called a pivot:
 * public static int partition(int[] list)
 *  After the partition, the elements in the list are rearranged so all the elements before
 * the pivot are less than or equal to the pivot, and the elements after the pivot are
 * greater than the pivot. The method returns the index where the pivot is located in
 * the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
 * most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/QuickSortNeweBook.html
 * for an animation of the implementation. Write a
 * test program that prompts the user to enter the size of the list and the contents of
 * the list and displays the list after the partition. Here is a sample run
 *
 *          Enter list size: 8
 *          Enter list content: 10 1 5 16 61 9 11 1
 *          After the partition, the list is 9 1 5 1 10 61 11 16
 *
 * @author DejanD
 */
public class Exercise_07_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = in.nextInt();
        int[] list = new int[size];
        System.out.print("Enter list content: ");
        for (int i = 0; i < size; i++)
            list[i] = in.nextInt();
        partition(list);
        System.out.println("After the partition, the list is " + Arrays.toString(list));
    }
    public static int partition(int[] list){
        int pivot = list[0];
        int low = 1;
        int high = list.length-1;
        while (low <= high){
            System.out.println("low: " + low + " heigh: " + high);
            if (list[high]> pivot)  high--;
            else {
                swap (low, high, list);
            }
            if(list[low]<pivot) low++;
        }
        if (list[high] < pivot) {
            swap(0, high, list);
        }
        return high;   
    }
    public static void swap(int low,int heigh, int[] list){
        System.out.println("Swap low:" + low + " with " + heigh);
        int temp = list[low];
        list[low] = list[heigh];
        list[heigh] = temp;
        
    }
}
