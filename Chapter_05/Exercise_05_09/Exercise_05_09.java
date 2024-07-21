
package Exercise_05_09;

import java.util.Scanner;

/**
 * *5.9 (Find the two lowest scores) Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the names of the
 * students with the lowest and second-lowest scores.
 *
 * @author DejanD
 * */
public class Exercise_05_09 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no = in.nextInt();
        String resultNameFirst = "";
        int resultScoreFirst = 0;
        String resultNameSec = "";
        int resultScoreSec = 0;
        int i = 0;
        do {
            System.out.print("Enter the students name: ");
            String name = in.next();
            System.out.print("Enter the student score: ");
            int score = in.nextInt();
            if (score > resultScoreFirst) {
                resultScoreSec = resultScoreFirst;
                resultNameSec = resultNameFirst;
                resultScoreFirst = score;
                resultNameFirst = name;
            }
            else if (score > resultScoreSec){
                resultScoreSec = score;
                resultNameSec = name;
            }
            i++;
        } while (i < no);
        System.out.println("The student with highest score: " + resultScoreFirst + " is " + resultNameFirst);
        System.out.println("The student with second highest score: " + resultScoreSec + " is " + resultNameSec);
    }  
}
    


