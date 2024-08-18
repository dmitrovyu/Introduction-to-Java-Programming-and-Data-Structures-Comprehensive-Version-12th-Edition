
package Exercise_06_11;

/**
 *
 * (Financial application: compute commissions) Write a method that computes the 
 * commission, using the scheme in Programming Exercise 5.39. The header of the 
 * method is as follows:
 *      public static double computeCommission(double salesAmount)
 * Write a test program that displays the following table:
 * Sales Amount Commission
 * 10000        900.0
 * 15000        1500.0
 * 20000        2100.0
 *...........
 * 100000       11700.0
 * 
 * @author DEJAN
 */
public class Exercise_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");
        for (int i = 10000; i <=100000; i+=5000){
            System.out.println(i+"\t\t\t" + computeCommision(i));
        }
    }
    public static double computeCommision(double salesAmount){
        double commision = 0;
        if (salesAmount <= 5000) commision =  salesAmount*0.08;
            else if (salesAmount <= 10000) commision = 5000 * 0.08 + (salesAmount-5000)*0.1;
            else commision = 5000*0.08 + 5000*0.1 + (salesAmount-10000)*0.12;
       
        return commision;
        
    }
}
