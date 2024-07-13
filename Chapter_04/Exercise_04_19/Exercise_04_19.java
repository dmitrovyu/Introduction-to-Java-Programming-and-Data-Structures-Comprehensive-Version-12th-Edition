
package Exercise_04_19;

import java.util.Scanner;

/**
 * 4.19 (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
 * ISBN number as a string.
 *
 * @author DejanD
 * */
public class Exercise_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String ISBN_Str = input.next();
        int  ISBN = Integer.parseInt(ISBN_Str);
        int temp = ISBN;
        int sum = ((temp) % 10 * 9 + (temp = temp /10) % 10 * 8 + (temp = temp /10) % 10 * 7 + 
              (temp = temp /10) % 10 * 6 + (temp = temp /10) % 10 * 5 + (temp = temp /10) % 10 * 4 +  
              (temp = temp /10) % 10 * 3 + (temp = temp /10) % 10 * 2 + (temp = temp /10) % 10 * 1) % 11;
        System.out.println("The ISBN-10 number is 0" + ISBN + ((sum == 10)? "X":sum));
    }
    
}
