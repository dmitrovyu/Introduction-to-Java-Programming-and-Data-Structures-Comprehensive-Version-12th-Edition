
package Exercise_09_01;

/**
 *
 * @author DejanD
 */
public class Rectangle {
    private double width = 1;
    private double height = 1;
    
    public Rectangle(){
      
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2*height + 2*width;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }   
}
