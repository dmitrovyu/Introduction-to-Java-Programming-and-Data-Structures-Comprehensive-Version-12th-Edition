
package Exercise_05_30;

import java.util.Locale;
import java.util.Scanner;

/**
 **5.30 (Financial application: compound value) Suppose you save $100 each month
 * in a savings account with annual interest rate 3.75%. The monthly interest rate
 * is 0.0375 / 12 = 0.003125. After the first month, the value in the account
 * becomes
 * 100 * (1 + 0.003125) = 100.3125
 *  After the second month, the value in the account becomes
 * 100 + 100.3125) * (1 + 0.003125) = 200.938
 *  After the third month, the value in the account becomes
 * (100 + 200.938) * (1 + 0.003125) = 301.878
 *  and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
 * amount in the savings account after the given month.
 * 
 * @author DejanD
 */
public class Exercise_05_30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter the annual innterest rate: ");
        double intRate = in.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = in.nextInt();
        double monthlyInterestRate = (intRate/12)/100 + 1;
        double total = 0;
        for (int i = 1; i <=months; i++){
            total = (amount + total) * monthlyInterestRate;
            System.out.printf("After the " + i + ". month: %3.3f \n",total);
        }
       
        
    }
}
