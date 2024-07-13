
package Exercise_04_14;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.14 (Convert letter grade to number) Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 * 1, or 0. For other input, display invalid grade. Here is a sample run:
 *
 *          Enter a letter grade: B
 *          The numeric value for grade B is 3
 *
 *          Enter a letter grade: T
 *          T is an invalid grade
 *
 * @author DejanD
 * */
public class Exercise_04_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char character = Character.toUpperCase(in.next().charAt(0));
        int grade = switch (character){
            case 'A' -> 4;
            case 'B' -> 3;
            case 'C' -> 2;
            case 'D' -> 1;
            case 'F' -> 0;
            default -> -1;
        };
        if (grade == -1) 
            System.out.println(character + " is invalid grade");
        else 
            System.out.println("The numeric value for grade " + character + " is " + grade);
    }
}
