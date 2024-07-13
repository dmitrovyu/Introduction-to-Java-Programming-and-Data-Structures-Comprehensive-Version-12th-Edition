
package Exercise_04_21;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.21 (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid. Here are sample runs:
 *
 *          Enter a SSN: 232−23−5435
 *          232−23−5435 is a valid social security number
 *
 *          Enter a SSN: 23−23−5435
 *          23−23−5435 is an invalid social security number
 *
 * @author DejanD
 * */

public class Exercise_04_21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String no_SSN = in.next();
        boolean isValidSSN = false;
        if (no_SSN.length() == 11){
            isValidSSN = Character.isDigit(no_SSN.charAt(0)) &&
                             Character.isDigit(no_SSN.charAt(1)) &&
                             Character.isDigit(no_SSN.charAt(2)) &&
                             no_SSN.charAt(3)=='-' &&
                             Character.isDigit(no_SSN.charAt(4)) &&
                             Character.isDigit(no_SSN.charAt(5)) &&
                             no_SSN.charAt(6)=='-' &&
                             Character.isDigit(no_SSN.charAt(7)) &&
                             Character.isDigit(no_SSN.charAt(8)) &&
                             Character.isDigit(no_SSN.charAt(9));    
        }
        if (isValidSSN)   
            System.out.println(no_SSN + " is a valid social security number");
        else 
            System.out.println(no_SSN + " is an invalid social security number");
    }
}
