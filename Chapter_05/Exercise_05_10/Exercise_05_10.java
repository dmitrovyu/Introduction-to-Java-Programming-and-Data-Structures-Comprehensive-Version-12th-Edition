
package Exercise_05_10;

/**
 * 5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are separated
 * by exactly one space.
 *
 * @author DejanD
 * */
public class Exercise_05_10 {
    public static void main(String[] args) {
        int no = 0;
        String line = "";
        for (int i =100; i <=1000; i++){  
            if (i % 5 == 0 && i % 6 == 0){
               line += i + " ";
               no++;
            }
            if (no == 10) {
                System.out.println(line);
                no=0;
                line = "";
            }
        }
    }
}
