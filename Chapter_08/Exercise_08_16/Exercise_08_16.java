
package Exercise_08_16;

import java.util.Arrays;

/**
 *
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header:
 *          public static void sort(int m[][])
 * The method performs a primary sort on rows, and a secondary sort on columns.
 * For example, the following array
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 *  will be sorted to
 * {{4, 5},{4, 2},{4, 1},{1, 7},{1, 2},{1, 1}}.
 * 
 * @author DejanD
 */
public class Exercise_08_16 {
    public static void main(String[] args) {
        int[][] m =  {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        
        for (int i = 0; i < m.length; i++){
            System.out.println(Arrays.toString(m[i]));
        }
        sort(m);
        System.out.println("Sorted array:");
        for (int i = 0; i < m.length; i++){
            System.out.println(Arrays.toString(m[i]));
        }
    }
    
    //Sorting two-dimensional array using a bubble sort
    public static void sort(int[][] m){
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i =0; i < m.length -1; i++){
                //Check if first array is larger or if equal check if second number is larger
                // if conditions met swap arrays.
                if ((m[i][0] > m[i+1][0]) ||
                        ((m[i][0] == m[i+1][0]) && (m[i][1]>m[i+1][1]) )){
                    int[] temp = m[i];
                    m[i] = m[i+1];
                    m[i+1] = temp;
                    sorted = false;
                }
                
            }
        }
        
    }
}
