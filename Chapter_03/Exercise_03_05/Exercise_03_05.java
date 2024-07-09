
package Exercise_03_05;

import java.util.Scanner;

/**
 * *3.5 (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week. Here is a sample run:
 *
 *      Enter today’s day: 1
 *      Enter the number of days elapsed since today: 3
 *      Today is Monday and the future day is Thursday
 *
 *      Enter today’s day: 0
 *      Enter the number of days elapsed since today: 31
 *      Today is Sunday and the future day is Wednesday
 *
 * @author DejanD
 * */

public class Exercise_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter today’s day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayPassed = input.nextInt();
        int afterDay = (today + dayPassed) % 7;
        System.out.println("Today is " + dayName(today) + " and the future day is " + dayName(afterDay));
       
    }
    
    //Return day name
    public static String dayName(int x){
        switch (x){
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thursday";
            case 4: return "Friday";
            case 5: return "Saturday";
            case 6: return "Sunday";
        }
        return "";
    }
}
