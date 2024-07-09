
package Exercise_03_15;

import java.util.Scanner;

/**
 * **3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit
 * number. The program prompts the user to enter a three-digit number and determines
 * whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 * is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award
 * is $1,000
 *
 * @author DejanD
 * */
public class Exercise_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lottaryNum = 100 + (int) (Math.random() * ((999 - 100) + 1));
        
        System.out.print("Enter yous guess 3-digit number: ");
        int guess = input.nextInt();
        
        System.out.println("Lottary number is: " + lottaryNum);
        
        //calculate digits for guess number
        int guess3 = guess % 10;
        int guess2 = (guess / 10) % 10;
        int guess1 = (guess / 100) % 10;
        
        //calculate digits for lottary number
        int lott3 = lottaryNum % 10;
        int lott2 = (lottaryNum / 10) % 10;
        int lott1 = (lottaryNum /100) % 10;
      
        if (lottaryNum == guess) System.out.println("You guessed all three number your prize is: 10.000$");
        else if (((guess3 == lott3) || (guess3 == lott2) || (guess3 == lott1)) &&
                 ((guess2 == lott3) || (guess2 == lott2) || (guess2 == lott1)) &&
                 ((guess1 == lott3) || (guess1 == lott2) || (guess1 == lott1))){
            System.out.println("All digitis match lottary number, your prize is: 3.000$");
        }
        // logic explained
        // true xor ( false xor false) = true
        // false xor ( true xor false) = true
        // false xor ( false xor true) = true
        else if ((((guess3 == lott3) || (guess3 == lott2) || (guess3 == lott1)) ^
                 (((guess2 == lott3) || (guess2 == lott2) || (guess2 == lott1)) ^
                 ((guess1 == lott3) || (guess1 == lott2) || (guess1 == lott1))))){
            System.out.println("Match one digit: you win $1,000");
        }
        else System.out.println("Sorry, no match");
               
    }
    
}
