package Exercise_05_33;

/**
 * (Perfect number) A positive integer is called a perfect number if it is equal
 * to the sum of all of its positive divisors, excluding itself. For example, 6
 * is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 +
 * 4 + 2 + 1. There are four perfect numbers less than 10,000. Write a program
 * to find all these four numbers.
 *
 * @author DEJAN
 */
public class Exercise_05_33 {

    public static void main(String[] args) {
        System.out.print("Perfect numbers less than 10000 are: ");
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            int temp = i;
            for (int j = 1; j < i; j++) {
                if (temp % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.print(i + ", ");
            }
        }
    }
}
