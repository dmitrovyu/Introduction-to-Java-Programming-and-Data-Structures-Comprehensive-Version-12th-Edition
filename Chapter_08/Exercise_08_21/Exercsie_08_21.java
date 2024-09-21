
package Exercise_08_21;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * * *8.21 (Central city) Given a set of cities, the central city is the city that has the shortest
 * total distance to all other cities. Write a program that prompts the user to enter
 * the number of cities and the locations of the cities (coordinates), and finds the
 * central city and its total distance to all other cities.
 *
 *          Enter the number of cities: 5
 *          Enter the coordinates of the cities:
 *          2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
 *          The central city is at (2.5, 5.0)
 *          The total distance to all other cities is 60.81
 * 
 * @author DejanD
 */
public class Exercsie_08_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the number of cities: ");
        int noOfCities = in.nextInt();
        System.out.print("Enter the coordinates of the cities:");
        double[][] coord = new double[noOfCities][2];
        for (int i = 0; i < noOfCities; i++){
            coord[i][0] = in.nextDouble();
            coord[i][1] = in.nextDouble();
        }
        double[] coordOfCentral = findCentral(coord);
        double totalDistance = totalDistance(coordOfCentral, coord);
        System.out.println("The central city is at (" + coordOfCentral[0] + ", " + 
                coordOfCentral[1] + ")");
        System.out.printf("The total distance to all other cities is %2.2f", 
                totalDistance);    
    }
    
    public static double[] findCentral(double[][] coord){
        double totalDistance = totalDistance(coord[0], coord);
        double[] central =coord[0];
        
        for (int i = 0; i < coord.length; i++){
            if (totalDistance(coord[i], coord) < totalDistance )
                central = coord[i];
        }
        return central;
    }
    public static double totalDistance(double[] city, double[][]cities){
        double totalDistance = 0;
        for (double[] city1 : cities) {
            totalDistance += Math.sqrt(Math.pow(city1[0] - city[0], 2) + Math.pow(city1[1] - city[1], 2));
        }
        return totalDistance;
    }
}
