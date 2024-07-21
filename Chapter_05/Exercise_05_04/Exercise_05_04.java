
package Exercise_05_04;

/**
 *
 * (Conversion from miles to kilometers) Write a program that displays the following 
 * table (note 1 mile is 1.609 kilometers):
 * Miles Kilometers
 * 1 1.609
 * 2 3.218. . .
 * 9 14.481
 * 10 16.090
 * 
 * @author DEJAN
 */
public class Exercise_05_04 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        int i = 1;
        while(i < 11){
            System.out.printf("%-10d\t%-10.3f\n",i,i*1.609);
            i++;
        }
                
    }
}
