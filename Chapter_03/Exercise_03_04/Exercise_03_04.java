package Exercise_03_04;

/**
 * **3.4 (Random month) Write a program that randomly generates an integer
 * between 1 and 12 and displays the English month names January, February, . .
 * . , December for the numbers 1, 2, . . . , 12, accordingly.
 *
 * @author DejanD
 *
 */
public class Exercise_03_04 {

    public static void main(String[] args) {
        int min = 1;
        int max = 12;
        int month = (int) (Math.random() * (max - min + 1)) + min;
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
        System.out.println(monthName);

    }
}
