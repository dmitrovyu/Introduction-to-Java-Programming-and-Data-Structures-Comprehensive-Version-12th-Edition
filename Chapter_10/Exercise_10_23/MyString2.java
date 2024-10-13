package Exercise_10_23;

/**
 *
 * @author DejanD
 */
public class MyString2 {

    private char[] chars;

    public MyString2(String s) {
        this.chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }
    //Compares two strings lexicographically. If strings are equal return 0, 
    public int compare(String s) {
        if (chars.length == s.length()) {
            for (int i = 0; i < s.length(); i++){
               if (chars[i] != s.charAt(i)) return chars[i]-s.charAt(i);
            }
            return 0;
        }
        else return chars.length - s.length();
    }

    public MyString2 substring(int begin) {
        char[] temp = new char[this.chars.length - begin];
        System.arraycopy(chars, begin, temp, 0,temp.length);
        return new MyString2(String.copyValueOf(temp));

    }

    public MyString2 toUpperCase() {
        char[] temp = new char[chars.length];
        for(int i = 0; i < chars.length; i++)
            temp[i] = Character.toUpperCase(chars[i]);
        return new MyString2(String.copyValueOf(temp));
    }

    public char[] toChars() {
        return this.chars;
    }

    public static MyString2 valueOf(boolean b) {
        return (b)? new MyString2("true") : new MyString2("false");
    }
    
    @Override
    public String toString(){
        return new String(chars);
    }
}
