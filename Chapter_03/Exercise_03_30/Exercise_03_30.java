
package Exercise_03_30;

import java.util.Locale;
import java.util.Scanner;

/**
 * *3.30 (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 *
 *          Enter the time zone offset to GMT: -5
 *          The current time is 4:50:34 AM
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // GMT -5 for chicago
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int timeZone = scan.nextInt();

        long milliseconds = System.currentTimeMillis();

        long seconds =  milliseconds / 1000;
        long currentSeconds =  seconds % 60;

        long minutes = seconds / 60;
        long currentMinutes =  minutes % 60;

        long hours = minutes / 60;
        long currentHours = hours % 24;

        currentHours += timeZone;
        String currentHourString;
        
        if (currentHours >= 12) {
            currentHours = currentHours - 12;
            currentHourString = " PM";
        }
        else currentHourString = " AM";

        System.out.println("the current time is "+ currentHours + ":" +
                currentMinutes + ":" + currentSeconds + currentHourString);
    }
}
