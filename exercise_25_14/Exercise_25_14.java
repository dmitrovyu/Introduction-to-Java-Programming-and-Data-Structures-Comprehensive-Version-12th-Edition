
package com.mycompany.exercise_25_14;

/**
 *25.14. (Breadth-first traversal) Define a new class named BSTWithBFT that extends 
 * BST with the following method: 
* Display the nodes in a breadth-first traversal 
* public void breadthFirstTraversal()
* Use https://liveexample.pearsoncmg.com/test/Exercise25_14.txt to test 
* your code.
 * @author DEJAN
 */
public class Exercise_25_14 {

    public static void main(String[] args) {
        BSTWithBFT<Integer> tree = new BSTWithBFT<>();
        tree.add(56);
        tree.add(27);
        tree.add(84);
        tree.add(18);
        tree.add(28);
        tree.add(65);
        tree.add(124);
        tree.add(78);
        tree.add(11);
        tree.add(17);
        System.out.print("Inorder tree: ");
        tree.inorder();
        System.out.print("\nPostorder tree: ");
        tree.postorder();
        System.out.print("\nPreorder tree: ");
        tree.preorder();
        System.out.print("\nBreadth First Search of BFS: ");
        tree.bredthFirstTraversal();
                
        
        
    }
}
