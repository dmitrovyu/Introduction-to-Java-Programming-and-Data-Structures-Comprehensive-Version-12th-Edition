/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_06_03;

import java.util.Scanner;

/**
 * (Palindrome integer) Write the methods with the following headers:
 * // Return the reversal of an integer, e.g., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a
 * palindrome if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 * @author DEJAN
 */
public class Exercise_06_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = in.nextInt();
        System.out.println("The number is palindrome: " + isPalindrome(input));
        
    }
    public static boolean isPalindrome(int n){
        return n == reverse (n);
    }
    public static int reverse(int n){
        int rev = 0;
        while(n !=0){
            rev = rev*10 + n % 10;
            n /=10;
        }
        return rev;
    }
}
