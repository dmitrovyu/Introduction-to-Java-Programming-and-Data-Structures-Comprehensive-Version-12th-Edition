package Exercise_06_14;

/**
 * (Estimate p) p can be computed using the following summation: m(i) = 4 * [1 -
 * 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + -1^(i+1) / (2i -1)
 *
 * Write a method that returns m(i) for a given i and write a test program that
 * displays the following table:
 *
 * I m(i) 1 4.0000 101 3.1515 201 3.1466 ............... 901 3.1427
 *
 * @author DEJAN
 */
public class Exercise_06_14 {

    public static void main(String[] args) {
        System.out.printf("%-8s%-20s\n", "i", "m(i)");
        for (int i = 1; i < 902; i = i + 100) {
            System.out.printf("%d\t%2.4f\n",i, 4*sumPi(i));    
        }

    }
    public static double sumPi(int i){
        if (i == 1) return 1.000;
        else return sumPi(i-1) + (Math.pow(-1, i+1))/(2*i-1);
    }
}
