
package Exercise_03_09;

import java.util.Scanner;

/**
 * **3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other 9 digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 * d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
 *  If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 *
 *      Enter the first 9 digits of an ISBN as integer: 013601267
 *      The ISBN-10 number is 0136012671
 *
 *      Enter the first 9 digits of an ISBN as integer: 013031997
 *      The ISBN-10 number is 013031997X
 *
 * @author DejanD
 * */
public class Exercise_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN = input.nextInt();
        int temp = ISBN;
        int sum = ((temp) % 10 * 9 + (temp = temp /10) % 10 * 8 + (temp = temp /10) % 10 * 7 + 
              (temp = temp /10) % 10 * 6 + (temp = temp /10) % 10 * 5 + (temp = temp /10) % 10 * 4 +  
              (temp = temp /10) % 10 * 3 + (temp = temp /10) % 10 * 2 + (temp = temp /10) % 10 * 1) % 11;
        System.out.println("The ISBN-10 number is 0" + ISBN + ((sum == 10)? "X":sum));
        
    }
    
}
