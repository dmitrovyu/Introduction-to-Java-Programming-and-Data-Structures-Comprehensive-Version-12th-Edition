
package Exercise_09_08;

/**
 *
 * @author DejanD
 */
public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String colour = "blue";
    
    public Fan() {
        
    }
    
    @Override
    public String toString() {
        if (on) return "speed " + speed + "\t" 
                + "colour " + colour + "\t" 
                + "radius " + radius;
        else return "colour " + colour + "\t"
                + "radius " + radius + "\t"
                + "fan is off";
    }
    
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn() {
        this.on = true;
    }
    public void setOff(){
        this.on = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
  
}
