
package Exercise_07_03;

import java.util.Scanner;

/**
 * (Count occurrence of numbers) Write a program that reads the integers 
 * between 1 and 100 and counts the occurrences of each. Assume the input ends with 0. 
 * Here is a sample run of the program: Note that if a number occurs more than one time, 
 * the plural word “times” is used in the output. Numbers are displayed in increasing order.
 * 
 * @author DEJAN
 */
public class Exercise_07_03 {
    public static void main(String[] args) {
        int[] occurrences = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int input;
        
        do {
            input = in.nextInt();
            occurrences[input] ++;
        }while (input !=0);
        
        for (int i = 1; i < occurrences.length; i++){
            if (occurrences[i] != 0){
                System.out.println(i  + "  occurs " + occurrences[i] + " time" + ((occurrences[i]>1) ? "s" : " "));
            }
        }
    }
}
