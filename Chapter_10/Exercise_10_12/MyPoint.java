package Exercise_10_12;


/**
,-------------------------------------------------------------------------.
|                   MyPoint                                                                  |
|-------------------------------------------------------------------------|
|-x : double                                                              |
|-y : double                                                              |
|+MyPoint()                                                               |
|+MyPoint(x : double, y : double)                                         |
|+distance(anotherPoint : MyPoint) : double                               |
|+distance(x : double, y : double) : double                               |
|{static}  +distance(firstPoint : MyPoint, secondPoint : MyPoint) : double|
|                                                                         |
`-------------------------------------------------------------------------'
* UML done by https://www.plantuml.com/
*/
public class MyPoint {
    private double x, y;
    public MyPoint(){
        this(0,0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(MyPoint anotherPoint){
        return distance(anotherPoint.x, anotherPoint.y);
    }
    public double distance (double x2, double y2){
        return Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y-y2, 2));
    }
    public static double distance(MyPoint point1, MyPoint point2){
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y-point2.y, 2));
    }
}
