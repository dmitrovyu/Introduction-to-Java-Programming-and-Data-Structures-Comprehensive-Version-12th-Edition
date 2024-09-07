
package Exercise_07_33;

import java.util.Scanner;

/**
 *
 * (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings
 * to store the animal names.
 * @author DEJAN
 */
public class Exercise_07_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        String[] chineseZodiac = {"monkey", "rooster", "dog", "pig", "rat",
            "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println("Chinese zodiac sign for year: " + year + " is " + 
                chineseZodiac[year % 12]);
        }
        
    }
