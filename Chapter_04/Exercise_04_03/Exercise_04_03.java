package Exercise_04_03;

/**
 * *4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the
 * figure in Section 4.1 to compute the estimated area enclosed by these four
 * cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use
 * the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 *
 * @author DejanD
 *
 */
public class Exercise_04_03 {

    private static final double EARTH_RADIUS = 6371.01;

    public static void main(String[] args) {
        // Charlotte (35.2270869, –80.8431267)
        // Savannah (32.0835407, –81.0998342)
        // Orlando (28.5383355, –81.3792365)
        // Atlanta (33.7489954, –84.3879824)
        double chx = 35.2270869;
        double chy = -80.8431267;
        double sax = 32.0835407;
        double say = -81.0998342;
        double orx = 28.5383355;
        double ory = -81.3792365;
        double atx = 33.7489954;
        double aty = -84.3879824;

        //Distance between Atlanta to Charlotte 
        double distanceAC = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(atx)) * Math.sin(Math.toRadians(chx))
                + Math.cos(Math.toRadians(atx)) * Math.cos(Math.toRadians(chx))
                * Math.cos(Math.toRadians(aty - chy)));
        //Distance betweeen Charlote to Savannah
        double distanceCS = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(chx)) * Math.sin(Math.toRadians(sax))
                + Math.cos(Math.toRadians(chx)) * Math.cos(Math.toRadians(sax))
                * Math.cos(Math.toRadians(chy - say)));
        //Distance betweeen  Savannah to Orlando
        double distanceSO = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(sax)) * Math.sin(Math.toRadians(orx))
                + Math.cos(Math.toRadians(sax)) * Math.cos(Math.toRadians(orx))
                * Math.cos(Math.toRadians(say - ory)));
        //Distance betweeen  Orlando to Atlanta
        double distanceOA = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(orx)) * Math.sin(Math.toRadians(atx))
                + Math.cos(Math.toRadians(orx)) * Math.cos(Math.toRadians(atx))
                * Math.cos(Math.toRadians(ory - aty)));
        //Distance betweeen  Orlando to Charlote
        double distanceOC = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(orx)) * Math.sin(Math.toRadians(chx))
                + Math.cos(Math.toRadians(orx)) * Math.cos(Math.toRadians(chx))
                * Math.cos(Math.toRadians(ory - chy)));

        //Area of triangle Orlando Atlanta Charlotte
        double s = (distanceOA + distanceAC + distanceOC) / 2;
        double areaOAC = Math.sqrt(s * (s - distanceOA) * (s - distanceAC) * (s - distanceOC));

        //Area of triangle Orlando Savannah Charlotte
        s = (distanceSO + distanceCS + distanceOC) / 2;
        double areaOSC = Math.sqrt(s * (s - distanceSO) * (s - distanceCS) * (s - distanceOC));

        System.out.printf("Total area between Orlando, Atlanta, Charlotte "
                + "and Savannah is : %5.3f km", (areaOAC + areaOSC)); //Calculated area is 117796,414 km

    }
}
