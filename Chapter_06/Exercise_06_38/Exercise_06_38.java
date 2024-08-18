
package Exercise_06_38;

/**
 *
 * (Generate random characters) Use the methods in RandomCharacter in 
 * Listing 6.10 to print 100 uppercase letters then 100 single digits, 
 * printing 50 per line.
 * 
 * @author DejanD
 */
public class Exercise_06_38 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.print(getRandomCharacter('A','Z')+ " ");
            if (i % 50 == 0) System.out.println("");
        }
        for (int i = 1; i < 101; i++) {
            System.out.print(getRandomCharacter('0','9')+ " ");
            if (i % 50 == 0) System.out.println("");
        }
    }
    
     /**
     * Generate a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2)
    {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

}
