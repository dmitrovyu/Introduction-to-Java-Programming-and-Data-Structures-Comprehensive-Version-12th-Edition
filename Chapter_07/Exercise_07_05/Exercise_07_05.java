
package Exercise_07_05;

import java.util.Scanner;

/**
 *
 * (Print distinct numbers) Write a program that reads in 10 numbers and displays the 
 * number of distinct numbers and the distinct numbers in their input order and 
 * separated by exactly one space (i.e., if a number appears multiple times, it is displayed 
 * only once). (Hint: Read a number and store it to an array if it is new. If the number is 
 * already in the array, ignore it.) After the input, the array contains the distinct numbers. 
 * Here is the sample run of the program:
 * 
 *          Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
 *          The number of distinct numbers is 6
 *          The distinct numbers are: 1 2 3 6 4 5
 * 
 * @author DejanD
 */
public class Exercise_07_05 {
    public static void main(String[] args) {
        int[] distinct = new int[10];
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();
            if (!contains(n, distinct)){
                distinct[count] = n;
                count++;
            } 
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are:  ");
        for (int i = 0; i < count; i++){
            System.out.print(distinct[i] + " ");
        }
        
    }
    public static boolean contains (int n, int[] a){
        for (int i = 0; i <a.length; i++){
            if (n == a[i]) return true;
        }
        return false;
    }
}
