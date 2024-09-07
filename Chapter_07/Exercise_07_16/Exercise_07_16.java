package Exercise_07_16;

/**
 *
 * (Execution time) Write a program that randomly generates an array of 100,000
 * integers and a key. Estimate the execution time of invoking the linearSearch
 * method in Listing 7.6. Sort the array and estimate the execution time of
 * invoking the binarySearch method in Listing 7.7. You can use the following
 * code template to obtain the execution time: long startTime =
 * System.nanoTime(); perform the task; long endTime = System.nanoTime(); long
 * executionTime = endTime − startTime;
 *
 * @author DejanD
 */
public class Exercise_07_16 {

    public static void main(String[] args) {
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 1000000);
        int pos = (int)(Math.random()*100000);
        int key = list[pos];
        
        //Linear search
         long startTime = System.nanoTime();
         pos = linearSearch(list,key);
         long endTime = System.nanoTime();
         System.out.println("Position: "  + pos);
         System.out.println("Linear search time: " + (endTime - startTime) );
         
         java.util.Arrays.sort(list);
         //Binary search
         startTime = System.nanoTime();
         pos = binarySearch(list,key);
         endTime = System.nanoTime();
         System.out.println("Position: "  + pos);
         System.out.println("Binary search time: " + (endTime - startTime) );
         
         
    }

    //Linear search
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    //Bianry search
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -low - 1; // Now high < low, key not found
    }
    
    
    
}
