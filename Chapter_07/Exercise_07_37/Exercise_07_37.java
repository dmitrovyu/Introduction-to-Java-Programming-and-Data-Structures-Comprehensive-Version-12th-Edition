
package Exercise_07_37;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * (Game: bean machine) The bean machine, also known as a quincunx or 
 * the Galton box, is a device for statistics experiments named after English 
 * scientist Sir Francis Galton. It consists of an upright board with evenly 
 * spaced nails (or pegs) in a triangular form, as shown in Figure 7.13.
 * 
 * @author DejanD
 */
public class Exercise_07_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the number of balls to drop: ");
        int noOfBalls = in.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int noOfSlots = in.nextInt();
        int[] slots = new int[noOfSlots];
        String path = "";
        for (int i = 0; i < noOfBalls; i++){
            for (int j = 0; j < noOfSlots-1; j++){
                String arr = ((int) (Math.random() * 2) == 0) ? "L" : "R";
                path+= arr;
            }
            System.out.println(path);
            slots[countRs(path)]++;
            path = "";
        }
        printSlots(slots, noOfBalls);
        
    }
    public static int countRs(String path){
        int count = 0;
        for (int i = 0; i < path.length(); i++){
            if (path.charAt(i) == 'R') count++;
        }
        return count;
    }
    public static void printSlots(int[] slots, int noOfBalls){
        for (int i = noOfBalls-1; i > 0 ;i-- ) {
            for (int j = 0; j < slots.length; j++){
                if (slots[j] >= i) System.out.print("0");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
