
package Exercise_03_10;

import java.util.Scanner;

/**
 * 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a 
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100
 * @author DejanD
 * */
public class Exercise_03_10 {
    public static void main(String[] args) {
        int firstNum = (int)(Math.random()*((99-1)+1)+1);
        int secondNum = (int)(Math.random()*((99-1)+1)+1);
        
        //Prompt the student to answer "What is number1 + number2?"
        System.out.print("What is " + firstNum + " + " + secondNum + "? ");
        
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        if (answer == firstNum + secondNum) System.out.println("Your answer is correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(firstNum + " + " + secondNum + " should be " + (firstNum+secondNum));
        }
    }
    
    
}
