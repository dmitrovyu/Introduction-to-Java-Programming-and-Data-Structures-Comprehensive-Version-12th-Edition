package Exercise_05_28;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Display the first days of each month) Write a program that prompts the user
 * to enter the year and first day of the year, then displays the first day of
 * each month in the year. For example, if the user entered the year 2013, and 2
 * for Tuesday, January 1, 2013, your program should display the following
 * output: January 1, 2013 is Tuesday ... December 1, 2013 is Sunday
 *
 * @author DejanD
 */
public class Exercise_05_28 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        System.out.print("Enter day (0-Sun 1-Mon ....6-Sat: ");
        int day = in.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        String monthName = "";
        String dayName = "";
        int noOfDays = 0;
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> {
                    monthName = "January";
                    noOfDays = day;
                }
                case 1 -> {
                    monthName = "February";
                    noOfDays += 31;
                }
                case 2 -> {
                    monthName = "March";
                    noOfDays += (isLeap) ? 29 : 28;
                }
                case 3 -> {
                    monthName = "April";
                    noOfDays += 31;
                }
                case 4 -> {
                    monthName = "May";
                    noOfDays += 30;
                }
                case 5 -> {
                    monthName = "June";
                    noOfDays += 31;
                }
                case 6 -> {
                    monthName = "July";
                    noOfDays += 30;
                }
                case 7 -> {
                    monthName = "August";
                    noOfDays += 31;
                }
                case 8 -> {
                    monthName = "September";
                    noOfDays += 31;
                }
                case 9 -> {
                    monthName = "October";
                    noOfDays += 30;
                }
                case 10 -> {
                    monthName = "November";
                    noOfDays += 31;
                }
                case 11 -> {
                    monthName = "December";
                    noOfDays += 30;
                }
            }
            
            switch(day = noOfDays % 7) {
                case 0 -> dayName = "Sunday";
                case 1 -> dayName = "Monday";
                case 2 -> dayName = "Tuesday";
                case 3 -> dayName = "Wednesday";
                case 4 -> dayName = "Thursday";
                case 5 -> dayName = "Friday";
                case 6 -> dayName = "Saturday";
                
                
            }
            System.out.println(monthName + " 1, " + year +  " is "+ dayName);

        }
    }

}
