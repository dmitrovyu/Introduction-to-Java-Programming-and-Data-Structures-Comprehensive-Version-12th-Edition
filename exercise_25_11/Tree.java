
/**
 *
 * @author DEJAN
 * @param <E>
 *
 * public interface Tree<E>/*
 * 
 */
package com.mycompany.exercise_25_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author DEJAN
 */
public interface Tree<E> extends java.util.Collection<E>{
    //Returns true if the specified element is in the tree
    public boolean search(E e);
    //Returns true if the element is added successfully
    public boolean insert (E e);
    //Returns true if the element is removed from the tree successfully
    public boolean delete(E e);
    //Prints the nodes in inorder traversal
     public void inorder();
     //Prints the nodes in preorder traversal
     public void preorder();
     //Prints the nodes in postorder traversal.
     public void postorder();
     //Returns the number of elements in the tree.
     public int getSize();

     /*Override the add, isEmpty, remove, containsAll, addAll, removeAll,
     * retainAll, toArray(), and
     * toArray(T[]) methods defined in Collection using default methods.
     */
     
    @Override
     public default boolean add(E e) {
         return insert(e);
     }
     @Override
     public default boolean isEmpty() {
         return getSize() == 0;
     }
     @Override 
     public default boolean remove(Object e) {
         return delete((E) e);
     }
     @Override
     public default boolean containsAll(Collection<?> c){
         for (Object element: c) {
             if (!contains(element)) return false;
         }
         return true;
     }
     @Override
     public default boolean contains(Object e) {
         return search((E) e);
     }
     @Override
     public default boolean addAll(Collection<? extends E> c){
         boolean status = true;
         for (E element: c){
            status = status  && add(element);
         }
         return status;
     }
     @Override
     public default boolean removeAll(Collection<?> c) {
         boolean status = true;
         for (Object element: c){
             if(contains((E) element)){
                 status = status || remove((E)element);
             }
             
         }
         return status;
     }
     @Override
     public default boolean retainAll(Collection<?> c) {
         if (c == null)
             throw new NullPointerException("The collection is null");
         Iterator itr = iterator();
         boolean status = false;
         while(itr.hasNext()){
             if (!c.contains(itr.next())){
                 {
                     itr.remove();
                     status = true;
                 }
             }
         }
         return status;
     }
     
     @Override 
     public default Object[] toArray(){
         Iterator<?> iter = iterator();
         ArrayList<Object> list = new ArrayList<>();
         while(iter.hasNext()) {
             list.add(iter.next());
         }
         return (list.toArray());
     }
     @Override
     public default <T> T[] toArray(T[] array){
         //need to be done
         return null;
     }
     
     
}
    