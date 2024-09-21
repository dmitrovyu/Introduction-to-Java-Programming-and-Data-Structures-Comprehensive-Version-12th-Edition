package Exercise_08_10;

/**
 *
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 *
 *          0011
 *          0011
 *          1101
 *          1010
 *          The largest row index: 2
 *          The largest column index: 2
 *
 * @author DejanD
 */
public class Exercise_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j= 0; j <4; j++){
                 matrix[i][j] = (int)(Math.random()*2.0);
                 System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
                
        int sumXmax = 0;
        int sumYmax = 0;
        int row = 0;
        int column = 0;
        for (int i =0; i < 4; i++){
                int sumX = matrix[i][0] + matrix[i][1] +matrix[i][2] + matrix[i][3];
                int sumY = matrix[0][i] + matrix[1][i] +matrix[2][i] + matrix[3][i];
                if (sumX > sumXmax){
                    sumXmax = sumX;
                    row =i;    
                }
                if (sumY > sumYmax){
                    sumYmax = sumY;
                    column = i;
                }
            
        }
      
        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + column);
    }
    
}
