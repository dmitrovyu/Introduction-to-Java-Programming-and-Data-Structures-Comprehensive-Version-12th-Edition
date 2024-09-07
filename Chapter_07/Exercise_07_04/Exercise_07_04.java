
package Exercise_07_04;

import java.util.Scanner;

/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and 
 * determines how many scores are above or equal to the average, and how many scores
 * are below the average. Enter a negative number to signify the end of the input. 
 * Assume the maximum number of scores is 100.
 * @author DEJAN
 */
public class Exercise_07_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int count = -1;
        
        int[] scores = new int[100];
        do {
            System.out.print("Enter a new score: ");
            count++;
            scores[count] = in.nextInt();
            if (scores[count] > 0 ) sum += scores[count];
         
        } while (scores[count] > 0);
       
        int bellowAverage = 0;
        for (int i = 0; i < count; i++ ){
            if (scores[i] < sum/(count)) bellowAverage++;
        }
        System.out.println("Number of scores above or equal to the average: " + (count-bellowAverage));
        System.out.println("Number of scores bellow the average: " + bellowAverage);
        
        
    }
}
