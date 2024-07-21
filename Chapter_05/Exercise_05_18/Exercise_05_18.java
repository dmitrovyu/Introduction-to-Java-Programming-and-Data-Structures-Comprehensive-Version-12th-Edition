
package Exercise_05_18;

/**
 * *5.18 (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 *
 *
 *  Pattern A       Pattern B       Pattern C       Pattern D
 *  *               * * * * * *             *       * * * * * *
 *  * *             * * * * *             * *         * * * * *
 *  * * *           * * * *             * * *           * * * *
 *  * * * *         * * *              * * * *            * * *
 *  * * * * *       * *              * * * * *              * *
 *  * * * * * *     *              * * * * * *                *
 *
 * @author DejanD
 * */
public class Exercise_05_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A\n");
        for (int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern B\n");
        for (int i = 1; i <=6; i++){
            for (int j = 1; j <= 7-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern C\n");
        for (int i = 1; i <=6; i++){
            for (int j = 6; j >=1; j--){
                if (j <=i) System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern D\n");
        for (int i = 0; i <=6; i++){
            for (int j =1; j <=6; j++){
                if ((j-i > 0)) System.out.print((j-i)+" ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        
    }
}
