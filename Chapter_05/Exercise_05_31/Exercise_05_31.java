
package Exercise_05_31;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD 
 * with an annual percentage yield of 5.75%. After one month, the CD is worth
 * 10000 + 10000 * 5.75 / 1200 = 10047.92
 *  After two months, the CD is worth
 * 10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 *  After three months, the CD is worth
 * 10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 *  and so on.
 * Write a program that prompts the user to enter an amount (e.g., 10000), the 
 * annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and 
 * displays a table as presented in the sample run
 * 
 * @author DejanD
 */
public class Exercise_05_31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double deposit = in.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double yield = in.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = in.nextInt();
        double total = deposit;
        System.out.println("Month\tCD Value");
        for (int i = 1; i <=months; i++){
            total +=total * yield/1200;
            System.out.printf(i + "\t%5.2f \n",total);
        }
       
        
    }
    
}
