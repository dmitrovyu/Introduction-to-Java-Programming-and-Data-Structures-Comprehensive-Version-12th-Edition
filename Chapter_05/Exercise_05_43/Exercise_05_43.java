
package Exercise_05_43;

/**
 *
 * (Math: combinations) Write a program that displays all possible combinations 
 * for picking two numbers from integers 1 to 7. Also display the total number of 
 * all combinations
 * 
 * @author DejanD
 */
public class Exercise_05_43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i= 1; i < 8; i++){
            for (int j = i+1; j < 8; j++){
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
    
}
