
package Exercise_09_03;
import java.util.Date;

/**
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed 
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 
 * 10000000000, and 100000000000, and displays the date and time using the 
 * toString() method, respectively.
 * 
 * @author DejanD
 */
public class Exercise_09_03 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(10000);
        System.out.println(date.toString());
        date.setTime(100000);
        System.out.println(date.toString());
        date.setTime(1000000);
        System.out.println(date.toString());
        date.setTime(10000000);
        System.out.println(date.toString());
        date.setTime(100000000);
        System.out.println(date.toString());
        date.setTime(1000000000);
        System.out.println(date.toString());
        date.setTime(10000000000L);
        System.out.println(date.toString());
        date.setTime(100000000000L);
        System.out.println(date.toString());
    }
}
