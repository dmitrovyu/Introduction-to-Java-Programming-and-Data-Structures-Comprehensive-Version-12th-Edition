
package Exercise_04_25;

/**
 * *4.25 (Generate vehicle plate numbers) Assume that a vehicle plate number consists of
 * three uppercase letters followed by four digits. Write a program to generate a plate
 * number.
 *
 * @author DejanD
 * */

public class Exercise_04_25 {
    public static void main(String[] args) {
        
        char first = (char) ((int)((Math.random()*26)+65));
        char second = (char) ((int)((Math.random()*26)+65));
        char third = (char) ((int)((Math.random()*26)+65));
        int n1 = (int) (Math.random()*10);
        int n2 = (int) (Math.random()*10);
        int n3 = (int) (Math.random()*10);
        int n4 = (int) (Math.random()*10);
        String license ="" + first + second + third + n1 +n2 +n3 +n4;
        System.out.println("License plate is: " + license);
    }

}   

