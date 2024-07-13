
package Exercise_04_08;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code 
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 * Enter an ASCII code: 69 
 * The character for ASCII code 69 is 
 *
 * @author DejanD
 * */
public class Exercise_04_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = in.nextInt();
        if (code >0 && code <128) System.out.println("The character for ASCII code " + code + " is " 
                + Character.toString(code));
        else System.out.println("Code entered is not an ASCII code");
        
        
    }
}
