package Exercise_09_13;

/**
 *
 * @author DejanD
 */
public class Location {

    public int row, column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location loc = new Location();
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > loc.maxValue) {
                    loc.maxValue = a[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }
}
