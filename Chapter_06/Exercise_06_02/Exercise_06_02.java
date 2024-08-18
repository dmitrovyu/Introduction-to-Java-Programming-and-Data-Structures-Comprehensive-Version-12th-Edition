
package Exercise_06_02;

import java.util.Scanner;

/**
 * (Sum the digits in an integer) Write a method that computes the sum of the digits
 * in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator
 * to extract digits and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
 * (= 2 3 ). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer then
 * displays the sum of all its digits.
 * @author DEJAN
 */
public class Exercise_06_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.println("Sum of digitis is: " + sumDigits(in.nextLong()));
        
    }
    public static int sumDigits(long n){
        int sum = 0;
        long input = Math.abs(n);
        while (input > 0) {
            sum += input % 10;
            input/=10;
        }
        return sum;
    }
}
