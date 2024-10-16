
package Exercise_11_01;

import java.util.Scanner;

/**
 * 11.1 (The Triangle class) Design a class named Triangle that extends 
 * GeometricObject. The class contains:
 * 
 * @author DEJAN
 */
public class Exercise_11_01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter three sides of triangle: ");
        double side1 = scn.nextDouble();
        double side2 = scn.nextDouble();
        double side3 = scn.nextDouble();
        
        System.out.print("Please enter the color: ");
        String color = scn.next();
        System.out.print("Please enter if triangle is filled (true/false): ");
        boolean isFilled = scn.nextBoolean();
        
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        System.out.println("On " + triangle.getDateCreated() + " you have created triangle of Area: " +  triangle.getArea());
        System.out.println("Triangle perimeter is: " + triangle.getPerimeter() + " Triangle color: " + triangle.getColor() 
                + " Triangle is filled: " + triangle.isFilled() );
        
    }
}

