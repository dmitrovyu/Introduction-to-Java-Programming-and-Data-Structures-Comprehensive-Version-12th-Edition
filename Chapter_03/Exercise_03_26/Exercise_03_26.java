
package Exercise_03_26;

import java.util.Locale;
import java.util.Scanner;

/**
 * 3.26 (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6 but not both. Here is a sample run of
 * this program:
 *
 *          Enter an integer: 10
 *          Is 10 divisible by 5 and 6? false
 *          Is 10 divisible by 5 or 6? true
 *          Is 10 divisible by 5 or 6 but not both? true
 *
 * @author DejanD
 * */
public class Exercise_03_26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter an integer: ");
        int x = input.nextInt();
        System.out.println("Is 10 divisible by 5 and 6? " + ((x % 5 == 0) && (x % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? " + ((x % 5 == 0) || (x % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + ((x % 5 == 0) ^ (x % 6 == 0)));
    }
}
