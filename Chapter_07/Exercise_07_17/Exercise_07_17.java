
package Exercise_07_17;

import java.util.Scanner;

/**
 * (Sort students) Write a program that prompts the user to enter the number of students, 
 * the students’ names, and their scores and prints student names in decreasing 
 * order of their scores. Assume the name is a string without spaces, 
 * use the Scanner’s next() method to read a name
 * @author DEJAN
 */
public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int noOfStudents = in.nextInt();
        int[] scores = new int[noOfStudents];
        String[] names = new String[noOfStudents];
        for (int i = 0; i < noOfStudents; i++){
            System.out.println("Enter students name and his score: ");
            names[i] = in.next();
            scores[i] = in.nextInt();
        }
        System.out.println("Sorted list:");
        selectionSort(scores,names);
        for (int i = 0; i < scores.length; i++){
            System.out.println("Score: " + scores[i] + " Name: " + names[i]);
        }
    }
    
    //Sorting both arrays with bubble sort
    public static void bubbleSort(int[] scores, String[] names){
        for (int i= 0; i < scores.length; i++){
            for (int j = i+1; j < scores.length; j++){
                if (scores[i]< scores[j]){
                    int temp =scores[i];
                    String name = names[i];
                    scores[i] = scores[j];
                    names[i] = names[j];
                    scores[j] = temp;
                    names[j] = name;
              }
            }
        } 
    }
    //Sorting both arrays with selection sort
    public static void selectionSort(int[] scores, String[] names){
        for (int i = 0; i < scores.length; i++){
            int max = scores[i];
            int pos = i;
            for (int j = i+1; j < scores.length; j++){
                if (scores [j] > max ) {
                    pos = j;
                    max = scores[j];
                }
            }
            int temp1 = scores[i];
            String temp2 = names[i];
            scores[i] = scores[pos];
            names[i] = names[pos];
            scores[pos] = temp1;
            names[pos] = temp2;
         }
    }
}
