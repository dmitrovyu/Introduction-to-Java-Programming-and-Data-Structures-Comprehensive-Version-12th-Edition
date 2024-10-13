
package Exercise_10_25;

import java.util.Arrays;

/**
 *(New string split method) The split method in the String class returns an 
 * array of strings consisting of the substrings split by the delimiters. However, the 
 * delimiters are not returned. Implement the following new method that returns 
 * an array of strings consisting of the substrings split by the matching delimiters, 
 * including the matching delimiters.
 *      public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #,  and 453 in 
 * an array of String and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, gf, 
 * #, and e in an array of String.
 * 
 * @author DejanD
 */
public class Exercise_10_25 {
    public static void main(String[] args) {
        /* [ab, #, 12, #, 453] */
        
        System.out.println(Arrays.toString(split("ab#12#453", "#")));

        /* [a, ?, b, ?, gf, #, e] */
        System.out.println(Arrays.toString(split("a?b?gf#e", "[?#]")));

        /* [s, !, h, @, a, #, r, $, a, %, f, ^, q, &, e, (, s, ), h, ~, t, /, a] */
        System.out.println(Arrays.toString(split("s!h@a#r$a%f^q&e(s)h~t/a",
                "[!@#$%^&()~/]")));
    }
     public static String[] split(String s, String regex){
         String[] result = new String[s.length()]; // maximum number of elements
         int noOfElements = 0;
         String element = "";
         for (int i = 0; i < s.length(); i++){
             if (isRegex(s.charAt(i), regex)){
                 result[noOfElements] = element;
                 noOfElements++;
                 element = s.charAt(i) + "";
                 result[noOfElements] = element;
                 noOfElements++;
                 element ="";
             }
             else {
                 element += s.charAt(i);
             }
         }
         String[] trimmed = Arrays.copyOf(result, noOfElements);
         return trimmed;
     }
     public static boolean isRegex(char r, String regex){
        if (r =='[' || r==']') return false;
        return regex.indexOf(r) >= 0;
     }
    
        
}
    

