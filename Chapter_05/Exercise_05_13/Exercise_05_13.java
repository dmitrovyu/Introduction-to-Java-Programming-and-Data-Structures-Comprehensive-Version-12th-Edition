package Exercise_05_13;

/**
 *
 * (Find the largest n such that n3 less than  12,000) Use a while loop to find the
 * largest integer n such that n3 is less than 12,000.
 *
 * @author DEJAN
 */
public class Exercise_05_13 {

    public static void main(String[] args) {
        int n = 2;
        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        System.out.println("The largest integer n such that n3 is less than 12,000: " + (n-1));
    }
}
