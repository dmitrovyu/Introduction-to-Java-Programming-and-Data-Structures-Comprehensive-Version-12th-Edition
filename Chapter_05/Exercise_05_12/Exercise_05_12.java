package Exercise_05_12;

/**
 *
 * (Find the smallest n such that n2 712,000) Use a while loop to find the
 * smallest integer n such that n2 is greater than 12,000.
 *
 * @author DEJAN
 */
public class Exercise_05_12 {

    public static void main(String[] args) {
        int n = 2;
        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println("Smallest interger n where n*n > 12000 is: " + n);
    }
}
