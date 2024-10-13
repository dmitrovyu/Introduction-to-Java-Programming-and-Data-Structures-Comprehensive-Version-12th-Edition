package Exercise_09_06;

import java.util.Arrays;

/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * ■ Private data fields startTime and endTime with getter methods.
 * ■ A no-arg constructor that initializes startTime with the current time.
 * ■ A method named start() that resets the startTime to the current time.
 * ■ A method named stop() that sets the endTime to the current time.
 * ■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * Draw the UML diagram for the class then implement the class. Write a test program
 * that measures the execution time of sorting 100,000 numbers using selection sort.
 * @author DejanD
 */
public class Exercise_09_06 {
    public static void main(String[] args) {
        int size = 100_000;
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random()*size);
        
        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getElapsedTime() + "ms");
        System.out.println(Arrays.toString(list));
        
    }
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++){
            int minIndex = i;
            for (int j = i+1;  j < list.length; j++){
                if (list[minIndex] > list[j] ) minIndex = j;
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;   
        }
    }
}
