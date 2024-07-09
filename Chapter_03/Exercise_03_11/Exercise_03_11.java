
package Exercise_03_11;

import java.util.Scanner;

/**
 * *3.11 (Find the number of days in a month) Write a program that prompts the user to enter
 * the month and year and displays the number of days in the month. For example, if
 * the user entered month 2 and year 2012, the program should display that February
 * 2012 has 29 days. If the user entered month 3 and year 2015, the program should
 * display that March 2015 has 31 days.
 *
 * @author DejanD
 * */
public class Exercise_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as a number: ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        
        int noOfDays = 0;
        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 :
                noOfDays = 31;
                break;
            
            case 2: 
                noOfDays = 28;
                break;
            case 4, 6, 9, 11 : noOfDays = 30;
                break;
            
        }
        if (isLeapYear) noOfDays = 29;
        
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;

        }
        
        System.out.println("Month " + monthName + " in year " + year + " has " + noOfDays + " days");
        
    }   
}
