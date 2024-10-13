
package Exercise_10_28;

import Exercise_10_27.MyStringBuilder1;

/**
 *
 * @author DejanD
 */
public class MyStringBuilder2 {
    private int size;
    private int capacity;
    private char[] buffer;
    
    public MyStringBuilder2(){
        this("");
    }
    public MyStringBuilder2(char[] chars){
        size = capacity = chars.length;
        buffer = new char[chars.length];
        System.arraycopy(chars, 0, buffer, 0, chars.length);
        
    }
    public MyStringBuilder2(String s){
        this(s.toCharArray());
    }
    
    private void increaseCapacity(int newCapacity){
        char[] temp = new char[newCapacity];
        capacity = newCapacity;
        System.arraycopy(buffer,0, temp, 0, buffer.length);
        buffer = temp;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        if (this.size + s.size > this.capacity) 
            increaseCapacity(2*(this.size + s.size));
        this.size += s.size;
        String result = "";
        for (int i = 0; i < offset; i++){
            result = result + buffer[i];
        }
        for (int i = 0; i < s.size; i++)
            result = result + s.buffer[i];
        for(int i = offset; i<buffer.length; i++){
            result = result + buffer[i];
        }
        return new MyStringBuilder2(result);
        
    }
    public MyStringBuilder2 reverse(){
        String reversed = "";
        for (int i = buffer.length-1; i >= 0; i--)
            reversed += buffer[i];
        return new MyStringBuilder2(reversed);
    }
    public MyStringBuilder2 substring(int begin){
        char[] result = new char[size-begin];
        System.arraycopy(buffer, begin, result,0, result.length);
        return new MyStringBuilder2(String.valueOf(result));
    }
    public MyStringBuilder2 toUpperCase(){
        char[] temp = new char[this.size];
        for (int i = 0; i < temp.length; i++)
            temp[i] = Character.toUpperCase(buffer[i]);
        return new MyStringBuilder2(String.valueOf(temp));    
    }
    @Override
    public String toString(){
        return String.valueOf(buffer);
    }
}
