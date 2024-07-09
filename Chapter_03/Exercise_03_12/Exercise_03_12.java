package Exercise_03_12;

import java.util.Scanner;

/**
 * 3.12 (Palindrome integer) Write a program that prompts the user to enter a
 * three-digit integer and determines whether it is a palindrome integer. An
 * integer is palindrome if it reads the same from right to left and from left
 * to right. A negative integer is treated the same as a positive integer. Here
 * are sample runs of this program:
 *
 * Enter a three-digit integer: 121 121 is a palindrome
 *
 * Enter a three-digit integer: 123 123 is not a palindrome
 *
 * @author DejanD
 *
 */
public class Exercise_03_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int lastDigit = number % 10;
        int firstDigit = (int) number / 100;

        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

    }

}
