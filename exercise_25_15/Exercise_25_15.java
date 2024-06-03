
package com.mycompany.exercise_25_15;

import java.util.Scanner;

/**
 * *25.15 (Parent reference for BST) Redefine TreeNode by adding a reference to a node’s
 * parent, as shown below:
 * Reimplement the insert and delete methods in the BST class to update the
 * parent for each node in the tree. Add the following new method in BST:
 *
 * private TreeNode<E> getNode(E element)
 * private boolean isLeaf(E element)
 * public ArrayList<E> getPath(E e)
 *
 * Write a test program that prompts the user to enter 10 integers, adds them to
 * the tree, deletes the first integer from the tree, and displays the paths for all leaf
 * nodes. Here is a sample run:
 *
 *          Enter 10 integers: 45 54 67 56 50 45 23 59 23 67
 *          [50, 54, 23]
 *          [59, 56, 67, 54, 23]
 *
 *
 * @author DejanD
 * */
public class Exercise_25_15 {

    public static void main(String[] args) {
       BST<Integer> tree = new BST<>();
       Scanner scn = new Scanner(System.in);
       System.out.print("Enter 10 integers");
       for (int i = 0; i <10; i++){
           int input = scn.nextInt();
           tree.add(input);
       }
       //remove first element
       tree.delete(tree.root.element);
       
       //print leaves in the tree
        for (int currentElement : tree) {
            if(tree.isLeaf(currentElement))
                System.out.println(tree.getPath(currentElement));
        }
       
    }
}
