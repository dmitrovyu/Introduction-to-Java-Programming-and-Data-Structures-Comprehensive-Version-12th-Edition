
package Exercise_03_08;

import java.util.Scanner;

/**
 * *3.8 (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 *
 * @author DejanD
 * */
public class Exercise_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp = a;
        if (a > b) {
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Integers in increasing order are: " + a + ", " + b + ", " + c);
        
    }
    
}
