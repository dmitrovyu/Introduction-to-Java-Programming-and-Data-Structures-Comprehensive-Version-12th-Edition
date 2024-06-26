

package com.mycompany.exercise_26_02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * (Compare performance) Write a test program that randomly generates 500,000 
 * numbers and inserts them into a BST, reshuffles the 500,000 numbers and per
 * forms a search, and reshuffles the numbers again before deleting them from 
 * the tree. Write another test program that does the same thing for an AVLTree. 
 * Compare the execution times of these two programs.
 * @author DEJAN
 */
public class Exercise_26_02 {
    
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 500_000; i++)
            list.add((int) (Math.random() * 500_000));
        
        Collections.shuffle(list);
        
        BST<Integer> bst = new BST<>();
        AVLTree<Integer> avlTree = new AVLTree<>();
        
        Collections.shuffle(list);
        
        //Inserting to BST tree
        long time = System.currentTimeMillis();
        for (int i = 0; i <list.size(); i++)
            bst.insert(list.get(i));
        System.out.println("Inserting 500.000 numbers in BST tree in " + 
                (System.currentTimeMillis() - time) + "ms");
        
        Collections.shuffle(list);
        
        //Searching from BST Tree
        time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            bst.search(list.get(i));
        System.out.println("Searching 500.000 numbers in BST tree in " + 
                (System.currentTimeMillis() - time) + "ms");
        
        
        
        Collections.shuffle(list);
        
        //Deleting from BST Tree
        time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            bst.delete(list.get(i));
        System.out.println("Deleting 500.000 numbers from BST tree in " +  
                (System.currentTimeMillis() - time) + "ms");
        
        Collections.shuffle(list);
        
        //Inserting to AVL tree
        time = System.currentTimeMillis();
        for (int i = 0; i <list.size(); i++)
            avlTree.insert(list.get(i));
        System.out.println("Inserting 500.000 numbers in AVL tree in " + 
                (System.currentTimeMillis() - time) + "ms");
        
        Collections.shuffle(list);
        
        //Searching from AVL Tree
        time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            avlTree.search(list.get(i));
        System.out.println("Searching 500.000 numbers in AVL tree in " + 
                (System.currentTimeMillis() - time) + "ms");
        
        Collections.shuffle(list);
        
        //Deleting from AVL Tree
        time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            avlTree.delete(list.get(i));
        System.out.println("Deleting 500.000 numbers from AVL tree in " +  
                (System.currentTimeMillis() - time) + "ms");
        
        
        
    }
    
   
    
    
    
    
 }
    

