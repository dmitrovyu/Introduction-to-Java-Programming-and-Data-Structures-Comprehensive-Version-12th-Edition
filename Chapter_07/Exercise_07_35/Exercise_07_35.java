
package Exercise_07_35;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Game: hangman) Write a hangman game that randomly generates a word and 
 * prompts the user to guess one letter at a time, as presented in the sample run. 
 * Each letter in the word is displayed as an asterisk. When the user makes a correct 
 * guess, the actual letter is then displayed. When the user finishes a word, display 
 * the number of misses and ask the user whether to continue to play with another 
 * word. Declare an array to store words, as follows:
 * // Add any words you wish in this array
 *      String[] words = {"write", "that",...};
 * 
 *  (Guess) Enter a letter in word ******* > p  
 * (Guess) Enter a letter in word p****** > r  
 * (Guess) Enter a letter in word pr**r** > p  
 * p is already in the word
 * (Guess) Enter a letter in word pr**r** > o  
 * (Guess) Enter a letter in word pro*r** > g  
 * (Guess) Enter a letter in word progr** > n  
 * n is not in the word
 * (Guess) Enter a letter in word progr** > m  
 * (Guess) Enter a letter in word progr*m > a  
 * The word is program. You missed 1 time
 * Do you want to guess another word? Enter y or n>
 * @author DEJAN
 */
public class Exercise_07_35 {
    static Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {
         String[] words = {"write", "that","program", "letter", "another", "word",
         "enter", "declare", "randomly", "generate", "present", "display"};
         
         boolean playGame = true;
         
         //Playing the game
         do {
            int index = (int)(Math.random()* words.length);
            int missed = playGame(words[index]);
            System.out.println("The word is " + words[index] + ". You missed " + missed + " times");
            System.out.print("Do you want to guess another word? Enter y or n> ");
            if ("n".equals(in.next())) playGame = false;
         }while (playGame);
    
    }
    public static int playGame(String word){
        char[] answer = word.toCharArray();
        char[] question = new char[word.length()];
        Arrays.fill(question, '*');
        int miss = 0;

        do {
            System.out.print("(Guess) Enter a letter in word " + new String(question) +  " > ");
            char letter  = in.next().charAt(0);
            if (new String(question).contains(letter+ "")){
                System.out.println("\t" + letter + " is already in the word");
                continue;
            }
            //check if word contains the char
            if (! word.contains(letter+ "")) {
                miss++;
                System.out.println("\t" + letter + " is not in the word");
            }
            else {
                for (int i = 0; i < word.length(); i++){
                    if (letter == word.charAt(i)) {
                        question[i] = letter;
              
                    }
                }
            }
            
        }while (!Arrays.equals(answer, question));
        return miss;      
    }
}
