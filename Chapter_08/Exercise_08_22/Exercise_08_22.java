
package Exercise_08_22;

import java.util.Arrays;

/**
 *
 * Even number of 1s Write a program that generates a 6-by-6 two-dimensional 
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
 * every column have an even number of 1s.
 * 
 * @author DejanD
 */
public class Exercise_08_22 {
    public static void main(String[] args) {
        int[][] values = new int[6][6];
        for (int i= 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                values[i][j] = (int)(Math.random()*2);
        display(values);
        System.out.println("All rows and columns have evan number of 1's: " + check(values));
    }
    public static boolean check(int[][] values){
        for (int i = 0; i < values.length; i++){
            int sumOfRows = 0;
            int sumOfColumns = 0;
            for (int j = 0; j < values[i].length; j++){
                sumOfRows += values[i][j];
                sumOfColumns += values[j][i];
            }
            if ( sumOfRows % 2 != 0 || sumOfColumns % 2 != 0) return false;
        }
        return true;
    }
    public static void display(int[][] values){
        for (int i =0; i < values.length; i++){
            System.out.println(Arrays.toString(values[i]));
        }
        
    }
}
