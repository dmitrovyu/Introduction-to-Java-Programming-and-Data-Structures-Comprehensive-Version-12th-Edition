
package com.mycompany.exercise_26_04;

import java.util.ArrayList;

/**
 *
 * @author DEJAN
 * Binary search tree BST
 */
public class BST<E> implements Tree<E>{
    protected TreeNode<E> root;
    protected int size;
    protected java.util.Comparator<E> c;
    
    /** Create a default BST with a natural order comparator */
        public BST() {
           this.c = (e1,e2) ->((Comparable<E>)e1).compareTo(e2);
        }
    /** Create a BST with a specified comparator */
        public BST(java.util.Comparator<E> c){
            this.c = c;
        }
    /** Create a binary tree from an array of objects */
        public BST(E[] objects){
            this.c = (e1,e2) -> ((Comparable<E>)e1).compareTo(e2);
            for (E object : objects) 
                add(object);   
        }
        
     /*Return the smalest element in BST tree*/
        public E getSmallest(){
            TreeNode<E> current = root;
            while(current.left != null) {
                current = current.left;
                
            }
            return current.element;
        }
        
     /*Return the greatest element in BST tree*/   
        public E getLargest() {
            TreeNode<E> current = root;
            while(current.right != null) {
                current = current.right;
            }
            return current.element;
        }
           
    /** Return true if the element is in the tree */
        @Override
        public boolean search(E e){
            TreeNode<E> current = root; //start from the root
            while (current != null) {
                if (c.compare(e, current.element) < 0){
                    current = current.left;
                }
                else if (c.compare(e, current.element) > 0){
                    current = current.right;
                }
                else // element matches current.element
                    return true;  // Element is found
            }
            return false;    
        }
    /** Insert element e into the binary tree
     * Return true if the element is inserted successfully */
        @Override
        public boolean insert (E e){
            if(root == null)
                root = createNewNode(e);//Create new root;
            else {
                //Locate parent node
                TreeNode<E> parent = null;
                TreeNode<E> current = root;
                while(current != null){
                    if (c.compare(e,current.element)<0){
                        parent = current;
                        current = current.left;
                    }
                    else if(c.compare(e, current.element)>0) {
                        parent = current;
                        current = current.right;
                    }
                    else return false; //Duplicate node not inserted
                }
                if (c.compare(e, parent.element)<0){
                    parent.left = createNewNode(e);
                    parent.left.parent = parent;
                }
                else {
                     parent.right = createNewNode(e);
                     parent.right.parent = parent;
                }
                    
            }
            size++;
            return true; // Element inserted successfully
        }
        
        //Create new TreeNode
            protected TreeNode<E> createNewNode(E e){
                return new TreeNode<>(e);
            }
        
        @Override  /** Inorder traversal from the root */
            public void inorder() {
                inorder(root);
            }
        
        /** Inorder traversal from a subtree 
         recursive helper method*/
        protected void inorder(TreeNode<E> root){
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.element + " ");
            inorder(root.right);
        }
        
        @Override /** Postorder traversal from the root */
        public void postorder(){
            postorder(root);
        }
        
        /** Postorder traversal from a subtree  recursive helper method*/
        protected void postorder(TreeNode<E> root){
            if (root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.element + " ");
        }
        
        @Override /** Preorder traversal from the root */
        public void preorder(){
            preorder(root);
        }
        
        /** Preorder traversal from a subtree - recursive helper method*/
        protected void preorder(TreeNode<E> root){
            if(root == null) return;
            System.out.print(root.element + " ");
            preorder(root.left);
            preorder(root.right);
        }
        
    /** This inner class is static, because it does not access 
      * any instance members defined in its outer class */
    public static class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;
        protected TreeNode<E> parent;
       
        public TreeNode(E e){
            element = e;
        }
    }
    
    @Override /** Get the number of nodes in the tree */
    public int getSize() {
        return size;
    }
    
    /** Returns the root of the tree */
    public TreeNode<E> getRoot() {
        return root;
    }
    
    /** Returns a path from the root leading to the specified element */
    public java.util.ArrayList<TreeNode<E>> path(E e) {
        java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
        TreeNode<E> current = root; //Start from the root
        
        while(current != null) {
            list.add(current);
            if (c.compare(e, current.element)< 0) current = current.left;
            else if (c.compare(e, current.element)>0) current = current.right;
            else break;
        }
        return list; //Return the list of nodes    
    }
    
    @Override 
    /** Delete an element from the binary tree.
    * Return true if the element is deleted successfully
    * Return false if the element is not in the tree */
    
    public boolean delete(E e){
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while(current != null) {
            if (c.compare(e, current.element)<0) {
                parent = current;
                current = current.left;
            }
            else if (c.compare(e, current.element)>0) {
                parent = current;
                current = current.right;    
            }
            else break; //Element is in the tree pointed by the current
        }
        if (current == null) return false; //Element not found in the tree;
        //Case 1: current has no left child
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) root = current.right;
            else  {
                if (c.compare(e, parent.element)<0) parent.left = current.right;
                else parent.right = current.right;
            }
        }
        else {
            /* Case 2: The current node has a left child
            * Locate the rightmost node in the left subtree of
            * the current node and also its parent*/
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            
            while (rightMost.right != null){
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; //Keep going to the right
            }
            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;
            
            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else // Special case parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true; //Element deleted succesfully
        
    }
    
    @Override /** Obtain an iterator. Use inorder. */
    public java.util.Iterator<E> iterator(){
        return new InorderIterator();
    }
    
    //Iner class InorderIterator
    private class InorderIterator implements java.util.Iterator<E>{
        //Store the elements in the list
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; // Point to the current element in the list - current position
        
        public InorderIterator(){
            inorder();
        }
        /** Inorder traversal from the root*/
        private void inorder(){ //Obtain inorder list
            inorder(root);
        }
        
        /** Inorder traversal from a subtree */
        private void inorder(TreeNode<E> root){
            if(root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }
        @Override /** More elements for traversing? */
        public boolean hasNext() {
            return current < list.size();
        }
        
        @Override  /** Get the current element and move to the next */
        public E next() {
            return list.get(current++);
        }
        
        @Override // Remove the element returned by the last next()
        public void remove() {
            if (current == 0) // newxt() has not been called yet
                throw new IllegalStateException();
            delete(list.get(current--));
            list.clear();
            inorder();
        }  
    }
    
       /** Return the node for the specified element.
    * Return null if the element is not in the tree. */
    public TreeNode<E> getNode(E e){
        if (!search(e)) return null;
        TreeNode<E> current = root;
        while (current != null) {
            if (c.compare(e, current.element) < 0)
                current = current.left;
            else if (c.compare(e,current.element) > 0)
                current = current.right;
            else{
                
                return current;
            }
        }
        return null;
    }
    /** Return true if the node for the element is a leaf */
    public boolean isLeaf(E e){
        TreeNode<E> current = getNode(e);
        if(current == null) return false;
        else if (current.left != null || current.right != null) {
            return false;
        }
        else return true;
        
    }
    
    /** Return the path of elements from the specified element 
    * to the root in an array list. */
    public ArrayList<E> getPath(E e){
        if (!search(e)) return null;
        ArrayList<E> list = new ArrayList<>();
        TreeNode<E> current = getNode(e);
        while(current != null) {
            list.add(current.element);
            current = current.parent;
        }
       // list.add(root.element);
        return list;
    }
    
    
    @Override /** Remove all elements from the tree */
    public void clear() {
        root = null;
        size = 0;    
    }
    
}
