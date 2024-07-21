
package Exercise_05_34;

import java.util.Scanner;

/**
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays
 * the scissor-rock-paper game. Revise the program to let the user continuously play
 * until either the user or the computer wins three times more than their opponent.
 *
 * @author DejanD
 */
public class Exercise_05_34 {
    
    public static String toString(int x){
        switch(x){
            case 0 : return "Scissor";
            case 1 : return "Rock";
            case 2 : return "Paper";
            default: return null;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        do {
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();
        int comp = (int)(Math.random()*3);
        if (player == comp) System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + " too. It is a draw.");
        else if(((comp == 0) && (player == 2)) || ((comp == 1) && (player == 0)) ||
                ((comp == 2) && (player == 1))) {
            System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + ". The computer wins.");
            count--;
        }
        else {
            System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + ". You are the winner!!!");
        count++;
        }
        } while (count >=-2 && count <= 2);
        // Check who wins
        if (count == 3) System.out.println("End game. You won more than two times");
        else System.out.println("End game. Computer won more than two times");
        
    }
}
