
package com.mycompany.exercise_26_04;


/**
 * (Parent reference for BST) Suppose the TreeNode class defined in BST contains
 * a reference to the node’s parent, as shown in Programming Exercise 25.15.
 * Implement the AVLTree class to support this change. Write a test 
 * program that adds numbers 1, 2, . . . , 100 to the tree and displays the paths 
 * for all leaf nodes.
 * @author DEJAN
 */
public class Exercise_26_04 {

    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>();
        for (int i = 1; i <101; i++) {
            tree.insert(i);
        }    
            
        for (int i = 1; i <101; i++) {
             // System.out.println("i:" + i + ", " +tree.getNode(i).element);
              AVLTree.TreeNode<Integer> node =  tree.getNode(i);
              if (tree.isLeaf(i)) {
                  System.out.println("BST Path for leaf node: " + i + ": " + tree.getPath(i).toString());
              }
                
            
        }
    
    }

}
