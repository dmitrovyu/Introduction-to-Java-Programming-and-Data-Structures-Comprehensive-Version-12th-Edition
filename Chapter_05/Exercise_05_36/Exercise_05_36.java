package Exercise_05_36;

import java.util.Scanner;

/**
 *
 * (Business application: checking ISBN) Use loops to simplify Programming
 * Exercise 3.9.
 *
 * @author DejanD
 */
public class Exercise_05_36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN = input.nextInt();
        int temp = ISBN;
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += (temp % 10) * (10 - i);
            temp /= 10;
            System.out.println("sum: " + sum + " temp: " + temp);
        }
        sum = sum % 11;
        System.out.println("The ISBN-10 number is 0" + ISBN + ((sum == 10) ? "X" : sum));
    }
}
