
package Exercise_06_34;

import java.util.Scanner;

/**
 * 
 * (Print calendar) Programming Exercise 3.21 uses Zeller’s congruence to calculate
 * the day of the week. Simplify Listing 6.12, PrintCalendar.java, using Zeller’s algorithm 
 * to get the start day of the month.
 * 
 * @author DejanD
 */
public class Exercise_06_34 {
 /**
 * Listing 6.12 PrintCalendar.java
 */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
    }

    /**
     * Print the calendar for a month in a year
     */
    public static void printMonth(int year, int month)
    {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }


    /**
     * Print the month title, e.g., March 2012
     */
    public static void printMonthTitle(int year, int month)
    {
        System.out.println(" " + getMonthName(month)
                + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /**
     * Get the English name for the month
     */
    public static String getMonthName(int month)
    {
        String monthName = "";
        switch (month)
        {
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
        }
        return monthName;
    }


    /**
     * Print month body
     */
    public static void printMonthBody(int year, int month)
    {
        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++)
        {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    
    /********************************************
     * new version of procedure to get start day
     * using Zeller’s algorithm
     * ******************************************
     */
    
    public static int getStartDay(int year, int month){
        int day = 0;
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;

        int h = (day + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }
    
    
    /**
     * Get the number of days in a month
     */
    public static int getNumberOfDaysInMonth(int year, int month)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return 0; // If month is incorrect
    }

    /**
     * Determine if it is a leap year
     */
    public static boolean isLeapYear(int year)
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
