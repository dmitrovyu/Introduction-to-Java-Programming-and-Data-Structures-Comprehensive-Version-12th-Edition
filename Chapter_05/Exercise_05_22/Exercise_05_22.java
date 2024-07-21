
package Exercise_05_22;

import java.util.Locale;
import java.util.Scanner;

/**
 * **5.22 (Financial application: loan amortization schedule) The monthly payment for a given
 * loan pays the principal and the interest. The monthly interest is computed by
 * multiplying the monthly interest rate and the balance (the remaining principal). The principal
 * paid for the month is therefore the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount, number of years, and interest
 * rate then displays the amortization schedule for the loan. Here is a sample run:
 *
 *          Loan Amount: 10000
 *          Number of Years: 1
 *          Annual Interest Rate: 7
 *
 *          Monthly Payment: 865.26
 *          Total Payment: 10383.21
 *
 *          Payment#        Interest        Principal      Balance
 *          1               58.33           806.93         9193.07
 *          2               53.62           811.64         8381.43
 *                                  ...
 *          11              10.00           855.26          860.27
 *          12              5.01            860.25          0.01
 *
 * @author DejanD
 */
public class Exercise_05_22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = in.nextDouble();
        System.out.print("Number of Years: ");
        int years = in.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterest = in.nextDouble();
        double monthlyInterest = annualInterest/1200;
        double monthlyPayment = amount*monthlyInterest /
                (1 - (Math.pow(1 / (1 + monthlyInterest), years * 12)));
        double balance = amount;
        double interest;
        double principal;
        System.out.println("Monthly Payment: " + (int)(monthlyPayment*100) / 100.0);
        System.out.println("Total Payment: " + (int)(monthlyPayment * 12 * years * 100) / 100.0 + "\n");
        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <=years*12; i++){
            interest = (int)(monthlyInterest * balance*100) /100.0;
            principal = (int)((monthlyPayment-interest)*100) /100.0;
            balance = (int)((balance - principal)*100) /100.0;
            if (i == years*12 && balance != 0) {
                principal+=balance;
                balance = 0;
            }
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }
        
        
    }
}
