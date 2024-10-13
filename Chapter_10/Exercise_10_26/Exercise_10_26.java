
package Exercise_10_26;

/**
 *(Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as a 
 * string in which the operands and operator are separated by zero or more spaces. 
 * For example, 3+4 and 3 + 4 are acceptable expressions. Here is a  sample run:
 * 
 *          "4+5"
 *           4 + 5 = 9
 *
 *           "4 + 5"
 *           4 + 5 = 9
 *
 *           "4 +    5"
 *           4 + 5 = 9
 *
 *           "4 *  5"
 *           4 * 5 = 20
 *
 * 
 * @author DejanD
 */
public class Exercise_10_26 {
    public static void main(String[] args) {
        String[] compute = args[0].split("\s+");
        int result = 0;
        switch(compute[1]){
            case("+") -> result = Integer.parseInt(compute[0]) + Integer.parseInt(compute[2]);
            case("-") -> result = Integer.parseInt(compute[0]) - Integer.parseInt(compute[2]);
            case("*") -> result = Integer.parseInt(compute[0]) * Integer.parseInt(compute[2]);
            case("/") -> result = Integer.parseInt(compute[0]) / Integer.parseInt(compute[2]);
        }
        System.out.println(compute[0] + " " + compute[1] + " " + compute[2] + " = " + result);
        
        
    }
    
}
