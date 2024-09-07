package Exercise_07_13;

/**
 *
 * (Random number chooser) Write the following method that returns a 
 * random number between start and end, excluding the numbers. 
 *          public static int getRandom(int start, int end, int... numbers)
 * For example, invoking getRandom(1,100,4,8,95,93) returns a random 
 * number between 1 and 100 excluding 4,8,95,and 93. Write a test program
 * that invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting 
 * numbers 15 per line using the format %4d.
* 
 * @author DejanD
 */
public class Exercise_07_13 {
    public static void main(String[] args) {
        for (int i = 1; i < 46; i++){
            int rnd = getRandom(1,100,4,8,95,93);
            String space = (i % 15 == 0) ? "\n" : " ";
            System.out.print(rnd + space);
        }
        
    }
    public static int getRandom(int start, int end, int... numbers){
        int rnd;
        do{
            rnd = (int)(Math.random() * ((end - start) + 1) + start);
        } while (contains(rnd, numbers));
        return rnd;
    }
    public static boolean contains(int x, int[] numbers){
        for (int number: numbers){
            if (number == x) return true;
        }
        return false;
    }
}
