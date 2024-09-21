
package Exercise_08_18;

import java.util.Arrays;

/**
 *(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int 
 * array using the following header:
 *          public static void shuffle(int[][] m)
 * Write a test program that shuffles the following matrix:
 *          int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 * 
 * @author DejanD
 */
public class Exercise_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Array before shuffling:");
        for (int i = 0; i < m.length; i++){
            System.out.print(Arrays.toString(m[i]) + ", ");
        }
        shuffle(m);
        System.out.println("\nArray after shuffling:");
        for (int i = 0; i < m.length; i++){
            System.out.print(Arrays.toString(m[i]) + ", ");
        }
            
    }
    public static void shuffle(int[][] m){
        for (int i = 0; i < m.length; i++){
            int j = (int)(Math.random()*m.length);
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }
}
