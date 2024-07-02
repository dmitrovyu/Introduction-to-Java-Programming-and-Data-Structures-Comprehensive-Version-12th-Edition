package com.mycompany.exercise_26_07;

import java.util.Scanner;

/**
 *
 * @author DEJAN
 */
public class Exercise_26_07 {

    public static void main(String[] args) {
        MyBST<Integer> tree = new MyBST<>();
        System.out.print("How many integers to be inserted into the tree? ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Enter " + number + " integers: ");
        int count = 0;
        while (count++ < number) {
            int e = input.nextInt();
            tree.insert(e);
        }
        System.out.println("Is this tree an AVL tree? " + tree.isAVLTree());
    }
}
