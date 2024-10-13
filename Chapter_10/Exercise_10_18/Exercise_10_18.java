
package Exercise_10_18;

import java.math.BigInteger;

/**
 *(Large prime numbers) Write a program that finds five prime numbers larger 
 * than Long.MAX_VALUE.
 * @author DejanD
 */
public class Exercise_10_18 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //BigNumber representing Long_MAX
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        bigNum = bigNum.add(BigInteger.ONE);
        int count = 0;
        while (count < 5){
            if(isPrime(bigNum)){
                System.out.println("***************" + bigNum  +"********************");
                count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);
            
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime-startTime));
        
    }
    public static boolean isPrime(BigInteger bigNum){
        if (bigNum.compareTo(BigInteger.ONE) == 0 
                || bigNum.compareTo(BigInteger.TWO) == 0) return true;
        BigInteger half = bigNum.divide(BigInteger.TWO);
        for (BigInteger d = BigInteger.TWO; d.compareTo(half) <=0; d = d.add(BigInteger.ONE)){
            if (bigNum.remainder(d).equals(BigInteger.ZERO)){
                System.out.println(bigNum + " : " + d);
                return false;
            }
                
           
        }
        return true;
    }
}
