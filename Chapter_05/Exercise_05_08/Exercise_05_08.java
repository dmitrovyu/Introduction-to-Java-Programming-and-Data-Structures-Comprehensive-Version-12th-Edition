package Exercise_05_08;

import java.util.Scanner;

/**
 * (Find the highest score) Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays
 * the name of the student with the highest score. Use the next() method in the
 * Scanner class to read a name, rather than using the nextLine() method. Assume
 * that the number of students is at least 1.
 *
 * @author DEJAN
 */
public class Exercise_05_08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no = in.nextInt();
        String resultName = "";
        int resultScore = 0;
        int i = 0;
        do {
            System.out.print("Enter the students name: ");
            String name = in.next();
            System.out.print("Enter the student score: ");
            int score = in.nextInt();
            if (score > resultScore) {
                resultScore = score;
                resultName = name;
            }
            i++;
        } while (i < no);
        System.out.println("The student with highest score: " + resultScore + " is " + resultName);
    }
}
