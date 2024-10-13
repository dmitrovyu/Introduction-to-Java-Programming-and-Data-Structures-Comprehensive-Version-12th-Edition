
package Exercise_10_16;

import java.math.BigInteger;

/**
 *(Divisible by 2 or 3) Find the first 10 numbers with 50 decimal digits that are 
 * divisible by 2 or 3.
 * 
 * @author DejanD
 */
public class Exercise_10_16 {
    public static void main(String[] args) {
      String bigInt = "1";
        for (int i = 0; i < 49; i++)
            bigInt = bigInt + "0";
        BigInteger bigIntNum = new BigInteger(bigInt);
        int count = 0;
        while(count < 10){
           if (bigIntNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                bigIntNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(bigIntNum);
                count++;
            }
            bigIntNum = bigIntNum.add(BigInteger.ONE);
           
        }
    }
}

