
package Exercise_09_01;

/**
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle. The class contains:
 *      ■ Two double data fields named width and height that specify the width and
 *        height of the rectangle. The default values are 1 for both width and height.
 *      ■ A no-arg constructor that creates a default rectangle.
 *      ■ A constructor that creates a rectangle with the specified width and height.
 *      ■ A method named getArea() that returns the area of this rectangle.
 *      ■ A method named getPerimeter() that returns the perimeter.
 * Draw the UML diagram for the class then implement the class. Write a test
 * program that creates two Rectangle objects—one with width 4 and height 40
 * the other with width 3.5 and height 35.9. Display the width, height, area, and
 * perimeter of each rectangle in this order.
 *
 * @author DejanD
 */
public class Exercise_09_01 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println("First rectangle - width: " + rec1.getWidth() + " height: " + 
                rec1.getHeight()  + " area: " + rec1.getArea() + 
                " preimeter: " + rec1.getPerimeter());
        System.out.println("First rectangle - width: " + rec2.getWidth() + " height: " + 
                rec2.getHeight()  + " area: " + rec2.getArea() + 
                " preimeter: " + rec2.getPerimeter());
        
    }
}
