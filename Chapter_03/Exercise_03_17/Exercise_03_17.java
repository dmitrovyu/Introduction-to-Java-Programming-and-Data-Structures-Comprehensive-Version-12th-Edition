
package Exercise_03_17;

import java.util.Scanner;

/**
 * *3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–
 * paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws. Here are sample runs:
 *
 *          scissor (0), rock (1), paper (2): 1
 *          The computer is scissor. You are rock. You won
 *
 *          scissor (0), rock (1), paper (2): 2
 *          The computer is paper. You are paper too. It is a draw
 *
 * @author DejanD
 * */
public class Exercise_03_17 {
    
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
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();
        int comp = (int)(Math.random()*3);
        if (player == comp) System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + " too. It is a draw.");
        else if(((comp == 0) && (player == 2)) || ((comp == 1) && (player == 0)) ||
                ((comp == 2) && (player == 1))) {
            System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + ". The computer wins.");
        }
        else
            System.out.println("The computer is " + toString(comp) + " You are " + toString(player) + ". You are the winner!!!");
        
    }
}
