
package Exercise_10_22;

/**
*Implement the String class) The String class is provided in the Java library. *
* Provide your own implementation for the following methods (name the new        *
* class MyString1):                                                              *
*                                                                                *
* public MyString1(char[] chars);                                                *
* public char charAt(int index);                                                 *
* public int length();                                                           *
* public MyString1 substring(int begin, int end);                                *
* public MyString1 toLowerCase();                                                *
* public boolean equals(MyString1 s);                                            *
* public static MyString1 valueOf(int i);   
* 
 * @author DejanD
 */
public class Exercise_10_22 {
    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] {'A', 'b', 'C'});
    System.out.println(s.length());
    System.out.println(s.charAt(1));
    System.out.println(s.equals(new MyString1(new char[] {'a', 'b', 'c'})));
    System.out.println(s.substring(0, 2).toChars());
    System.out.println(s.toLowerCase().toChars());

    char[] chars = MyString1.valueOf(3458974).toChars();
    System.out.println(chars);
    }
}
