
package Exercise_05_03;

/**
 *
 * (Conversion from kilograms to pounds) Write a program that displays the following 
 * table (note 1 kilogram is 2.2 pounds):
 * Kilograms Pounds
 * 1  2.2
 * 3  6.6
 * . . .
 * 197 433.4
 * 199 437.8
 * 
 * @author DEJAN
 */
public class Exercise_05_03 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Kilograms          Pounds");
        while (i<200) {
            System.out.printf("%-10d%15.1f\n", i, i*2.2);
            i++;
        }
    }
}
