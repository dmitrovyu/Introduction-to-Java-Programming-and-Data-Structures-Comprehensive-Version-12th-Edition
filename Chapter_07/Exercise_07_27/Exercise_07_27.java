package Exercise_07_27;

import java.util.Scanner;

/**
 *
 * (Identical arrays) The arrays list1 and list2 are identical if they have the 
 * same contents. Write a method that returns true if list1 and list2 are 
 * identical, using the following header:
 *              public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and
 * displays whether the two are identical. Here are the sample runs. Note the 
 * first number in the input for each list indicates the number of the elements 
 * in the list. This number is not part of the list
 * Enter list1 size and contents: 5 2 5 6 6 1 
 * Enter list2 size and contents: 5 5 2 6 1 6 
 * Two lists are identical
 * 
 * Enter list1: 5 5 5 6 6 1 
 * Enter list2: 5 2 5 6 1 6 
 * Two lists are not identical
 * 
 * @author DEJAN
 */
public class Exercise_07_27 {
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
        System.out.println("Two list are" + answer + " identical");
    }
    public static boolean equals(int[] list1, int[] list2){
        if (list1.length != list2.length) return false;
        //helping array for checks if equal
        boolean[] check = new boolean[list1.length];
       
        for (int i = 0; i < list1.length; i++){
            for (int j = 0; j < list2.length; j++){
                if (list1[i] == list2[j] && check[j] == false){
                    check[j] = true;
                    j = list2.length;
                    
                }
            }
        }
        boolean result = true;
        for (int i = 0; i < check.length; i++) {
            result = result && check[i];
        }
        return result;
    }
    }

