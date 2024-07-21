
package Exercise_05_39;

/**
 * (Financial application: find the sales amount) You have just started a sales job in a
 * department store. Your pay consists of a base salary and a commission. The base salary
 * is $5,000. The scheme shown below is used to determine the commission rate.
 * Sales Amount Commission Rate
 * $0.01–$5,000 6 percent
 * $5,000.01–$10,000 8 percent
 * $10,000.01 and above 10 percent
 *  Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
 * $5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the
 * commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200. Your goal is to
 * earn $30,000 a year.
 * Write a program to find the minimum sales you have to generate in order to make $30,000.
 * @author DejanD
 */
public class Exercise_05_39 {
    public static void main(String[] args) {
        double baseSalary = 5000;
        double commision = 0;
        double totalSalary = 0;
        double sales = 0;
        while (totalSalary < 30000){
            if (sales < 5000) commision = sales*0.08 + baseSalary;
            else if (sales < 10.000) commision = 5000 * 0.08 + (sales-5000)*0.1;
            else commision = 5000*0.8 + 10000*0.1 + (sales-10000)*0.12;
            totalSalary = baseSalary + commision;
            sales++;
            
        }
        System.out.println("Sales: " + sales + " Total salary: " + totalSalary);
    }
}
