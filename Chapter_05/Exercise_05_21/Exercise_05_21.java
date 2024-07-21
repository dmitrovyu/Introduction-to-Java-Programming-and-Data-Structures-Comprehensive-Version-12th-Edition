
package Exercise_05_21;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Financial application: compare loans with various interest rates) Write a program 
 * that lets the user enter the loan amount and loan period in number of years, 
 * and displays the monthly and total payments for each interest rate starting from 
 * 5% to 8%, with an increment of 1/8. Here is a sample run:
 *      Loan Amount: 10000 
 *      Number of Years: 5 
 *      Interest Rate    Monthly Payment    Total Payment
 *      5.000%           188.71             11322.74
 *      5.125%           189.29             11357.13
 *      5.250%           189.86             11391.59
 *      ...
 *      7.875%           202.17             12129.97
 *      8.000%           202.76             12165.84
 * 
 * @author DEJAN
 */
public class Exercise_05_21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int amountOfLoan = in.nextInt();
        System.out.print("Number of Years: ");
        int years = in.nextInt();
        System.out.println("\nInterest Rate\t\t\t\tMonthly Payment\t\t\tTotal Payment");
        for (double i = 5.0; i <=8; i+=0.125){
            String interestRate = String.format("%.3f", i);
            double monthlyPayment = amountOfLoan * (i/1200) / (1 - 1 / Math.pow(1 + i/1200, years * 12));
            double total = monthlyPayment * 12 * years;
            System.out.println(interestRate + "%\t\t\t\t\t" + String.format("%.2f", monthlyPayment)
                    + "\t\t\t\t" + String.format("%.2f", total));
        }
    }
    
}
