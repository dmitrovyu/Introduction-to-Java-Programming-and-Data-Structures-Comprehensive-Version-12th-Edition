
package Exercise_07_36;

import java.util.Arrays;

/**
 *(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a 
 * chessboard such that no two queens can attack each other (i.e., no two queens are on 
 * the same row, same column, or same diagonal). There are many possible solutions. 
 * Write a program that displays one such solution. A sample output is shown below:
 * @author DEJAN
 */
public class Exercise_07_36 {
    public static void main(String[] args) {
        //Queen postions
        int[] queens = new int[8];
        Arrays.fill(queens, -1);
        queens[0] = 0;
        
        int k = 1;
        while (k >= 0 && k < 8) {
            //Find a place of the queen in the k-th row
            int j = findPosition(k, queens);
            if (j < 0) {
                queens[k] = -1;
                k--; //back track to previous row
            } else {
                queens[k] = j;
                k++;
            }
        }
        printResult(queens);    
    }
    public static int findPosition(int k, int[] queens){
        int start = queens[k] == -1 ? 0 : queens[k] + 1;
        for (int j = start; j < 8; j++) {
            if(isValid(k, j, queens))
                return j; //(k, j) is the valid place to put the queen
        }
        return - 1;
    }
    
    /** Return true if you a queen can be placed at (k, j) */
    public static boolean isValid(int k, int j, int[] queens){
        //check if (k,j) is a valid position
        //Check jth coloumn
        for (int i = 0; i < k; i++)
            if(queens[i] == j) return false;
        //Check major diagonal
        for (int row = k-1, column = j-1; row >=0 && column >=0; row--, column-- ){
            if(queens[row] == column) return false;
        }
        
        //Check minnor diagonal
        for(int row = k-1, column = j+1; row >=0 && column < 8; row--, column++){
            if (queens[row] == column) return false;
        }
        
        return true;
    }
    
    /** Print a two-dimensional board to display the queens */
  public static void printResult(int[] queens) {
  //  for (int i = 0; i < 8; i++)
  //    System.out.println(i + ", " + queens[i]);
  //  System.out.println();

    // Display the output
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < queens[i]; j++)
        System.out.print("| ");
      System.out.print("|Q|");
      for (int j = queens[i] + 1; j < 8; j++)
        System.out.print(" |");
      System.out.println();
    }
  }  
}
