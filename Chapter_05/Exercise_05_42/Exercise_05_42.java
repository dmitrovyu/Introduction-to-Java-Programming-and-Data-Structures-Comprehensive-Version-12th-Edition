
package Exercise_05_42;

import java.util.Scanner;

/**
 * (Financial application: find the sales amount) Rewrite Programming Exercise 
 * 5.39 as follows:
 * ■ Use a for loop instead of a do-while loop.
 * ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * 
 * @author DEJAN
 */
public class Exercise_05_42 {
    public static void main(String[] args) {
        double baseSalary = 5000;
        double commision = 0;
        double totalSalary = 0;
        int sales = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter commision sought: ");
        double commisionSought = in.nextInt();     
        
        for (sales = 1; commision< commisionSought; sales++){
            if (sales < 5000) commision = sales*0.08 + baseSalary;
            else if (sales < 10.000) commision = 5000 * 0.08 + (sales-5000)*0.1;
            else commision = 5000*0.8 + 10000*0.1 + (sales-10000)*0.12;
            totalSalary = baseSalary + commision;
        
            
        }
        System.out.println("Sales: " + sales + " Commisions earned " + commision + " Total salary: " + totalSalary);
    }
}

