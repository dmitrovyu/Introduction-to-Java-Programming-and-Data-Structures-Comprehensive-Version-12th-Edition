
package Exercise_10_19;

import java.math.BigInteger;

/**
 *
 *(Mersenne prime) A prime number is called a Mersenne prime if it can be        *
* written in the form 2p - 1 for some positive integer p. Write a program that   *
* finds all Mersenne primes with p … 100 and displays the output as shown below. *
* (Hint: You have to use BigInteger to store the number, because it is too big   *
* to be stored in long. Your program may take several hours to run.) 
* 
 * @author DejanD
 */
public class Exercise_10_19 {
    public static void main(String[] args) {
        System.out.println("p       2^p - 1");
        for (int p = 1; p <=100; p++ ){
        BigInteger bigNum = BigInteger.TWO;
        bigNum = bigNum.pow(p).subtract(BigInteger.ONE);
            
         if (isPrime(bigNum)){
             System.out.printf("%-3d", p);
             System.out.println("\t" + bigNum);
         }
        }
    }
    
    //Check if number is prime
    public static boolean isPrime(BigInteger bigNum){
        if (bigNum.compareTo(BigInteger.ONE) == 0 
                || bigNum.compareTo(BigInteger.TWO) == 0) return true;
        BigInteger half = bigNum.divide(BigInteger.TWO);
        for (BigInteger d = BigInteger.TWO; d.compareTo(half) <=0; d = d.add(BigInteger.ONE)){
            if (bigNum.remainder(d).equals(BigInteger.ZERO)){
                return false;
            }   
        }
        return true;
    }
}
