
package Exercise_07_21;

/**
 * (Sum integers) Write a program that passes an unspecified number of integers 
 * from command line and displays their total.
 * 
 * @author DejanD
 */
public class Exercise_07_21 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("The sum of integers is: " + sum);
    }
}
