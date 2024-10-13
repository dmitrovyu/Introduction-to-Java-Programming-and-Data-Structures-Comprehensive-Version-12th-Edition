
package Exercise_10_20;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *(Approximate e) Programming Exercise 5.26 approximates e using the  following series:
 * e=1+ 1/1! + 1/2! + 1/3! + 1/4! +g+ 1/i!
 * 
 * In order to get better precision, use BigDecimal with 25 digits of precision 
 * in the computation. Write a program that displays the e value for i = 100, 
 * 200, . . . , and 1000.
 * 
 * @author DejanD
 */
public class Exercise_10_20 {
    public static void main(String[] args) {
        
        BigDecimal e = new BigDecimal(1.0,new MathContext(25));
        BigDecimal item = new BigDecimal(1.0,new MathContext(25));
        for (int i = 1; i <=1000; i++){
            item = item.divide(new BigDecimal(i), new MathContext(25,RoundingMode.UP));
            e = e.add(item);
            if (i % 100 == 0)
                System.out.println("For i: " + i + " e = " + e);
        }
    }
}

