
package Exercise_10_21;

import java.math.BigInteger;

/**
 *(Divisible by 5 or 6) Find the first 10 numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 * @author DejanD
 */
public class Exercise_10_21 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger(String.valueOf(Long.MAX_VALUE));
        x = x.add(BigInteger.ONE);
        int count = 0;
        while(count < 10){
            if ((x.remainder(new BigInteger(5+"")).compareTo(BigInteger.ZERO) == 0)
                    ||(x.remainder(new BigInteger(6+"")).compareTo(BigInteger.ZERO) == 0) ){
                count++;
                System.out.println(x);        
            }
            x = x.add(BigInteger.ONE);
        }
    }
    
}
