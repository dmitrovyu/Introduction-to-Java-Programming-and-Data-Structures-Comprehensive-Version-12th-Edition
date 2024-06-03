
package com.mycompany.exercise_25_12;

/**
 * (Test BST) Design and write a complete test program to test if the BST class in 
 * Listing 25.4 meets all requirements
 * @author DEJAN
 */
public class Exercise_25_12 {
    private  BST<Integer> tree = new BST<>();
    
    public  Exercise_25_12(){
        tree.insert(56);
        tree.insert(39);
        tree.insert(28);
        tree.insert(75);
        tree.insert(12);
        tree.insert(30);
        tree.insert(70);
        tree.insert(111);
        tree.insert(17);
        
        tree.inorder();
        System.out.println("");
        
        tree.preorder();
        System.out.println("");
        
        tree.postorder();
        System.out.println("");
        
        tree.delete(75);
        tree.inorder();
        System.out.println("");
        
        tree.preorder();
        System.out.println("");
        
        tree.postorder();
        System.out.println("");
        
        tree.delete(39);
        tree.inorder();
        System.out.println("");
        
        tree.preorder();
        System.out.println("");
        
        tree.postorder();
        System.out.println("");
        
            
    }

    public static void main(String[] args) {
        
        new Exercise_25_12();
    }
}
