
package Exercise_03_06;
import java.util.Scanner;

/**
 * *3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 * inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
 *
 *          Enter weight in pounds: 140
 *          Enter feet: 5
 *          Enter inches: 10
 *          BMI is 20.087702275404553
 *          Normal
 *
 * @author DejanD
 * */
public class Exercise_03_06 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant
        final double FOOT_IN_INCHES = 12; //Constant
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter feet: ");
        double heightFeets = input.nextDouble();
        System.out.print("Enter inches: ");
        double heightInches = input.nextDouble();
        
        /**
         * BMI can be calculated by taking your weight in kilograms 
         * and dividing it by the square of your height in meters. 
         */
        
        double BMI = (weightInPounds *  KILOGRAMS_PER_POUND)/ Math.pow(
                (heightFeets * FOOT_IN_INCHES + heightInches) * METERS_PER_INCH,2);
        
        String bmiResult;
        if (BMI < 18.5) bmiResult = "Underweight";
        else if (BMI < 25.0) bmiResult = "Normal";
        else if(BMI < 30.0) bmiResult = "Overweight";
        else bmiResult ="Obese";
        
        System.out.println("BMI is " + BMI);
        System.out.println(bmiResult);
        
    }
}
