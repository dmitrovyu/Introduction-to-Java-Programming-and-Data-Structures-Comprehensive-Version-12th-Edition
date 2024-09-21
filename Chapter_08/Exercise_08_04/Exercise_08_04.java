
package Exercise_08_04;

import java.util.Arrays;

/**
 *
 *  (Compute the weekly hours for each employee) Suppose the weekly hours for all 
 * employees are stored in a two-dimensional array. Each row records an employee’s 
 * seven-day work hours with seven columns. For example, the following array 
 * stores the work hours for eight employees. Write a program that displays 
 * employees and their total hours in decreasing order of the total hours.
 * 
 * @author DEJAN
 */
public class Exercise_08_04 {
    public static void main(String[] args) {
        double[][] workHours = {
                                {2, 4, 3, 4, 5, 8, 8},
                                {7, 3, 4, 3, 3, 4, 4},
                                {3, 3, 4, 3, 3, 2, 2},
                                {9, 3, 4, 7, 3, 4, 1},
                                {3, 5, 4, 3, 6, 3, 8},
                                {3, 4, 4, 6, 3, 4, 4},
                                {3, 7, 4, 8, 3, 8, 4},
                                {6, 3, 5, 9, 2, 7, 9}};
        double[][] totalHours = new double[8][2];
        for (int i = 0; i < workHours.length; i++){
            for (double hour : workHours[i]){
                totalHours[i][0] = i;
                totalHours[i][1] += hour;
            }
            
        }
        bubbleSort(totalHours);
        for (int i =0; i < totalHours.length; i++)
            System.out.println("Employee " + (int)totalHours[i][0] + " total hours: " + totalHours[i][1]);

    }
    public static void bubbleSort(double[][] totalHours){
        double[] temp = new double[2];
        boolean isSorted;
        do {
            isSorted = true;
            for (int i= 0; i <totalHours.length-1; i ++){
                if (totalHours[i][1] < totalHours[i+1][1]){
                    temp = totalHours[i];
                    totalHours[i] = totalHours[i+1];
                    totalHours[i+1] = temp;
                    isSorted = false;
                }
            }
            
        }while(!isSorted);
    }
}
