
package Exercise_08_29;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * have the same contents. Write a method that returns true if m1 and m2 are identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 *  Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * and displays whether the two are identical. Here are the sample runs:
 *
 *          Enter list1: 51 25 22 6 1 4 24 54 6
 *          Enter list2: 51 22 25 6 1 4 24 54 6
 *          The two arrays are identical
 *
 *          Enter list1: 51 5 22 6 1 4 24 54 6
 *          Enter list2: 51 22 25 6 1 4 24 54 6
 *          The two arrays are not identical
 *
 * @author DejanD
 */
public class Exercise_08_29 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][]  list1 = getMatrix();
        System.out.print("Enter list2: ");
        int[][] list2 = getMatrix();
        
        System.out.println("The two arrays are " + ((equals(list1,list2)) ? "" : "not ") +
                "indentical");
        
    }
    public static int[][] getMatrix(){
        Scanner in = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++)
            for(int j = 0; j<3; j++)
                m[i][j] = in.nextInt();
        return m;
    }
    
    public static boolean equals(int[][] m1, int[][] m2){
        if (!equalLength(m1, m2)) return false;
        boolean [][] equals = new boolean[m1.length][m1[0].length];
        for (int i = 0; i<m2.length; i++)
            for (int j =0; j < m2[i].length; j++)
                if (!equalElement(m1[i][j], m2, equals)) return false;         
        return true;
    }
    
    public static boolean equalLength(int[][] m1, int[][] m2){
        if (m1.length != m2.length) return false;
        for (int i = 0; i < m1.length; i++)
            if (m1[i].length != m2[i].length) return false;
        return true;
    }
    
    public static boolean equalElement(int elem, int[][] m2, boolean[][] equals){
        for (int i =0; i < m2.length; i++)
            for (int j =0; j< m2[i].length; j++)
                if (m2[i][j] == elem && equals[i][j] == false){
                    equals[i][j] = true;
                    return true;
                }
        return false;
    }
    
    
    
}
