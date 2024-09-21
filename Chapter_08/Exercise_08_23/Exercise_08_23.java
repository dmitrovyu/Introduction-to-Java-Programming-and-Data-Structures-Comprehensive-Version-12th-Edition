
package Exercise_08_23;

import java.util.Scanner;

/**
 * (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 * 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 * one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 * cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 * with 0s and 1s and find the first row r and first column c where the even number
 * of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 * is at (r, c). Here is a sample run:
 *
 *          Enter a 6−by−6 matrix row by row:
 *          1 1 1 0 1 1
 *          1 1 1 1 0 0
 *          0 1 0 1 1 1
 *          1 1 1 1 1 1
 *          0 1 1 1 1 0
 *          1 0 0 0 0 1
 *          The flipped cell is at (0, 1)
 *
 * @author DejanD
 */
public class Exercise_08_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++)
            for(int j = 0; j < 6; j++)
                matrix[i][j] = in.nextInt();
        int[] coord = findFlipped(matrix);
        System.out.println("The flipped cell is at (" + coord[0] + ", " + coord[1] + ")");
    }
    public static int[] findFlipped(int[][] matrix){
        int[] coordinate = new int[2];

        //find horizontal && vertical
        for (int i = 0; i < 6; i++){
            int sumHorizontal = 0;
            int sumVertical = 0;
            for (int j= 0; j < 6; j++){
                sumHorizontal += matrix[i][j];
                sumVertical += matrix[j][i];
            }
            if (sumHorizontal % 2 != 0) coordinate[0] = i;
            if(sumVertical % 2 != 0) coordinate[1] = i;
        }
        return coordinate;
    }
}
