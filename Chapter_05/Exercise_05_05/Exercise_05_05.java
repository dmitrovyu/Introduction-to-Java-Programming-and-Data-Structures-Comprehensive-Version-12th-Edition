
package Exercise_05_05;

/**
 *(Conversion from kilograms to pounds and pounds to kilograms) Write a pro
 * gram that displays the following two tables side by side:
 * Kilograms Pounds | Pounds Kilograms
 * 1            2.2 |    20     9.09
 * 3            6.6 |    25     11.36
 * . . .
 * 197        433.4 |    510    231.82
 * 199        437.8 |    515    234.09
 * 
 * @author DEJAN
 */
public class Exercise_05_05 {
    public static void main(String[] args) {
        int kg = 0;
        int pound = 15;
        System.out.println("Kilograms\tPounds | Pounds\t Kilograms");
        while( kg< 20) {
            kg++;
            pound += 5;
            System.out.printf("%-3d%17.1f   |   %-3d%10.2f\n", kg, kg*2.2, pound, pound/2.2);   
        }
    }
}
