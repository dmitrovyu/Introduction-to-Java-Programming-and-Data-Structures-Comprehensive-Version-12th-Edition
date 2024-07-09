
package Exercise_03_14;

import java.util.Scanner;

/**
 * 3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess, and
 * reports whether the guess is correct or incorrect.
 *
 * @author DejanD
 * */

public class Exercise_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random()*2);
        System.out.print("Guess the head or tail ( 0 / 1 ):  ");
        int num = input.nextInt();
        System.out.println("Flipped coin was: " + random + " and you guessed: " + num );
        System.out.println("Your answer is: " + ((random == num) ? "Correct" : "False"));
        
        
    }
    
   
    
}
