
package Exercise_10_22;

/**
 *
 * @author DejanD
 */
public class MyString1 {
    private char[] chars;
    
    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0,this.chars, 0, chars.length);
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 substring(int begin, int end){
        char[] temp = new char[end-begin];
        for (int i = begin; i <end; i++)
            temp[i-begin] = chars[i];
        return new MyString1(temp);
    }
    public MyString1 toLowerCase(){
        char temp[] = new char[chars.length];
        for (int i = 0; i < chars.length; i++)
            temp[i] = Character.toLowerCase(chars[i]);
        return new MyString1(temp);
    }
    public boolean equals(MyString1 s){
        if (s.length() != this.length()) return false;
        for (int i = 0; i < s.length(); i++)
            if (this.charAt(i) != s.charAt(i)) return false;
        return true;
    }
   
    public static MyString1 valueOf(int i){
        int noOfDigits = (int) Math.log10(i) + 1;
        char[] temp = new char[noOfDigits];
        
        for (int j =0; j < noOfDigits; j++){
            temp[noOfDigits-1-j] = (char) ((i % 10) + '0');
            i = i / 10;
        }
        return new MyString1(temp);
    }
    
    public char[] toChars() {
    return chars;
  }

}
