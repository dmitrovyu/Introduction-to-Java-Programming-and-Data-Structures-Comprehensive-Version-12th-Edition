
package Exercise_08_13;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Locate the largest element) Write the following method that returns the location
 * of the largest element in a two-dimensional array.
 *  public static int[] locateLargest(double[][] a)
 *  The return value is a one-dimensional array that contains two elements. These
 * two elements indicate the row and column indices of the largest element in the
 * two-dimensional array. Write a test program that prompts the user to enter a two
 * dimensional array and displays the location of the largest element in the array.
 * Here is a sample run:
 *
 *      Enter the number of rows and columns of the array: 3 4
 *      Enter the array:
 *      23.5 35 2 10
 *      4.5 3 45 3.5
 *      35 44 5.5 9.6
 *      The location of the smallest element is at (1, 2)
 *
 * @author DEJAN
 */
public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        
        double[][] array = new double[rows][columns];
        
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] = in.nextDouble();
            }      
        } 
        int[] largest = locateLargest(array);
        System.out.println("The location of the largest element is at (" + largest[0] + ", " + 
                largest[1] + ")");
    }
    public static int[] locateLargest(double[][] a){
        int x = 0;
        int y = 0;
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if (a[i][j] > largest) {
                    x=i;
                    y=j;
                    largest = a[i][j];
                }
            } 
        }
        int[] coord = {x,y};
        return coord;
    }
}


