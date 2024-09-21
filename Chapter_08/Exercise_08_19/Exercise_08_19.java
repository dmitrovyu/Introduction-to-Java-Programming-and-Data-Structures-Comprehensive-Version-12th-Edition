package Exercise_08_19;

import java.util.Scanner;

/**
 *
 * * **8.19 (Pattern recognition: four consecutive equal numbers) Write the
 * following method that tests whether a two-dimensional array has four
 * consecutive numbers of the same value, either horizontally, vertically, or
 * diagonally: 
 * public static boolean isConsecutiveFour(int[][] values)
 *
 * Write a test program that prompts the user to enter the number of rows and
 * columns of a two-dimensional array then the values in the array, and displays
 * true if the array contains four consecutive numbers with the same value.
 * Otherwise, the program displays false. Here are some examples of the true
 * cases:
 *
 * @author DejanD
 */
public class Exercise_08_19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int dim = in.nextInt();
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = (int) (Math.random() * 3);
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("Is there consecutive four: " + isConsecutiveFour(matrix));

    }

    public static boolean isConsecutiveFour(int[][] values) {

        for (int i = 0; i < values.length - 4; i++) {
            for (int j = 0; j < values[i].length - 4; j++) {
                //check rows
                if (values[i][j] == values[i][j + 1]
                        && values[i][j + 1] == values[i][j + 2]
                        && values[i][j + 2] == values[i][j + 3]) {
                    return true;
                }
                //check columns
                if (values[i][j] == values[i + 1][j]
                        && values[i + 1][j] == values[i + 2][j]
                        && values[i + 2][j] == values[i + 3][j]) {
                    return true;
                }
                //check major diagonal
                if (values[i][j] == values[i + 1][j + 1]
                        && values[i + 1][j + 1] == values[i + 2][j + 2]
                        && values[i + 2][j + 2] == values[i + 3][j + 3]) {

                    return true;
                }
            }
        }
        //Check sub diagonal
        for (int i = 0; i < values.length - 4; i++) {
            for (int j = 3; j < values[i].length; j++) {
                if (values[i][j] == values[i + 1][j - 1]
                        && values[i + 1][j - 1] == values[i + 2][j - 2]
                        && values[i + 2][j - 2] == values[i + 3][j - 3]) {

                    return true;
                }
            }
        }
        return false;
    }
}
