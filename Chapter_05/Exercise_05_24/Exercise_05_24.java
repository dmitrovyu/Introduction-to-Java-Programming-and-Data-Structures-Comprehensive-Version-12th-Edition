
package Exercise_05_24;

/**
 * (Sum a series) Write a program to compute the following summation:
 * (1/3) + (3/5) + (5/7) + (7/9) + (9/11) + (11/13) + ... + (95/97) + (97/99)
 *
 * @author DEJAND
 */
public class Exercise_05_24 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (double i = 1.0; i<98; i++){
            sum+= i / (i+2);
        }
        System.out.println("Sum: " + sum);
    }
    
}
