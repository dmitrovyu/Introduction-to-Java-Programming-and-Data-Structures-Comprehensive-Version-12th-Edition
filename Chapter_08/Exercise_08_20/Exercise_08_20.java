
package Exercise_08_20;

import java.util.Arrays;
import java.util.Scanner;

/**
 **(Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row vertically
 * suspended grid, as shown below.
 * The objective of the game is to connect four same-colored disks in a row, a
 * column, or a diagonal before your opponent can do likewise. The program prompts
 * two players to drop a red or yellow disk alternately. In the preceding figure, the
 * red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 * is dropped, the program redisplays the board on the console and determines the
 * status of the game (win, draw, or continue). Here is a sample run:
 *
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *
 *                  Drop a red disk at column (0–6): 0
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  |R| | | | | | |
 *
 *                  Drop a yellow disk at column (0–6): 3
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  |R| | |Y| | | |
 *
 *                  . . .
 *                  . . .
 *                  . . .
 *
 *                  Drop a yellow disk at column (0–6): 6
 *                  | | | | | | | |
 *                  | | | | | | | |
 *                  | | | |R| | | |
 *                  | | | |Y|R|Y| |
 *                  | | |R|Y|Y|Y|Y|
 *                  |R|Y|R|Y|R|R|R|
 *
 *                  The yellow player won
 * @author DejanD
 */
public class Exercise_08_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //initialize table
        char[][] table = new char[6][7];
        for (int i = 0; i < table.length; i++){
            Arrays.fill(table[i], ' ');
        }
        char player = 'R';
       
        do {
            displayTable(table);
            if (player == 'R') System.out.print("Drop a red disk at column (0–6): ");
            else System.out.print("Drop a yellow disk at column (0–6): ");
            int row = in.nextInt();
            
            if (makeMove(table,row,player)) player = (player == 'R') ? 'L':'R';
            
        }while (checkWin(table));
       
        displayTable(table);
        if (player == 'L') System.out.print("The red player won");
            else System.out.print("The yellow player won");
       
    }
    
    public static void displayTable(char[][] table){
        for (int i = table.length-1; i >=0; i--){
            for (int j = 0; j < table[i].length; j++)
                System.out.print("|" + table[i][j]);
            System.out.print("|\n");
        }
        System.out.println("---------------");
        
    }
    public static boolean makeMove(char[][] table, int row, char player){
        boolean rowTaken = false;
        for (int i = 0; i < table.length; i++){
            if (table[i][row] == ' '){
                table[i][row] = player;
                rowTaken = true;
                break;
            }
        }
        if (!rowTaken) System.out.println("The row: " + row + "is already taken");
        return rowTaken;
    }
    
    public static boolean checkWin(char[][] table){
        
        //check horizontal
        for (int i = 0; i < table.length; i++)
            if (hasConsecutiveFours(table[i])) return false;
        
        //check vertical
        for (int i = 0; i < table.length; i++){
            char[] row = new char[table.length];
            for (int j= 0; j < table.length; j++){
                row[j] = table[j][i];
            }
           if (hasConsecutiveFours(row)) return false; 
        }
        //check major diagonal
        for (int i = table.length-1; i >=0; i--){
            char[] row = new char[table.length-i];
            for (int j =0; j <table.length-i; j++){
                row[j]= table[i+j][j];
                
            }
            if (hasConsecutiveFours(row)) return false;
        }
        for (int i = 1; i <table.length; i++){
            char[] row = new char[table[i].length-i];
            for (int j =0; j <table[i].length-i; j++){
                row[j]= table[j][j+i];
                
            }
            if (hasConsecutiveFours(row)) return false;
        }
        
        
         //check minor diagonal
        char[] row = new char[4];
        for (int i = 0; i < table.length-3; i++){
            for (int j = table[i].length-1; j >2; j--){
                row[0] = table[i][j];
                row[1] = table[i+1][j-1];
                row[2] = table[i+2][j-2];
                row[3] = table[i+3][j-3];
            if (hasConsecutiveFours(row)) return false;    
            }
        }
        
        return true;
    }
    
    public static boolean hasConsecutiveFours(char[] values){
        
        for (int i =0; i < values.length-3; i++){
                if (values[i] == values[i+1] && values[i] == values[i+2] &&
                       values[i] == values[i+3] && values[i] != ' ') return true;
        }
        return false;
    }
}



