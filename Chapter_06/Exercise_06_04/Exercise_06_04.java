
package Exercise_06_04;

import java.util.Scanner;

/**
 * (Display an integer reversed) Write a method with the following header to 
 * display an integer in reverse order:
 *          public static void reverse(int number)
 * For example, reverse(3456) displays 6543. Write a test program that prompts 
 * the user to enter an integer then displays its reversal.
 * @author DejanD
 */
public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = in.nextInt();
        reverse(input);
    }
    public static void reverse(int n){
        int rev = 0;
        while(n !=0){
            rev = rev*10 + n % 10;
            n /=10;
        }
        System.out.println("Integer reversed: " + rev);
    }
}
