package Exercise_06_08;

import java.util.Locale;

/**
 *
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the
 * following two methods: Convert from Celsius to Fahrenheit public static
 * double celsiusToFahrenheit(double celsius) Convert from Fahrenheit to Celsius
 * public static double fahrenheitToCelsius(double fahrenheit) The formula for
 * the conversion is as follows: 
 * fahrenheit = (9.0 / 5) * celsius + 32 
 * celsius =(5.0 / 9) * (fahrenheit – 32) 
 * Write a test program that invokes these methods
 * to display the following table:
 * Celsius Fahrenheit | Fahrenheit Celsius 
 * 40.0 104.0 | 120.0 48.89
 * 39.0 102.2 | 110.0 43.33 
 * 38.0 100.4 | 100.0 37.78
 * 37.0 98.6 | 90.0 32.22 
 * 36.0 96.8 | 80.0 26.67 
 * 35.0 95.0 | 70.0 21.11 
 * 34.0 93.2 |60.0 21.11
 * 33.0 91.4 | 50.0 10.00
 * 32.0 89.6 | 40.0 4.44
 * 31.0 87.8 | 30.0 –1.11
 *
 * @author DejanD
 */
public class Exercise_06_08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("--------------------------------------------------------");
        for (int i =0; i < 10; i++){
            System.out.printf("%2.1f\t%8.1f\t|\t%3.1f\t\t%3.2f\n",(40.0-i),celsiusToFahrenheit(40.0-i),
                    (120.0-i*10),fahrenheitToCelsius(120-i*10));
        }
        
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
