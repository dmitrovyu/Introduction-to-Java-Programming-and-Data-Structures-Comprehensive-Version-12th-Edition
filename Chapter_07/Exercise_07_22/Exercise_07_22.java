package Exercise_07_22;

/**
 * (Find the number of uppercase letters in a string) Write a program that 
 * passes a string to the command line and displays the number of uppercase letters in the string.
 * @author DEJAN
 */
public class Exercise_07_22 {
    public static void main(String[] args) {
        String input = args[0];
        int noOfUpperCaseLetters = 0;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) noOfUpperCaseLetters++;
        }
        System.out.println("Number of upper case letters is: " + noOfUpperCaseLetters);
    }
}
