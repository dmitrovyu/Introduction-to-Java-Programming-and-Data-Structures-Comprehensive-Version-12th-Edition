
package Exercise_10_12;

/**
 **************************************************
 * Tringle2D
 * ************************************************
 * -p1: MyPoint
 * -p2: MyPoint
 * -p3: MyPoint
 * ************************************************
 * +Triangle2D()
 * +Triangle2D(p1:MyPoint, p2:MyPoint, p3:MyPoint)
 * +getArea(): double
 * +getPerimeter(): double
 * +contains(p:MyPoint):boolean
 * +contains(t:Triangle2D):boolan
 * +overlaps(t:Triangle2D):boolan
 ***************************************************
 * @author DejanD
 */
public class Triangle2D {
    private MyPoint p1,p2,p3;
    
    public Triangle2D(){
        this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
    }
    public Triangle2D(MyPoint p1,MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    
    public double getArea(){
        double sideOne = MyPoint.distance(p1, p2);
        double sideTwo = MyPoint.distance(p1, p3);
        double sideThree = MyPoint.distance(p3, p2);
        double s = (sideOne + sideTwo + sideThree)/2;
        return  Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
        
    }
    public double getPerimeter(){
         return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }
    // If the sum of the areas of the three sub-triangles equals
    //the area of the original triangle, the point is inside
    public boolean contains(MyPoint p){
        double area1 = new Triangle2D(p1,p2,p).getArea();
        double area2 = new Triangle2D(p1,p3,p).getArea();
        double area3 = new Triangle2D(p2,p3,p).getArea();
        double subArea= area1 + area2 + area3;
        return Math.abs(this.getArea() - subArea) < 1e-9;
    }
    // Method to check if a triangle is inside this triangle
    public boolean contains(Triangle2D t){
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }
     // Method to check if a triangle overlaps with this triangle
    public boolean overlaps(Triangle2D t) {
        return contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3()) ||
               t.contains(p1) || t.contains(p2) || t.contains(p3);
    }
}
