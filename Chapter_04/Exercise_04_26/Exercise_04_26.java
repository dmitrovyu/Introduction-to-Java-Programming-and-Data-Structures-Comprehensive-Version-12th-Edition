
package Exercise_04_26;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.26 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java,
 * to fix the possible loss of accuracy when converting a float value to an int value.
 * Read the input as a string such as "11.56". Your program should extract the dollar
 * amount before the decimal point, and the cents after the decimal amount using the
 * indexOf and sub-string methods.
 *
 * @author DejanD
 */

public class Exercise_04_26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        String amount = in.next();
        int decPointIdex = amount.indexOf(".");
        int dollars = Integer.parseInt(amount.substring(0, decPointIdex));
        int cents = Integer.parseInt(amount.substring(decPointIdex+1));
        System.out.println("The dollars: $" + dollars);
        System.out.println("The cents: ¢" + cents);
    }
}
