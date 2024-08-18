
package Exercise_06_37;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Format an integer) Write a method with the following header to format the
 * integer with the specified width.
 * 
 *      public static String format(int number, int width)
 * 
 * The method returns a string for the number with one or more prefix 0s. The size of the
 * string is the width. For example, format(34, 4) returns 0034 and format(34,
 * 5) returns 00034. If the number is longer than the width, the method returns the
 * string representation for the number. For example, format(34, 1) returns 34.
 * Write a test program that prompts the user to enter a number and its width, and
 * displays a string returned by invoking format(number, width).
 * @author DEJAN
 */
public class Exercise_06_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US); 
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Enter a width: ");
        int width = in.nextInt();
        System.out.println(format(num,width));
        
    }
    public static String format(int number, int width){
        String in = number + "";
        String out = "";
        if (in.length() >= width) return in;
        for (int i = 0; i <width-in.length(); i++){
            out += "0";
        }
        out += in;
        return out;
}
}

