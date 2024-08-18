package Exercise_06_16;

/**
 * (Number of days in a year) Write a method that returns the number of days in
 * a year using the following header: public static int numberOfDaysInAYear(int
 * year) Write a test program that displays the number of days in year from 2000
 * to 2020.
 *
 * @author DejanD
 */
public class Exercise_06_16 {

    public static void main(String[] args) {
        System.out.println("year\tNo.Of Days");
        for (int i = 2000; i < 2021; i++) {
            System.out.println(i + "\t" + numberOfDaysInYear(i));
        }
    }

    public static int numberOfDaysInYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            return 366;
        } else {
            return 365;
        }
    }
}
