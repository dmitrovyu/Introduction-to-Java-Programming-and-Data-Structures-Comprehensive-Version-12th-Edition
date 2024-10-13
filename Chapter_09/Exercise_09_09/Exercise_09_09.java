
package Exercise_09_09;

/**
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
 * the same length and all angles have the same degree (i.e., the polygon is both
 * equilateral and equiangular). Design a class named RegularPolygon that contains:
 * ■ A private int data field named n that defines the number of sides in the polygon
 * with default value 3.
 * ■ A private double data field named side that stores the length of the side with
 * default value 1.
 * ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
 * ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
 * ■ A no-arg constructor that creates a regular polygon with default values.
 * ■ A constructor that creates a regular polygon with the specified number of sides
 * and length of side, centered at (0, 0).
 * ■ A constructor that creates a regular polygon with the specified number of sides,
 * length of side, and x- and y-coordinates.
 * ■ The accessor and mutator methods for all data fields.
 * ■ The method getPerimeter() that returns the perimeter of the polygon.
 * ■ The method getArea() that returns the area of the polygon. The formula for
 * computing the area of a regular polygon is
 *
 *      Area = (n * s²) / (4 * tan(π/n))
 *
 * Draw the UML diagram for the class then implement the class.
 * Write a test program that creates three RegularPolygon objects,
 * created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4,
 * 5.6, 7.8). For each object, display its perimeter and area.
 *
 * @author DejanD
 */
public class Exercise_09_09 {
    public static void main(String[] args) {
        RegularPolygon polygonOne = new RegularPolygon();
        RegularPolygon polygonTwo = new RegularPolygon(6,4);
        RegularPolygon polygonThree = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygone one perimeter: " + polygonOne.getPerimeter()
                            + " area: " + polygonOne.getArea());
        System.out.println("Polygone two perimeter: " + polygonTwo.getPerimeter()
                            + " area: " + polygonTwo.getArea());
        System.out.println("Polygone three perimeter: " + polygonThree.getPerimeter()
                            + " area: " + polygonThree.getArea());
        
    }
}
