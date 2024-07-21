package Exercise_05_25;

/**
 * (Compute π) You can approximate p by using the following summation: π = 4 *
 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + [(-1^i+1) / (2i -1)]
 *
 * @author DEJAN
 */
public class Exercise_05_25 {

    public static void main(String[] args) {
        double pi = 0.0;
        for (int j = 0; j < 10; j++) {
            for (int i = 1 + j*10000; i < 10000*(j+1); i++) {
                pi += Math.pow(-1, i + 1) / (2 * i - 1);
            }
            System.out.println("Pi for " + (j+1) * 10_000 + " iteration is: " + (4.0 * pi));
            
        }
        
        
    }
}
