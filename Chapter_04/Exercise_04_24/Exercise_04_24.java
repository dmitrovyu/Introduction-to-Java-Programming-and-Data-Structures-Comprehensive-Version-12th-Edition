
package Exercise_04_24;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Order three cities) Write a program that prompts the user to enter three cities 
 * and displays them in ascending order. Here is a sample run:
 *    Enter the first city: Chicago 
 *    Enter the second city: Los Angeles 
 *    Enter the third city: Atlanta 
 *    The three cities in alphabetical order are Atlanta Chicago Los Angeles
 * 
 * @author DejanD
 */
public class Exercise_04_24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String first = in.nextLine();
        System.out.print("Enter the second city: ");
        String second = in.nextLine();
        System.out.print("Enter the third city: ");
        String third = in.nextLine();
        String temp;
        if ( first.compareTo(second)> 0){
            temp = first;
            first = second;
            second = temp;
        }
        if (first.compareTo(third) > 0) {
            temp = first;
            first = third;
            third = temp;
        }
        if (second.compareTo(third) > 0) {
            temp = second;
            second = third;
            third = temp;
        }
        System.out.println("The three cities in alphabetical order are "+first + " " + second + " " + third);
            
                
        
    }
}
