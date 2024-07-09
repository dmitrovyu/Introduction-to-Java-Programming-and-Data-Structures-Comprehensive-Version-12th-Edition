
package Exercise_03_16;

/**
 * 3.16 (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centred at (0, 0) with width 50 and height 150.
 *
 * @author DejanD
 * */
public class Exercise_03_16 {
    public static void main(String[] args) {
        int coordX =(int) (Math.random() * 101);
        int coordY = (int) (Math.random() * 201);
        System.out.println("Random coordinate inside rectangle is: (" + coordX + ", " + coordY + ")" );
    }
    
}
