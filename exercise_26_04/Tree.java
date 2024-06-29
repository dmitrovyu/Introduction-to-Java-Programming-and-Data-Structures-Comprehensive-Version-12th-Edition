
/*
Listing 25.3 gives the implementation for Tree. It provides default implementations for the 
add, isEmpty, remove, containsAll, addAll, removeAll, retainAll, toArray(), and 
toArray(T[]) methods inherited from the Collection interface as well as the inorder(), 
preorder(), and postorder() defined in the Tree interface
*/


package com.mycompany.exercise_26_04;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DEJAN
 */
public interface Tree<E> extends Collection<E>  {
    //Return true if the element is int he tree
    public boolean search(E e);
    
    /** Insert element e into the binary tree
    * Return true if the element is inserted successfully */
    public boolean insert(E e);
    
    /** Delete the specified element from the tree
    * Return true if the element is deleted successfully */
    public boolean delete(E e);
    
    /** Get the number of elements in the tree */
    public int getSize();
    
    /** Inorder traversal from the root*/
    public default void inorder(){
        
    }
    /** Postorder traversal from the root */
    public default void postorder() {
    
    }       
    
    /** Preorder traversal from the root */
    public default void preorder(){
        
    }
    @Override //** Return true if the tree is empty */
    public default boolean isEmpty(){
        return size() == 0;
    }
    @Override
    public default boolean contains(Object e){
        return search((E) e);
    }
    @Override
    public default boolean add(E e){
        return insert(e);
    }
    @Override
    public default boolean remove(Object e){
        return delete((E) e);
    }
    @Override
    public default int size(){
        return getSize();
    }
    @Override
    public default boolean containsAll(Collection<?> c) {
       
        for(Object element: c){
            if (!contains(element)) return false;
        }
        return true; 
    }
    @Override
    public default boolean addAll(Collection<? extends E> c) {
        boolean status = false;
        for(E element: c){
            status = status || add(element);
        }
        return status;
        
    }
    @Override
    public default boolean removeAll(Collection<?> c){
        boolean modified = false;
        for (Object element: c) {
            if (contains(element)){
                remove(element);
                modified = true;
        }
        }
        return modified;
    }
    @Override 
    public default boolean retainAll(Collection<?> c){
        boolean modified = false;
        for (Object element: c) {
            if (!contains(element)){
                remove(element);
                modified = true;
                
            }
        }
        return modified;
    }
    
    @Override
    public default Object[] toArray(){
        ArrayList<Object> list = new ArrayList<>();
        Iterator<?> iterator = iterator();
        while(iterator.hasNext()){
            Object element = iterator.next();
            list.add(element);
        }
        return list.toArray();
    }
    
    @Override
    public default <T> T[] toArray(T[] array){
       List<Object> list =  Arrays.asList(toArray());
       return list.toArray(Arrays.copyOf(array, list.size()));
    }
    
    
    
}
