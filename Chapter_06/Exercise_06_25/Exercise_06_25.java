/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_06_25;

import java.util.Scanner;

/**
 *
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts 
 * milliseconds to hours, minutes, and seconds using the following header:
 *          public static String convertMillis(long millis)
 * The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) 
 * returns a string 0:0:5, convertMillis(100000) returns a string 0:1:40, and 
 * convertMillis(555550000) returns a string 154:19:10. 
 * Write a test program that prompts the user to enter a long integer 
 * for milliseconds and displays a string in the format of hours:minutes:seconds.
 * @author DejanD
 */
public class Exercise_06_25 {
    public static void main(String[] args) {
        System.out.print("Enter millis: ");
        Scanner in = new Scanner(System.in);
        long time = in.nextLong();
        System.out.println(convertMillis(time));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long sec = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long min = totalMinutes % 60;
        long hours = totalMinutes / 60;
        return hours + ":"+ min + ":" + sec;
        
    }
}
