
package Exercise_10_02;

/**
 *    (The BMI class) Add the following new constructor in the BMI class:
 *    Construct a BMI with the specified name, age, weight, feet, and inches
 *      public BMI(String name,int age,double weight,double feet,double inches)
 * 
 * @author DejanD
 */
public class Exercise_10_02 {
    public static void main(String[] args) {
      BMI bmi1 = new BMI("Kim Yang", 18, 145, 70); 
      System.out.println("The BMI for " + bmi1.getName() + " is " 
        + bmi1.getBMI() + " " + bmi1.getStatus());
 
      BMI bmi2 = new BMI("Susan King", 215, 70); 
      System.out.println("The BMI for " + bmi2.getName() + " is " 
        + bmi2.getBMI() + " " + bmi2.getStatus());
      BMI bmi3 = new BMI("Peter Parker",24,  198, 6, 2);
      System.out.println("The BMI for " + bmi3.getName() + " is " 
        + bmi3.getBMI() + " " + bmi3.getStatus());
      
     }
    
}
