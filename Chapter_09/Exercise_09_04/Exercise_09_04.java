
package Exercise_09_04;

import java.util.Random;

/**
 *
 * (Use the Random class) Write a program that creates a Random object with seed 
 * 1000 and displays the first 50 random integers between 0 and 100 
 * using the nextInt(100) method
 * @author DejanD
 */
public class Exercise_09_04 {
    public static void main(String[] args) {
        Random rnd = new Random(1000);
        for (int i =1; i < 51; i++){
            System.out.print(rnd.nextInt(100) + " ");
            if (i % 10 == 0) System.out.println("");
        }
            
    }
}
