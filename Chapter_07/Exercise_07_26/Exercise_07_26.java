package Exercise_07_26;

import java.util.Scanner;

/**
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 * if their corresponding elements are equal. Write a method that returns true
 * if list1 and list2 are strictly identical, using the following header: public
 * static boolean equals(int[] list1, int[] list2) Write a test program that
 * prompts the user to enter two lists of integers and displays whether the two
 * are strictly identical. Here are the sample runs. Note the first number in
 * the input for each list indicates the number of the elements in the list.
 * This number is not part of the list.
 *
 * Enter list1 size and contents: 5 2 5 6 1 6 
 * Enter list2 size and contents: 5 2 5 6 1 6 
 * Two lists are strictly identical 
 * Enter list1 size and contents: 5 2 56 6 1 
 * Enter list2 size and contents: 5 2 5 6 1 6 
 * Two lists are not strictly identical
 *
 * @author DејanD
 */
public class Exercise_07_26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int list1Size = in.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++) {
            list1[i] = in.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int list2Size = in.nextInt();
        int[] list2 = new int[list2Size];
        for (int i = 0; i < list2Size; i++) {
            list2[i] = in.nextInt();
        }
        String answer = (equals(list1, list2)) ? "" : " not";
        System.out.println("Two list are" + answer + " strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}

