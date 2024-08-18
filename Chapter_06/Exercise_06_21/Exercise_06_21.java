
package Exercise_06_21;

import java.util.Scanner;

/**
 *
 * (Phone keypads) The international standard letter/number mapping for tele
 * phones is given in Programming Exercise 4.15. Write a method that returns a 
 * number, given an uppercase letter, as follows:
 * public static int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string. 
 * The input number may contain letters. The program translates a letter (uppercase 
 * or lowercase) to a digit and leaves all other characters intact. Here are sample 
 * runs of the program:
 * Enter a string: 1-800-Flowers 
 * 1-800-3569377
 * Enter a string: 1800flowers 
 * 18003569377
 * @author DejanD
 */
public class Exercise_06_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String phoneNum = in.nextLine().toUpperCase();
        String outPhoneNum = "";
        for (int i = 0; i < phoneNum.length(); i++){
            if (Character.isLetter(phoneNum.charAt(i))){
                char out = (char) (getNumber(phoneNum.charAt(i))+ '0');
                outPhoneNum += out;
            }
            else
                outPhoneNum += phoneNum.charAt(i);
        }
        System.out.println(outPhoneNum);
        
    }
    public static int getNumber(char uppercaseLetter){
        int num = (int) uppercaseLetter;
        num = (num-59)/3;
        if (uppercaseLetter == 'S' || uppercaseLetter =='V' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z')
                num--;
      
      return num;  
    }
}
