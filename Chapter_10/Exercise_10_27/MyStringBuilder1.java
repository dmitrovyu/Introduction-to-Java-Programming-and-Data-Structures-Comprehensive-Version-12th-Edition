
package Exercise_10_27;

/**
 *
 * @author DejanD
 */
public class MyStringBuilder1 {
    private int size = 0;
    private int capacity = 0;
    private char[] buffer;
            
 
    public MyStringBuilder1(String s){
        size = capacity = s.length();
        buffer = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            buffer[i] = s.charAt(i);
        }
    }
    
    public MyStringBuilder1 append(MyStringBuilder1 s){
        return new MyStringBuilder1(this.toString().concat(s.toString()));
        
    }
    public MyStringBuilder1 append(int i){
        MyStringBuilder1 temp = new MyStringBuilder1(Integer.toString(i));
        return this.append(temp);
    }
    public int length(){
        return size;
    }
    public char charAt(int index){
        return buffer[index];
    }
    public MyStringBuilder1 toLowerCase(){
        char[] temp = new char[this.size];
        for (int i = 0; i < temp.length; i++)
            temp[i] = Character.toLowerCase(buffer[i]);
        return new MyStringBuilder1(String.valueOf(temp));
    }
    public MyStringBuilder1 substring(int begin, int end){
        if (end > buffer.length) end = buffer.length;
        char[] temp = new char[end-begin];
        for (int i = begin; i < end; i++)
            temp[i-begin] = buffer[i];
        return new MyStringBuilder1(String.valueOf(temp));
    }
    @Override
    public String toString(){
        return String.valueOf(buffer);
    }
}
