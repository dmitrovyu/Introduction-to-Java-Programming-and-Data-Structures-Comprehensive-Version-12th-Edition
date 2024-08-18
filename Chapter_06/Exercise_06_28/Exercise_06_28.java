
package Exercise_06_28;

/**
 * **6.28 (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2 p - 1 for some positive integer p. Write a program that finds all
 * Mersenne primes with p less than 31 and displays the output as follows:
 *
 * p    2^p – 1
 * 2    3
 * 3    7
 * 5    31
 * ...
 * 19	524287
 * 31	2147483647
 * 
 * @author DejanD
 */
public class Exercise_06_28 {
    public static void main(String[] args) {
        System.out.println("p\t2^p – 1");
        System.out.println("------------------");
        for (int p = 2; p <= 31; p++){
            if (isPrime((long)Math.pow(2, p)-1)) 
                System.out.println(p+ "\t" + (long)(Math.pow(2, p)-1));
        }
        
    }
    public static boolean isPrime(long n){
        for (long i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
