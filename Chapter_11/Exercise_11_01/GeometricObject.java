package Exercise_11_01;

import java.util.Date;

/**
 *
 * @author DejanD
 */
abstract public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("white", false, new Date());

    }

    protected GeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "created on: " + this.getDateCreated() + " color: " + this.getColor() + " is filled: " + this.isFilled();
    }
     /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}
