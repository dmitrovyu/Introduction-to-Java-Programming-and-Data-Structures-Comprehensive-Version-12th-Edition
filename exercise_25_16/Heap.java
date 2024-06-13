
package com.mycompany.exercise_25_16;

/**
 *
 * @author DEJAN
 */
public class Heap<E extends Comparable<E>> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    /*Create default heap*/
    public Heap(){}
    
    /*Create Heap from a array of objects*/
    public Heap(E[] objects){
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }
    
    /*
     * Add a new object into the Heap
    */
    
    public void add(E newObject){
        list.add(newObject); //Append to the Heap
        int currentIndex = list.size()-1; // The index of the last node
        
        while (currentIndex > 0) {
            int parentIndex =(currentIndex-1)/2;
            //swap if current object grater than its parent
            if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else break;//The tree is heap  now
            currentIndex = parentIndex;
                
        }
    }
    
    /*Remove the root from the heap */
    public E remove(){
        if(list.isEmpty()) return null;
        
        E removedObject = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(list.size()-1);
        
        int currentIndex = 0;
        while(currentIndex < list.size()){
            int leftChildIndex = 2*currentIndex +1;
            int rightChildIndex = 2*currentIndex + 2;
            
            //Find the maximum between two children
            if (leftChildIndex >= list.size()) break; //The tree is heap
            int maxIndex = leftChildIndex;
            if(rightChildIndex <list.size()){
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0){
                    maxIndex = rightChildIndex;
                }
            }
            //Swap the current node is less than maximum
            if(list.get(currentIndex).compareTo(list.get(maxIndex))<0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex = maxIndex;
            }
            else break; //The tree is heap
                    
        }
        return removedObject;
        
    }
    
    /*Get the number of nodes in the tree*/
    public int getSize(){
        return list.size();
    }
}
