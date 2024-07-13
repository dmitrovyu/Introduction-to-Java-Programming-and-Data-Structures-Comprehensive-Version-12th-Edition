
package Exercise_04_23;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.23 (Financial application: payroll) Write a program that reads the following
 * information and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * 
 * @author DejanD
 */
public class Exercise_04_23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee’s name: ");
        String name = in.next();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = in.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedtax = in.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double statetax = in.nextDouble();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + rate*hours);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + fedtax*100+"%): $" + rate*hours*fedtax);
        System.out.println("  State Withholding (" + statetax*100 + "%): $" + rate*hours*statetax);
        double totalDeduction = rate*hours*fedtax + rate*hours*statetax;
        System.out.println("  Total Deduction: $" + totalDeduction);
        System.out.printf("Net Pay: $%3.3f",(rate*hours-totalDeduction));
    }
    
}
