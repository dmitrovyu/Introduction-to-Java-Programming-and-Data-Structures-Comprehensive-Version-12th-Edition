
package Exercise_10_23;

/**
 *(Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new 
 * class MyString2):
 *      public MyString2(String s);
 *      public int compare(String s);
 *      public MyString2 substring(int begin);
 *      public MyString2 toUpperCase();
 *      public char[] toChars();
 *      public static MyString2 valueOf(boolean b)
 * @author DejanD
 */
public class Exercise_10_23 {
    public static void main(String[] args) {
        // Create two MyStirng2 objects
		MyString2 str1 = new MyString2("Test1234");
		MyString2 str2 = new MyString2("AbCdEfGhIj");

		// Test compare(String s)
		System.out.println("\nCompare str1 to \"Test1234\":");
		System.out.println(str1.compare("Test1234"));

		// Test substring(int begin);
		System.out.println("\nDisplay a substring if str2 beginning at index 5:");
		System.out.println(str2.substring(5).toString());

		// Test toUpperCase()
		System.out.println("\nConvert str2 to upper case:");
                System.out.println(str2.toUpperCase().toString());

		// Test valueOf(boolean b)
		System.out.println("\nDisplay the boolean value true as a MyStirng2 object:");
		System.out.println(MyString2.valueOf(true)); 
    }
    
}
    
