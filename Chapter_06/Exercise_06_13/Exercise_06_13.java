package Exercise_06_13;

/**
 *
 * (Sum series) Write a method to compute the following summation: m(i)= 1/2 +
 * 2/3 +.... + i/(i +1)
 *
 * Write a test program that displays the following table: i m(i) 1 0.5000 2
 * 1.1667 3 1.9167 ......... 20 17.3546
 *
 * @author DEJAN
 */
public class Exercise_06_13 {

    public static void main(String[] args) {
        System.out.printf("%-8s%-20s\n", "i", "m(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d\t%2.4f\n", i, sum(i));
        }

    }

    public static double sum(int i) {
        if (i == 1) {
            return 0.5000;
        } else {
            return sum(i - 1) + (i + 0.0) / (i + 1);
        }
    }
}
