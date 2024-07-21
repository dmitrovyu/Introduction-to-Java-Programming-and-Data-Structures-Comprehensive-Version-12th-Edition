package Exercise_05_23;

/**
 *
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0 +
 * 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 * more accurate results, carefully select the order of computation. For ex
 * ample, in computing the following summation, you will obtain more accurate
 * results by computing from right to left rather than from left to right:
 *
 * 1+ 1/2 + 1/3 + ... + 1/n
 *
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000
 *
 * @author DEJAN
 */
public class Exercise_05_23 {

    public static void main(String[] args) {
        double sumFromLeft = 0, sumFromRight = 0;
        for (double i = 1; i < 50000; i++) {
            sumFromLeft += 1 / i;
            sumFromRight += 1 / (50000 - i);
        }
        System.out.println("Sum from left is: " + sumFromLeft);
        System.out.println("Sum from right is: " + sumFromRight);
        System.out.println("Difference: " + (sumFromLeft - sumFromRight));
        
       
    }
}
