
package Exercise_06_12;

import java.util.Scanner;

/**
 *  
 *  (Display characters) Write a method that prints characters using the 
 * following header public static void printChars(char ch1, char ch2, int numberPerLine)
 * This method prints the characters between ch1 and ch2 with the specified 
 * numbers per line. Write a test program that prints 10 characters per line from 1 to Z. 
 * Characters are separated by exactly one space.
 * 
 * @author DEJAN
 */
public class Exercise_06_12 {
    public static void main(String[] args) {
      
        printChars('1', 'Z', 10);
    }
    
    public static void printChars (char ch1, char ch2, int numberPerLine){
        int coloumns = 0;
        for (char i = ch1; i <= ch2; i++){
            System.out.print((char) i + " ");
            coloumns ++;
            if (coloumns % numberPerLine == 0) System.out.println("");
        }
    }
    
}
