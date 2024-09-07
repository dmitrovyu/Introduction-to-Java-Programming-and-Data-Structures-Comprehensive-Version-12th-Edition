
package Exercise_07_01;

import java.util.Scanner;

/**
 *
 * (Assign grades) Write a program that reads student scores, gets the best score, and
 * then assigns grades based on the following scheme:
 * Grade is A if score is >= best -10
 * Grade is B if score is >= best -20;
 * Grade is C if score is >= best -30;
 * Grade is D if score is >= best -40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, and then
 * prompts the user to enter all of the scores, and concludes by displaying the grades.
 * Here is a sample run:
 *
 *          Enter the number of students: 4
 *          Enter 4 scores: 40 55 70 58
 *          Student 0 score is 40 and grade is C
 *          Student 1 score is 55 and grade is B
 *          Student 2 score is 70 and grade is A
 *          Student 3 score is 58 and grade is B
 *
 * @author DEJAN
 */
public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number of students: ");
        int noOfStudents = in.nextInt();
        System.out.print("Enter " + noOfStudents + " scores");
        int[] scores = new int[noOfStudents];
        int max = 0;
        for (int i = 0; i < noOfStudents; i++){
            scores[i] = in.nextInt();
            if (scores[i] > max) max = scores[i];
        }
        getScores(max,scores);
    }
    public static void getScores(int max, int[] scores){
        for (int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " is " + scores[i] + " and grade is " + getGrade(max,scores[i]));
        }
    }
    public static char getGrade (int max, int score){
        int diff = score - max;
        if (diff >= -10) return 'A';
        else if (diff >= -20) return 'B';
        else if (diff >=-30) return 'C';
        else if (diff >= -40) return 'D';
        else return 'F';
    }
}
