
package Exercise_08_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns 
 * marking an available cell in a 3 * 3 grid with their respective tokens (either X 
 * or O). When one player has placed three tokens in a horizontal, vertical, or diagonal
 * row on the grid, the game is over and that player has won. A draw (no winner) 
 * occurs when all the cells on the grid have been filled with tokens and neither 
 * player has achieved a win. Create a program for playing a tic-tac-toe game.
 * The program prompts two players to alternately enter an X token and O token. 
 * Whenever a token is entered, the program redisplays the board on the console and 
 * determines the status of the game (win, draw, or continue). Here is a sample run:
 * 
 * @author DejanD
 */
public class Exercise_08_09 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] table = new char[3][3];
        char check = ' ';
        for (char[] table1: table)
            Arrays.fill(table1, ' ');
  
        System.out.println("X" + (int)'X' + " O:" + (int) 'O' + "  :" + (int) ' ');
        do{
            showTable(table);
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int xCord = in.nextInt();
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int yCord = in.nextInt();
            table[xCord][yCord] = 'X';
            showTable(table);
            if ((check = playerWon(table)) != ' ') break;
            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            xCord = in.nextInt();
            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            yCord = in.nextInt();
            table[xCord][yCord] = 'O';
            if ((check = playerWon(table)) != ' ') break;  
        } while (check == ' ');
        if (check == 'X') System.out.println("X player won");
        else System.out.println("O player won");
    }
    
    public static void showTable(char[][] table){
        System.out.println("-------------");
        for (int i = 0; i <3; i++){
            System.out.println("| " + table[i][0] + " | " + table[i][1] + " | " + 
                    table[i][2] + " |");
            System.out.println("-------------");
        }
        
    }

    public static char playerWon(char[][] table){
        int sumX = 0;
        int sumY = 0;
        int diagX = 0;
        int diagY  = 0;
        for (int i = 0; i < 3; i++){
            sumX += (int)table[0][i] + (int)table[1][i] + (int)table[2][i];
            sumY += (int)table[i][0] + (int)table[i][1] + (int)table[i][2];
            diagX += (int)table[0][0] + (int)table[1][1] + (int)table[2][2];
            diagY += (int)table[0][2] + (int)table[1][1] + (int)table[2][0];
            if (sumX == 264 || sumY == 264 || diagX == 264 || diagY == 264){
                return 'X';
            }
            else if (sumX == 237 || sumY == 237 || diagX == 237 || diagY == 237)
                return 'O';
           
        }
        return ' ';
    }
}


