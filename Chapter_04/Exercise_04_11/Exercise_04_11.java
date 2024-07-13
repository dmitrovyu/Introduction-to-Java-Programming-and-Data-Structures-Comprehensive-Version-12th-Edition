
package Exercise_04_11;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer be
 * tween 0 and 15 and displays its corresponding hex number. For an incorrect 
 * input number, display invalid input. Here are some sample runs:
 * Enter a decimal value (0 to 15): 11 
 * The hex value is B
 * Enter a decimal value (0 to 15): 5 
 * The hex value is 5
 * Enter a decimal value (0 to 15): 31 
 * 31 is an invalid input
 * */
public class Exercise_04_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int code = in.nextInt();
        if (code >= 0 && code <10) {
            System.out.println("The hex value is " + code);
        }
        else if (code > 9 && code <=15) {
            int code_ASCII = code + 55;
            System.out.println("The hex valuse is " + Character.toString(code_ASCII));
        }
        else if (code > 15){
            System.out.println(code + " is an invalid input");
        }
        
    }
    
}
