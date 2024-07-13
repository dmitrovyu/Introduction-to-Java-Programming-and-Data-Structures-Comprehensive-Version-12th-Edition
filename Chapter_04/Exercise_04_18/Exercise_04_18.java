
package Exercise_04_18;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.18 (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 * Here is a sample run:
 *
 *          Enter two characters: I1
 *          Information Management Freshman
 *
 *          Enter two characters: A3
 *          Accounting Junior
 *
 *          Enter two characters: T3
 *          Invalid input
 *
 * @author DejanD
 * */

public class Exercise_04_18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("Enter two characters: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char major = input.charAt(0);
        int status = Character.getNumericValue(input.charAt(1));
        String majorStr = switch(major){
            case 'M' -> "Mathematics";
            case 'C' -> "Computer Science";
            case 'I' -> "Information Technology";
            default -> null;   
        };
        String statusStr =switch(status){
            case 1 -> "Freshman";
            case 2 -> "Sophomore";
            case 3 -> "Junior";
            case 4 -> "Senior";
            default -> null;
        };
        if (statusStr == null || majorStr == null)
            System.out.println("Invalid input");
        else {
            System.out.println(majorStr + " " + statusStr);
        }
        
        
    }
}
