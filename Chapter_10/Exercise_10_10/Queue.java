
package Exercise_10_10;

import java.util.Arrays;

/*********************************
 * Class Queue
 * *******************************
 * -elements : int[]
 * -size : int
 * *******************************
 * +Queue()
 * +enqueue(v : int)
 * +dequeue() : int
 * +empty() : boolean
 * +getSize() : int
 * ******************************
 * @author DejanD
 */
public class Queue {
    private int[] values;
    private int size;
    private final int DEFAULT_QUEUE_SIZE = 8;
    
    public Queue() {
        values = new int[DEFAULT_QUEUE_SIZE];
        size = 0;
    }
    public void enqueue(int v){
        size++;
        if (size == values.length-1) enlargeQueue(); 
        values[size - 1] = v;
    }
    public void enlargeQueue(){
        int[] temp = Arrays.copyOfRange(values, 0, values.length*2);
        this.values = temp;
        
    }
    
    public int dequeue(){
        if (empty()) return 0;
        int value = values[0];
        for (int i = 1; i < size-1; i++)
            values[i-1] = values[i];
        size--;
        return value;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
}
