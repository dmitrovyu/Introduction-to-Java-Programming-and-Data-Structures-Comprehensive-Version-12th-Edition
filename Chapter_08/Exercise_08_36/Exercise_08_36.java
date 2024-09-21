
package Exercise_08_36;

import java.util.Arrays;
import java.util.Scanner;

/**
 **(Latin square) A Latin square is an n-by-n array
 * filled with n different Latin letters, each occurring exactly once in each row and once in each column.
 * Write a program that prompts the user to enter the number n and the array of characters,
 * as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 *
 *              Enter number n: 4
 *              Enter 4 rows of letters separated by spaces:
 *              A B C D
 *              B A D C
 *              C D B A
 *              D C A B
 *              The input array is a Latin square
 *
 *              Enter number n: 3
 *              Enter 3 rows of letters separated by spaces:
 *              A F D
 *              Wrong input: the letters must be from A to C
 *
 * @author DejanD
 */
public class Exercise_08_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = in.nextInt();
        char[] latin = new char[n];
        for (int i = 0; i < n; i++)
            latin[i] = (char) ('A'+i);
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char[][] latinTable = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j =0; j < n; j++)
                latinTable[i][j] = in.next().charAt(0);
        boolean checkInput = checkRows(latin, latinTable) && checkColumns(latin, latinTable);
        if (checkInput) System.out.println("The input array is a Latin square");
        else System.out.println("Wrong input: the letters must be from " + latin[0] + " to " + latin[n-1]);
    }
    
    public static boolean checkRows(char[] latin, char[][] t){
        boolean result = true;
        for (char[] row : t) 
            result &= compareArr(latin, row);
        return result;
    }
    public static boolean checkColumns(char[] latin, char[][] t){
        boolean result = true;
        for (int i = 0; i < t.length; i++){
            char[] column = new  char[t.length];
            for (int j = 0; j < t.length; j++){
                column[j] = t[i][j];
            }
            result &= compareArr(latin, column);
    
        }        
        return result;
    }
    
    public static boolean compareArr(char[] latin, char[] arr){
        boolean[] check = new boolean[latin.length];
        boolean result = true;
        for (int i = 0; i < latin.length; i++)
            if (Arrays.binarySearch(latin, arr[i])>=0 && !check[i]) check[i] = true;
        for (int j =0; j < check.length; j++)
            result &= check[j];
        return result;
    }
    
}
