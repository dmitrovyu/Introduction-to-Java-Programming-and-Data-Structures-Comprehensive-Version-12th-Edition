
package Exercise_05_15;

import java.util.Locale;

/**
 *
 * (Display the ASCII character table) Write a program that prints the characters in 
 * the ASCII character table from ! to ~. Display 10 characters per line. The ASCII 
 * table is given in Appendix B. Characters are separated by exactly one space.
 * @author DEJAND
 */
public class Exercise_05_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        for (int i = 33; i < 127; i ++){
            System.out.print(((char) i)+ " " );
            if (i % 10 == 2) System.out.println("\n");
        }
    }
}
