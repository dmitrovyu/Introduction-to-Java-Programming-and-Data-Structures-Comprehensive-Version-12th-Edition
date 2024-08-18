
package Exercise_06_10;

/**
 *
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the 
 * isPrime(int number) method for testing whether a number is prime. Use 
 * this method to find the number of prime numbers less than 10000
 * 
 * @author DejanD
 */
public class Exercise_06_10 {
    public static void main(String[] args) {
        int noOfPrimes=0;
        for (int i =1; i < 10000; i++){
            if (isPrime(i)) noOfPrimes++;
        }
        System.out.println("Number of primes less than 10.000 is " + noOfPrimes);
        
    }
    
      /** Check whether number is prime */
    public static boolean isPrime(int number)
    {
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0) // If true, number is not prime
                return false; // Number is not a prime
        }
        return true;
    }
    
}
