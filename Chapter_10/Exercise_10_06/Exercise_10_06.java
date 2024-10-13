
package Exercise_10_06;

/**
 *(Display the prime numbers) Write a program that displays all the prime 
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class to 
 * store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in 
 * reverse order.
 * @author DejanD
 */
public class Exercise_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 1; i <= 120; i++)
            if (isAPrime(i)) stack.push(i);
        System.out.println("Prime numbers less than 120:");
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
    public static boolean isAPrime(int x){
        for (int i = 2; i < x/2 + 1; i++){
            if (x % i == 0) return false;
        }
        return true;
    }
}
