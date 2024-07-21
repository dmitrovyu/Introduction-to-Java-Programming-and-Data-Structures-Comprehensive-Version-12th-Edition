
package Exercise_05_26;

/**
 *
 * (Compute e) You can approximate e using the following summation:
 *  e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 *  Write a program that displays the e value for i = 10000, 20000, …, and 100000.
 * (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
 *      1/i! = 1/i(i-1)!
 * Initialize e and item to be 1, and keep adding a new item to e. The new item is
 * the previous item divided by i, for i >= 2.)
 * 
 * @author DEJAN
 */
public class Eercise_05_26 {
    public static void main(String[] args) {
        double e = 1.0, item=1.0;
        for (int i = 1; i <=20; i++){
            item = item/i;
            e+= item;
            System.out.printf("%s%.16f%s%d\n", "The e is ", e, " for i = ", i);
        }
    }
    
}
