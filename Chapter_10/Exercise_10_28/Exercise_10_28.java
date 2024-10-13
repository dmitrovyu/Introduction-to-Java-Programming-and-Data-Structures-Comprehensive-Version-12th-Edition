
package Exercise_10_28;

/**
 * (Implement the StringBuilder class) The StringBuilder class is provided 
 * in the Java library. Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder2):
 * public MyStringBuilder2();
 * public MyStringBuilder2(char[] chars);
 * public MyStringBuilder2(String s);
 * public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 * public MyStringBuilder2 reverse();
 * public MyStringBuilder2 substring(int begin);
 * public MyStringBuilder2 toUpperCase();
 *
 * @author DejanD
 */
public class Exercise_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 =
                        new MyStringBuilder2(new char[]{'a', 'b', 'c', 'd', 'p'});
        MyStringBuilder2 s2 = new MyStringBuilder2("xyz");
        System.out.println(s1.insert(3, s2));
        System.out.println(s2.reverse());
        System.out.println(s1.substring(3));
        System.out.println(s1.toUpperCase());

    
    }
}
