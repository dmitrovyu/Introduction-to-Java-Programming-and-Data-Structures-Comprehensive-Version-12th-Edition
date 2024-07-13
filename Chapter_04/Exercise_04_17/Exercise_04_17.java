
package Exercise_04_17;

import java.util.Locale;
import java.util.Scanner;

/**
 * *4.17 (Days of a month) Write a program that prompts the user to enter the year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. If the input for month is incorrect, display a
 * message as presented in the following sample runs
 *
 *          Enter a year: 2001
 *          Enter a month: Jan
 *          Jan 2001 has 31 days
 *
 *          Enter a year: 2016
 *          Enter a month: jan
 *          jan is not a correct month name
 *
 * @author DejanD
 * */

public class Exercise_04_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        System.out.print("Enter a month: ");
        String month = in.next();
        
        //Calculate if the year is leap year
        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        
        
        //Calculate number of days in the month
        int noOfDays = switch(month){
            case "Jan","Mar", "May", "Jul","Aug","Oct","Dec" -> 31;
            case "Feb" -> 28;
            case "Apr", "Jun","Sep","Nov" -> 30;
            default -> 0;   
        };
        if (noOfDays == 0) System.out.println(month + " is not a correct month name");
        else {
            if (month.equals("Feb") && isLeap) noOfDays++;
            System.out.println(month + " " + year + " has " + noOfDays + " days");
        }

        
        
    }
}
