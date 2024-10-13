
package Exercise_10_27;

/**
 *(Implement the StringBuilder class) The StringBuilder class is provided 
 * in the Java library. Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);
 * public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 * @author DejanD
 */
public class Exercise_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 string1 = new MyStringBuilder1("Dejan");
        MyStringBuilder1 string2 = new MyStringBuilder1(" Dmitrovic");

        System.out.println(string1.append(string2)); 

        System.out.println(string1); 
        System.out.println(string1.length()); 
        
        System.out.println(string1.append(1234));

        System.out.println(string1.charAt(0)); 
        System.out.println(string1.toLowerCase()); 

        System.out.println(string1.substring(1, 8)); 

        System.out.println(string1.toString()); 
    }
}
