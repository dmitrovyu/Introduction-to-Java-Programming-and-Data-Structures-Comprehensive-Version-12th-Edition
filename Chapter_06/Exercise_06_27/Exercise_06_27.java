
package Exercise_06_27;

/**
 *
 * (Emirp) An emirp (prime spelled backward) is a non-palindromic prime number 
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, 
 * so 17 and 71 are emirps. Write a program that displays the first 100 emirps. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 13 17 31 37 71 73 79 97 107 113
 * 149 157 167 179 199 311 337 347 359 389
 * 
 * @author DejanD
 */
public class Exercise_06_27 {
    public static void main(String[] args) {
        int noOfEmirp = 0;
        int n = 10;
        while (noOfEmirp < 101) {
            if (isPrime(n) && isPrime(palindrome(n)) && n != palindrome(n)) {
                noOfEmirp ++;
                System.out.print(n + " ");
                if (noOfEmirp % 10 == 0) System.out.println("");
            }
            n++;
        }
        
    }
    public static int palindrome(int n){
        String nStr = "" + n;
        String outStr = "";
        for (int i = nStr.length()-1; i >=0; i--){
            outStr += nStr.charAt(i);
        }
        return Integer.parseInt(outStr);
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
