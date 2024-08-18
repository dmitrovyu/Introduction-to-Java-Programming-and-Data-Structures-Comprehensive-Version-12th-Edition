package Exercise_06_18;

import java.util.Scanner;

/**
 *
 * (Check password) Some Websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * ■ A password must have at least eight characters. 
 * ■ A password must contain only letters and digits. 
 * ■ A password must contain at
 * least two digits. Write a program that prompts the user to enter a password
 * and displays Valid Password if the rules are followed, or Invalid Password
 * otherwise.
 *
 * @author DejanD
 */
public class Exercise_06_18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = in.nextLine();
        if (checkPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    public static boolean checkPassword(String pass) {
        int noOfDigits = 0;
        if (pass.length() < 8) {
            return false;
        }
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                noOfDigits++;
            } else if (!Character.isLetter(pass.charAt(i))) {
                return false;
            }
        }
        return noOfDigits >= 2;
    }
}
