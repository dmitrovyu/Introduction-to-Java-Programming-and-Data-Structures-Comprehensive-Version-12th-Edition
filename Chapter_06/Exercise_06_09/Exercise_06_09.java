package Exercise_06_09;

/**
 *
 * (Conversions between feet and meters) Write a class that contains the following two methods:
 * Convert from feet to meters 
 * public static double footToMeter(double foot)
 * Convert from meters to feet 
 * public static double meterToFoot(double meter)
 * The formula for the conversion is:
 * meter = 0.305 * foot
 * foot = 3.279 * meter
 * Write a test program that invokes these methods to display the following tables:
 * Feet Meters | Meters Feet
 * 1.0 0.305 | 20.0 65.574
 * 2.0 0.610 | 25.0 81.967
 * 3.0 0.915 | 30.0 98.361
 * 4.0 1.220 | 35.0 114.754
 * 5.0 1.525 | 40.0 131.148
 * 6.0 1.830 | 45.0 147.541
 * 7.0 2.135 | 50.0 163.934
 * 8.0 2.440 | 55.0 180.328
 * 9.0 2.745 | 60.0 196.721
 * 10.0 3.050 | 65.0 213.115

 * @author DEJAN
 */
public class Exercise_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------------------");
        for (double i =1.0; i< 11; i++){
            System.out.printf("%2.2f\t%1.3f\t|\t%2.1f\t%3.3f\n", i, footToMeter(i),
                    (15.0+5*i), meterToFoot(15.0+5*i));
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
