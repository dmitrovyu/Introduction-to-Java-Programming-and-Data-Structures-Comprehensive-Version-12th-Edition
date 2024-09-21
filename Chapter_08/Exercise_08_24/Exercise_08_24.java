package Exercise_08_24;

import java.util.Scanner;

/**
 * (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by
 * checking whether every number is valid in the board. Rewrite the program by
 * checking whether every row, every column, and every small box has the numbers
 * 1 to 9.
 *
 * @author DejanD
 */
public class Exercise_08_24 {

    public static void main(String[] args) {
        int[][] grid = readSolution();
        System.out.println("");
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    public static int[][] readSolution() {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[9][9];
        System.out.println("Enter a Sudoku puzzle solution:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {

        // check if rows are valid
        for (int i = 0; i < 9; i++) {
            if (!isValid(grid[i])) {
                return false;
            }
        }

        //check if columns are valid
        for (int i = 0; i < 9; i++) {
            int[] column = new int[9];
            for (int j = 0; j < 9; j++) {
                column[j] = grid[j][i];
            }
            if (!isValid(column)) {
                return false;
            }
        }
        //check small squares 
        for (int m = 0; m < 7; m = m + 3) {
            for (int k = 0; k < 7; k = k + 3) {
                int[] square = new int[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        square[i * 3 + j] = grid[i + m][j + k];
                    }
                }
                if (!isValid(square)) {
                    return false;
                }
            }
        }
        return true;
    }

    //checking if an array is valid
    public static boolean isValid(int[] row) {
        boolean[] status = new boolean[9];
        for (int i = 0; i < row.length; i++) {
            status[row[i] - 1] = true;
        }
        boolean retValue = true;
        for (boolean stat : status) {
            retValue = retValue && stat;
        }
        return retValue;
    }

}
