package Exercise_05_29;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Display calendars) Write a program that prompts the user to enter the year
 * and first day of the year and displays the calendar table for the year on the
 * console. For example, if the user entered the year 2013, and 2 for Tuesday,
 * January 1, 2013, your program should display the calendar for each month in
 * the year, as follows:
 *
 * @author DEJAN
 */
public class Exercise_05_29 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        System.out.print("Enter a day (0-Sun 1-Mon ....6-Sat): ");
        int day = in.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        String monthName = "";
        int noOfDays = 0;
        
        System.out.println("");

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
            //Number of days for the each month
            int days;
            switch (monthName) {
                case "February" ->
                    days = (isLeap) ? 29 : 28;
                case "January", "March", "May", "July", "August", "October", "Decemeber" ->
                    days = 31;
                default ->
                    days = 30;
            }
            System.out.println("\t\t" + monthName + " " + year);
            System.out.println("_________________________________________________");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            String month = "";
            for (int k = 0; k < (noOfDays % 7); k++) {
                    month += "\t";
                }
            for (int j = 1; j <= days; j++) {
                if ((j > 1) && ((noOfDays%7 + j -1)% 7 == 0)) month+= "\n";
                month += j + "\t";
            }
            System.out.println(month + "\n");
        }
    }

}
