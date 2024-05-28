
package com.mycompany.exercise_25_11;

import java.util.ListIterator;



/**
 *
 * @author DEJAN
 */
public class BST<E extends Comparable<E>> implements Tree<E> {
    protected TreeNode<E> root;
    protected int size;
    protected java.util.Comparator<E> c; 
    
    /** Create a default BST with a natural order comparator */
    public BST() {
        this.c = (e1,e2) ->  ((Comparable<E>)e1).compareTo(e2);
    }
    /** Create a BST with a specified comparator */
    public BST(java.util.Comparator<E>  c) {
        this.c = c;
        
    }
    /** Create a binary tree from an array of objects */
    public BST(E[] objects){
        this.c = (e1,e2) -> ((Comparable<E>)e1).compareTo(e2);
        for (E element: objects)
            insert(element);
        
    }
    
    @Override
    public BST<E> clone() {
        BST<E> cloned = new BST<E>();
        if (root == null) return null;
              
        ListIterator<E> iterator =  this.iterator(size);
        
        while(iterator.hasPrevious()){
            cloned.add(iterator.previous());
            
        }
        return cloned;
    }
    
    public boolean equal(BST<E> tree){
        if (this.getSize() != tree.getSize()) return false;
        ListIterator<E> iterator = this.iterator();
        ListIterator<E> iter = tree.iterator();
        while(iterator.hasNext()){
            if(iterator.next() != iter.next()) return false;
        }
        return true;
    }
    
    
    /*Return the smalest element in BST tree*/
    public E getSmallest(){
        TreeNode<E> current = root;
        while(current.left != null){
            current = current.left;
        }
        return current.element; 
    }
    
    /*Return the greatest element in BST tree*/   
    public E getLargest() {
        TreeNode<E> current = root;
        while(current.right != null)
            current = current.right;
        return current.element;
        
    }
     /** Return true if the element is in the tree */
    @Override
    public boolean search(E e){
        TreeNode<E> current = root; //Start from the root
        while(current != null) {
            if (c.compare(e, current.element) < 0){
                current = current.left;
            }
            else if (c.compare(e, current.element)>0){
                current = current.right;
            }
            else return true; //Element matches current element
        }
        return false;
       
    }
    
    
    @Override
    /** Insert element o into the binary tree
      * Return true if the element is inserted successfully */
    public boolean insert(E e) {
        if(root==null) 
            root = createNewNode(e);//Create new root;
        else {
            //Locate perent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null) {
                if (e.compareTo(current.element)<0) {
                    parent=current;
                    current = current.left;
                }
                else if (e.compareTo(current.element)>0) {
                    parent = current;
                    current = current.right;
                }
                else 
                    return false; //Duplicate not inserted;
                 
            }
            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.element)<0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; //Element inserted successfully
    }
    
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<E>(e);
    }

    @Override
    /** Delete an element from the binary tree.
     * Return true if the element is deleted successfully
     * Return false if the element is not in the tree */
    public boolean delete(E e) {
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            }
            else if (e.compareTo(current.element) > 0){
                parent = current;
                 current = current.right;
            }
                
            else break; // Element is in the tree pointed at by current
        }
        if (current == null)
            return false; // Element is not in the tree
        
        // Case 1: current has no left child
        if (current.left == null){
             // Connect the parent with the right child of the current node
             if (parent == null)
                 root = current.right;
             else {
                 if (e.compareTo(parent.element)<0)
                     parent.left = current.right;
                 else
                     parent.right = current.right;
             }
        }
        else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            
            while(rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right 
            }
            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;
            //Eliminate rightMost Node
            if(parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                //Special case parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
                
        }
        size--;
        return true; // Element deleted successfully
           
    }

    @Override /** in-order traversal from the root*/
    public void inorder() {
        inorder(root);
    }
    
    /** in-order traversal from a sub-tree */
    protected void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void preorder() {
        preorder(root);
    }
    protected void preorder(TreeNode<E> root){
        if(root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
    

    @Override
    /** post-order traversal from the root */
    public void postorder() {
        postorder(root);
    }
    
    protected void postorder(TreeNode<E> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
        
    }

    @Override
    public int size() {
        return size;
    }
    @Override 
        public int getSize(){
        return size;
    }
    
    /** Returns the root of the tree */
    public TreeNode<E> getRoot(){
        return root;
    }
    
  

    @Override
    public java.util.ListIterator<E> iterator() {
        return new InorderIterator();
        
    }
    public java.util.ListIterator<E> iterator(int index) {
        return new InorderIterator(index);
    }
    
    public java.util.ListIterator preorderIterator() {
        return new PreorderIterator();
    }
    
    // Inner class InorderIterator
    private class InorderIterator implements java.util.ListIterator<E> {
        // Store the elements in a list
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; // Point to the current element in list
        public InorderIterator(){
            inorder(); // Traverse binary tree and store elements in list
        }
        public InorderIterator (int index){
            current = index;
            inorder(); // Traverse binary tree and store elements in list
        }
        /** in-order traversal from the root*/
        private void inorder(){
            inorder(root);
        }
         /** in-order traversal from a sub-tree */
        private void inorder(TreeNode<E> root){
            if (root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
            
        }
        @Override /** More elements for traversing? */
        public boolean hasNext(){
            if (current < list.size()) return true;
            return false;
        }
        @Override /** Get the current element and move to the next */
        public E next(){
           return list.get(current++);
        }
        
        @Override /** Remove the current element */
        public void remove(){
            delete(list.get(current)); //Delete current element
            list.clear();
            inorder(); //Rebuild the list
            
        }
        public boolean hasPrevious(){
            if(current > 0) return true;
            else return false;
        }
        
        public E previous(){
            current--;
            return list.get(current);
        }
        public int nextIndex(){
            return 0;
        }
        public int previousIndex(){
            return 0;
        }
        public void set(E e){
            
        }
        public void add(E e){
            
        }
        
}
    
    
   // Inner class PreorderIterator
    private class PreorderIterator implements java.util.ListIterator {
        //Store elements in the list
        java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; //point to the current elemnet in the list
        
        public PreorderIterator() {
            preorder(); //Traverse the tree and store elements in the list
        }
        private void preorder(){
            preorder(root);
        }
        
        private void preorder(TreeNode<E> root) {
            if(root == null) return;
            list.add(root.element);
            preorder(root.left);
            preorder(root.right);
        }
        
        public boolean hasNext() {
            if(current < list.size()) return true;
            else return false;
        }
        @Override /** Get the current element and move to the next */
        public E next() {
            return list.get(current++);
            
        }
        @Override /** Remove the current element */
        public void remove() {
            delete(list.get(current));
            list.clear();
            inorder();
        }

        @Override
        public void add(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean hasPrevious() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object previous() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void set(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    /** Remove all elements from the tree */
    @Override
    public void clear() {
          root = null;
          size = 0;
    }

    
    
    /** This inner class is static, because it does not access 
      * any instance members defined in its outer class */
    public static class TreeNode<E extends Comparable<E>> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;
        
        public TreeNode(E e) {
            element = e;
        }
    }
    
    /** Returns a path from the root leading to the specified element */
    
    public java.util.ArrayList<TreeNode<E>> path(E e){
        java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
        TreeNode<E> current = root; //Start from the root
        
        while(current != null) {
            list.add(current);
            if(e.compareTo(current.element)< 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else break;
        }
        return list; //Return list of nodes
    }
    
}
