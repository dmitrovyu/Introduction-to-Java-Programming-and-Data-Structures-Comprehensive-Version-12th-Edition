
package Exercise_06_22;

import java.util.Scanner;

/**
 * (Math: approximate the square root) There are several techniques for
 * implementing the sqrt method in the Math class. One such technique is known as the
 * Babylonian method. It approximates the square root of a number, n, by
 * repeatedly performing the calculation using the following formula:
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. If the difference between
 * nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. If not,
 * nextGuess becomes lastGuess and the approximation process continues. Implement
 * the following method that returns the square root of n:
 * public static double sqrt(long n)
 * 
 * 
 * @author DEJAN
 */
public class Exercise_06_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long n = in.nextLong();
        System.out.println("Square root is: " + sqrt(n));
        
    }
    public static double sqrt(long n){
        double lastGuess;
        double nextGuess = 1.0;
        do {
           lastGuess = nextGuess;
           nextGuess = (lastGuess + n/lastGuess)/2;
        } while (Math.abs(nextGuess - lastGuess) > 0.0001);
        return nextGuess;
    }
}
