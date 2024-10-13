
package Exercise_10_05;

import java.util.Scanner;

/**
 *
 * (Display the prime factors) Write a program that prompts the user to enter a 
 * positive integer and displays all its smallest factors in decreasing order. For 
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and 
 * retrieve and display them in reverse order.
 * @author DejanD
 */
public class Exercise_10_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int x = in.nextInt();
        int n = 2;
        
        StackOfIntegers stack = smallestFactors(x);
        
        
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
        
    }
    public static StackOfIntegers smallestFactors(int number){
        StackOfIntegers stack = new StackOfIntegers();
        int i = 2; // Potential prime factor
        while (number / i != 1)
        {
            if (number % i == 0)
            {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
        return stack;
    }
}
