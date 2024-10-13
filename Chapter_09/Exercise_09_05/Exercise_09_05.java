
package Exercise_09_05;

import java.util.GregorianCalendar;

/**
 *
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar
 * class in the java.util package, which you can use to obtain the year, month, and
 * day of a date. The no-arg constructor constructs an instance for the current date, and
 * the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.
 * MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
 * month, and day. Write a program to perform two tasks:
 * 1. Display the current year, month, and day.
 * 2. The GregorianCalendar class has the setTimeInMillis(long), which
 * can be used to set a specified elapsed time since January 1, 1970. Set the value
 * to 1234567898765L and display the year, month, and day.
 *
 * @author DejanD
 */
public class Exercise_09_05 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println("Current date: " + date.get(GregorianCalendar.YEAR) + "/" + 
                date.get(GregorianCalendar.MONTH) + "/"  +
                date.get(GregorianCalendar.DAY_OF_MONTH));
        
        /* 2009/1/13 */
        date.setTimeInMillis(1234567898765L);
        System.out.println("Set date: " + date.get(GregorianCalendar.YEAR) + "/" + 
                date.get(GregorianCalendar.MONTH) + "/"  +
                date.get(GregorianCalendar.DAY_OF_MONTH));
        
    }
}
