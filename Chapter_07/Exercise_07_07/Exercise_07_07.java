
package Exercise_07_07;

/**
 *(Count single digits) Write a program that generates 100 random integers 
 * between 0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers, 
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * @author DejanD
 */
public class Exercise_07_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++){
            int random = (int) (Math.random()*10);
            counts[random]++; 
        }
       for (int i = 0; i < 10; i++){
           System.out.println(i + " counts: " + counts[i]);
       }
    }
}
