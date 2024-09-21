
package Exercise_08_33;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *(Geometry: polygon subareas) A convex four-vertex polygon is divided into four
 * triangles, as shown in Figure 8.9.
 * Write a program that prompts the user to enter the coordinates of four vertices and
 * displays the areas of the four triangles in increasing order. Here is a sample run:
 *
 *              Enter x1, y1, x2, y2, x3, y3, x4, y4:
 *              -2.5 2 4 4 3 -2 -2 -3.5
 *     
 *
 *              The areas are 6.17 7.96 8.08 10.42
 *
 * @author DejanD
 */
public class Exercise_08_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for(int i = 0; i < 4; i++)
            for (int j = 0; j < 2; j++)
                points[i][j] = in.nextDouble();
        
        double[] inersectingPoint = getIntersectingPoint(points);
        System.out.println("inter:" + Arrays.toString(inersectingPoint));
        
        double[][] triangleOne = {points[0], points[1],inersectingPoint};
        double[][] triangleTwo = {points[1], points[2],inersectingPoint};
        double[][] triangleThree = {points[2], points[3],inersectingPoint};
        double[][] triangleFour = {points[3], points[0],inersectingPoint};
        
        double[] areaOfTriangles = new double[4];
        areaOfTriangles[0] = getTriangleArea(triangleOne);
        areaOfTriangles[1] = getTriangleArea(triangleTwo);
        areaOfTriangles[2] = getTriangleArea(triangleThree);
        areaOfTriangles[3] = getTriangleArea(triangleFour);
        
        sortAreaOfTriangles(areaOfTriangles);
        System.out.print("The areas are ");
        for (int i = 0; i < areaOfTriangles.length; i++)
            System.out.printf(" %3.3f", areaOfTriangles[i]);
                
                
    }
    public static double getTriangleArea(double[][] points){
        double sideOne = getDistance(points[0],points[1]);
        
        double sideTwo = getDistance(points[0], points[2]);
        
        double sideThree = getDistance(points[1], points[2]);
        
        double s = (sideOne + sideTwo + sideThree) / 2;
        double sa = s * (s - sideOne) * (s - sideTwo) * (s - sideThree);
        if (sa > 0) return Math.sqrt(sa);
        else return 0;
    }
    public static double getDistance(double[] point1, double[] point2){
        return Math.sqrt(Math.pow(point2[0]-point1[0], 2) + 
                Math.pow(point2[1] - point1[1], 2));
      
    }
    
    public static void sortAreaOfTriangles(double[] area){
        boolean sorted = false;
        do {
            for (int i =0; i < area.length-1; i++){
                sorted = true;
                if (area[i] > area[i+1]){
                    double temp = area[i];
                    area[i] = area[i+1];
                    area[i+1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }
    
    public static double[] getIntersectingPoint(double[][] points){
        //Calculate slope for both lines
        double x1=points[0][0], y1=points[0][1],x2=points[2][0],y2=points[2][1];
        double x3=points[1][0], y3=points[1][1],x4=points[3][0],y4=points[3][1];
       double denominator = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        if (denominator == 0) {
            return null; // Lines are parallel or coincident
        }

        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denominator;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denominator;

        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            double x = x1 + ua * (x2 - x1);
            double y = y1 + ua * (y2 - y1);
            return new double[]{x, y};
        }

        return null; // Intersection point is not within the line segments
    }
}
