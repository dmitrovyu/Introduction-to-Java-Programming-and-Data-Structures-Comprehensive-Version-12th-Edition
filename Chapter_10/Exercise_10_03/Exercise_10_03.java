
package Exercise_10_03;

/**
 
* (The MyInteger class) Design a class named MyInteger. The class contains:      *
*                                                                                *
* ■ An int data field named value that stores the int value represented by this  *
*   object.                                                                      *
* ■ A constructor that creates a MyInteger object for the specified int value.   *
* ■ A getter method that returns the int value.                                  *
* ■ The methods isEven(), isOdd(), and isPrime() that return true if the         *
*   value in this object is even, odd, or prime, respectively.                   *
* ■ The static methods isEven(int), isOdd(int), and isPrime(int) that            *
*   return true if the specified value is even, odd, or prime, respectively.     *
* ■ The static methods isEven(MyInteger), isOdd(MyInteger), and                  *
*   isPrime(MyInteger) that return true if the specified value is even, odd,     *
*   or prime, respectively.                                                      *
* ■ The methods equals(int) and equals(MyInteger) that return true if            *
*   the value in this object is equal to the specified value.                    *
* ■ A static method parseInt(char[]) that converts an array of numeric           *
*   characters to an int value.                                                  *
* ■ A static method parseInt(String) that converts a string into an int          *
*   value.                                                                       *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a       *
* client program that tests all methods in the class.  
*
 * @author DejanD
 */
public class Exercise_10_03 {
    public static void main(String[] args) {
        
        //Test static method of MyInteger class
        int[] values = {3,4,5,6,7,8,9,10};
        System.out.println("*******Test static methods*******");
        for (int i =0; i < values.length; i++){
            System.out.println("The value: " + values[i] + " is even: " + MyInteger.isEven(values[i]));
            System.out.println("The value: " + values[i] + " is odd: " + MyInteger.isOdd(values[i]));
            System.out.println("The value: " + values[i] + " is prime: " + MyInteger.isPrime(values[i]));
        }
        
        // Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
        System.out.println("\n*******Test MyInteger class values*******");
        for (int i = 0; i < values.length; i++){
            MyInteger mi = new MyInteger(values[i]);
            System.out.println("The value: " + mi.getValue() + " is even: " + mi.isEven());
            System.out.println("The value: " + mi.getValue() + " is odd: " + mi.isOdd());
            System.out.println("The value: " + mi.getValue() + " is prime: " + mi.isPrime());
            
        }
        
        // Test equals(int) and equals(MyInteger)
        System.out.println("**********Test equals(int) and equals(MyInteger)**********");
        int[] values2 = {3,4,9,6,11,8,2,10};
        MyInteger[] valuesInt = new MyInteger[values2.length];
        for (int i =0; i < values2.length; i++)
            valuesInt[i] = new MyInteger(values[i]);
        for(int i = 0; i < values.length; i++){
            System.out.println("The number: " + values2[i] + " is equal to " + valuesInt[i].getValue() 
                                + " : " + valuesInt[i].equals(values2[i]));
            System.out.println("The number: " + values2[i] + " is equal to " + valuesInt[i].getValue() 
                                + " : " + valuesInt[i].equals(new MyInteger(values2[i])));
        }
        
        // Test parseInt(char[]) and parseInt(String)
        System.out.println("******Test parseInt(char[]) and parseInt(String)******");
        char[] a = {'4','6','8'};
        int num = MyInteger.parseInt(a);
        String num2 = "1526";
        System.out.println(String.copyValueOf(a) + " is equal to: " + num);
        System.out.println(num2 + " is equal to: " + MyInteger.parseInt(num2));
            
    }
}
