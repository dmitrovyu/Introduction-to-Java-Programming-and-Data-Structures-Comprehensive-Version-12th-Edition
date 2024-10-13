
package Exercise_10_11;

/**
 **********************************************
 * Circle2D
 * ********************************************
 * -x:double
 * -y:double
 * -radius:double
 * ********************************************
 * +Circle2D()
 * +Circle2D(x:double,y:double,radius:double)
 * +getX():double
 * +getY():double
 * +getRadius():double
 * +getArea():double
 * +getPerimeter():double
 * +contains(x:int, y:int):boolean
 * +contains(circle:Circle2D):boolean
 * +overlaps(circle:Circle2D):boolean
 ***********************************************
 * 
 * @author DejanD
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;
    
    public Circle2D(){
        this(0,0,1);
    }
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public boolean containts(double x, double y){
        double distance = Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
        return (distance < radius);
    }
    public boolean containts(Circle2D circle){
        double distance = Math.sqrt(Math.pow(this.x-circle.x, 2)+Math.pow(this.y-circle.y, 2));
        return ((distance + circle.radius) < radius );
    }
    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(this.x-circle.x, 2)+Math.pow(this.y-circle.y, 2));
        return (distance < circle.radius + this.radius);
    }
}
