
package Exercise_05_16;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Find the factors of an integer) Write a program that reads an integer and displays 
 * all its smallest factors in an increasing order. For example, if the input 
 * integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 * @author DEJAN
 */
public class Exercise_05_16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int input = in.nextInt();
        int div = 2;
        while (input >1){
            if (input % div == 0) {
                System.out.print(div + ", ");
                input = input / div;
            } else  {
                div++;
            }
        }
        
    }
}
