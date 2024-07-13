
package Exercise_04_16;

import java.util.Locale;

/**
 * 4.16 (Random character) Write a program that displays a random uppercase letter using
 * the Math.random() method.
 *
 * @author DejanD
 * */
public class Exercise_04_16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int code = (int)(Math.random()*26) + 65;
        
        System.out.println("Random character: " + (char)code);
    }
}
