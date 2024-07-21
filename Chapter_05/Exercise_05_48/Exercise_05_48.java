
package Exercise_05_48;

import java.util.Scanner;

/**
 *
 * (Process string) Write a program that prompts the user to enter a string and displays
 * the characters at odd positions. Here is a sample run:
 *
 *      Enter a string: Beijing Chicago
 *      ejnhcg
 *
 * 
 * @author DejanD
 */
public class Exercise_05_48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input  = in.nextLine();
        for (int i = 0; i <input.length(); i++){
            System.out.print(input.charAt(i));
            i++;
        }
            
    }
    
}
