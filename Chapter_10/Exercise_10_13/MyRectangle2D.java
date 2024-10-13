
package Exercise_10_13;

/**
 *************************************************
 * MyRectangle2D
 *************************************************
*-x: double
-*y: double
*-width: double
*-height: double
* ******************************************************
*+MyRectangle2D()
*+MyRectangle2D(x: double, y: double, width: double, height: double)
*+setX(x: double )
*+setY(y: double)
*+getX(): double
*+getY(): double
*+setHeight(heigth: double)
*+setWidth(width: double)
*+getHeight(): double
*+getWidth(): double
*+getArea(): double
*+getPermeter(): double
*+contains(r: MyRectangle2D)
*+contains(x: double, y: double)
*+overlaps(r: MyRectangle2D)
* ***************************************************
 * @author DejanD
 * ***************
 */
public class MyRectangle2D {
    private double x,y;
    private double width;
    private double height;
    
    public MyRectangle2D(){
        this(0,0,1,1);
    }
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width + 2*height;
    }
    public boolean contains(double x, double y){
        return x > this.x - width / 2 && x < this.x + width / 2 &&
               y > this.y - height / 2 && y < this.y + height / 2;
    }
    public boolean contains(MyRectangle2D r) {
        return (r.getX() + r.getWidth()/2 <= this.getX() + this.getWidth()/2) &&
               (r.getX() - r.getWidth()/2 >= this.getX() - this.getWidth()/2) &&
               (r.getY() + r.getHeight()/2 <= this.getY() + this.getHeight()/2) &&
               (r.getY() - r.getHeight()/2 >= this.getY() - this.getHeight()/2);
                
    }
    public boolean overlaps(MyRectangle2D r){
        //check if a new rectagle is inside of rectangle
        if (contains(r)) return false;
        //calculate if any of the points of second rectangle is inside of first rectangle
        return (contains(r.getX() - r.getWidth()/2,r.getY() - r.getHeight()/2)) ||
               (contains(r.getX() + r.getWidth()/2,r.getY() + r.getHeight()/2)) ||
               (contains(r.getX() - r.getWidth()/2,r.getY() + r.getHeight()/2)) ||
               (contains(r.getX() + r.getWidth()/2,r.getY() - r.getHeight()/2));
    }
}
    
