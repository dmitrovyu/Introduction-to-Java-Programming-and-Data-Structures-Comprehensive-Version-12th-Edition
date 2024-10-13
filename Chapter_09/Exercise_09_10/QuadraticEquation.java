
package Exercise_09_10;

/**
 *
 * @author DejanD
 */
public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;            
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b - 4 * a * c;
    }
    public double getRoot1(){
        if (this.getDiscriminant() < 0) return 0;
        else return (-b + Math.sqrt(this.getDiscriminant())) / 2 * a;
    }
    public double getRoot2(){
        if (this.getDiscriminant() < 0) return 0;
        else return (-b - Math.sqrt(this.getDiscriminant())) / 2 * a;
    }   
}
