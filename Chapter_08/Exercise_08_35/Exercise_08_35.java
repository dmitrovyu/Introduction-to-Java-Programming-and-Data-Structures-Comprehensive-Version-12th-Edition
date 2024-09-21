package Exercise_08_35;

import java.util.Scanner;

/**
 *
 * (Largest block) Given a square matrix with the elements 0 or 1, write a
 * program to find a maximum square submatrix whose elements are all 1s. Your
 * program should prompt the user to enter the number of rows in the matrix. The
 * program then displays the location of the first element in the maximum square
 * submatrix and the number of rows in the submatrix. Here is a sample run:
 *
 * Enter the number of rows in the matrix: 5 
 * Enter the matrix row by row: 
 * 1 0 1 0 1
 * 1 1 1 0 1
 * 1 0 1 1 1 
 * 1 0 1 1 1 
 * 1 0 1 1 1
 *
 * The maximum square submatrix is at (2, 2) with size 3
 *
 * Your program should implement and use the following method to find the
 * maximum square submatrix: public static int[] findLargestBlock(int[][] m) The
 * return value is an array that consists of three values. The first two values
 * are the row and column indices for the first element in the submatrix, and
 * the third value is the number of the rows in the submatrix.
 *
 * @author DejanD
 */
public class Exercise_08_35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int size = in.nextInt();
        System.out.println("Enter the matrix row by row:");
        int[][] m = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = in.nextInt();
            }
        }

        int[] answer = findLargestBlock(m);
        System.out.println("The maximum square submatrix is at (" + answer[0] + ", "
                + answer[1] + ")" + " with size " + answer[2]);
    }

    //Get sub-matrix size for element on coordinate x,y
    public static int getSubMatrixSize(int x, int y, int[][] matrix) {
        if (matrix[x][y] != 1) {
            return 0;
        } else if (x == matrix.length - 1 || y == matrix.length - 1) {
            return 1;
        }
        int size = 1;
        for (int i = 1; i < matrix.length - x && i < matrix.length - y; i++) {
            size = i;
            if (!checkSub(i, x, y, matrix)) {
                size--;
                break;
            }
        }

        return size + 1;

    }

    private static boolean checkSub(int size, int x, int y, int[][] m) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (m[x + i][y + j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] findLargestBlock(int[][] m) {
        int coordX = 0;
        int coordY = 0;
        int subMatrixSizeMax = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int subMatrixSize = getSubMatrixSize(i, j, m);
                System.out.println("i: " + i + " j: " + j + " SubMatrixSize: " + subMatrixSize);
                if (subMatrixSize > subMatrixSizeMax) {
                    subMatrixSizeMax = subMatrixSize;
                    coordX = i;
                    coordY = j;
                }
            }
        }
        int[] answer = {coordX, coordY, subMatrixSizeMax};
        return answer;
    }
}
