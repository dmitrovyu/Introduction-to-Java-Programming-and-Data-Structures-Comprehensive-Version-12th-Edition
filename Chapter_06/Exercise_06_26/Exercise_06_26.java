
package Exercise_06_26;

/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic. 
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 757. 
 * Write a program that displays the first 100 palindromic prime numbers. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 * 
 * @author DejanD
 */
public class Exercise_06_26 {
    public static void main(String[] args) {
        int numOfPalindromePrimes = 0;
        int n = 2;
        while (numOfPalindromePrimes < 100) {
            if (isPrime(n) && isPalindrome(n)){
                System.out.print(n+ " ");
                numOfPalindromePrimes++;
                if (numOfPalindromePrimes % 10 == 0) System.out.println("");  
            }
            n++;
        }
        
    }
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        String num = n + "";
        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) != num.charAt(num.length()-i-1))return false;
        }
        return true;
    }
}
