
package Exercise_03_31;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.31 (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * */
public class Exercise_03_31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = in.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        byte direction = in.nextByte();
        if (direction == 0) {
            System.out.print("Enter the dollar amount: ");
            double amount = in.nextDouble();
            System.out.println("$" + amount + " is " + amount*exchangeRate + " yuan");
        }
        else {
            System.out.print("Enter the RMB amount: ");
            double amount = in.nextDouble();
            System.out.printf(" %5.2f yuan is $%5.2f", amount, amount/exchangeRate);
        }
    }
}
