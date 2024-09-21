
package Exercise_08_14;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Explore matrix) Write a program that prompts the user to enter the length of a
 * square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 * finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
 * the program:
 *
 *      Enter the size for the matrix: 4
 *      0111
 *      0000
 *      0100
 *      1111
 *      All 0s on row 2
 *      All 1s on row 4
 *      No same numbers on a column
 *      No same numbers on the major diagonal
 *      No same numbers on the sub−diagonal
 * @author DEJAN
 */
public class Exercise_08_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the size for the matrix: ");
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j]= (int) (Math.random() * 2.0);
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println("");
        }
        
        //Check rows
        boolean rowsCheck = true; 
        for (int i = 0; i < matrix.length; i++){
            int sumOfRow = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sumOfRow += matrix[i][j];
            }
            if (sumOfRow == 0) {
                System.out.println("All 0's in row " + i);
                rowsCheck = false;
            }
            else if (sumOfRow == size){
                System.out.println("All 1's in row " + i);
                rowsCheck = false; 
            }
        }
        if (rowsCheck) System.out.println("No same numbers in a row");
        
        //Column check
        boolean columnCheck = true; 
        for (int i = 0; i < matrix.length; i++){
            int sumOfColumn = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sumOfColumn += matrix[j][i];
            }
            if (sumOfColumn == 0) {
                System.out.println("All 0's in column " + i);
                columnCheck = false;
            }
            else if (sumOfColumn == size){
                System.out.println("All 1's in column " + i);
                columnCheck = false; 
            }
        }
        
        if (columnCheck) System.out.println("No same numbers in a column"); 
        
        //Check main and sub diagonal
        int sumOfMajorDiagonal = 0;
        int sumOfSubDiagonal = 0;
        for (int i = 0; i < matrix.length; i++){
            sumOfMajorDiagonal += matrix[i][i];
            sumOfSubDiagonal += matrix[i][size-i-1];
        }
        if (sumOfMajorDiagonal == size) System.out.println("All 1's on major diagonal");
        else if (sumOfMajorDiagonal == 0) System.out.println("All 0's on major diagonal");
        else System.out.println("No same numbers on major diagonal");
        if (sumOfSubDiagonal == size) System.out.println("All 1's on sub diagonal");
        else if (sumOfSubDiagonal == 0) System.out.println("All 0's on sub diagonal");
        else System.out.println("No same numbers on sub diagonal");
        
     
        
                
    }
}
