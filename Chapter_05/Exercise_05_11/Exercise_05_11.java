
package Exercise_05_11;

/**
 *
 * 5.11 (Find numbers divisible by 3 or 4, but not both) Write a program that displays all
 * the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not both.
 * Numbers are separated by exactly one space.
 *
 * @author DejanD
 * */
 
public class Exercise_05_11 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 100; i <=200; i++)
            if (i%5 == 0 ^ i%6 == 0)
                System.out.print((count++ % 10 == 0) ? (i+"\n") : (i + " "));
    }
}
