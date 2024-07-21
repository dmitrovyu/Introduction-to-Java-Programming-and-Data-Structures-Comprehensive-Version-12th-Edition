
package Exercise_05_35;

/**
 *
 * *5.35 (Summation) Write a program to compute the following summation:
 *  1/(1 + √2) + 1/(√2 + √3) + 1/(√3 + √4) + ... + 1/(√999 + √1000)
 *
 * @author DejanD
 *  */

public class Exercise_05_35 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <625; i++){
            sum += 1.0/(Math.sqrt(i) + Math.sqrt(i+1));
        }
        System.out.println(sum);
    }
}
