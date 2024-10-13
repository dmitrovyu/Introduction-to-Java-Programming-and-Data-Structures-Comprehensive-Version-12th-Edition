
package Exercise_10_17;

import java.math.BigInteger;

/**
 *(Square numbers) Find the first 10 square numbers that are greater than Long.
 * MAX_VALUE. A square number is a number in the form of n2. For example, 4, 9, 
 * and 16 are square numbers. Find an efficient approach to run your program fast.
 * @author DejanD
 */
public class Exercise_10_17 {
    public static void main(String[] args) {
        String bigIntNum = "" + Long.MAX_VALUE;
        BigInteger bigInt = new BigInteger(bigIntNum);
        bigInt = bigInt.add(BigInteger.ONE);
        BigInteger squareNum = bigInt.sqrt().add(BigInteger.ONE);
        for (int i =0; i < 10; i++){
            bigInt = squareNum.pow(2);
            System.out.println(bigInt);
            squareNum = squareNum.add(BigInteger.ONE);
        }
        
        
    }
}
