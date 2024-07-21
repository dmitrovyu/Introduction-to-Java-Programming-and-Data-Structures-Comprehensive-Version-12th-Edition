
package Exercise_05_06;

/**
 *
 * (Conversion from miles to kilometers) Write a program that displays
 * the following two tables side by side:
 *      Miles   Kilometers | Kilometers     Miles
 *      1       1.609      | 20             12.430
 *      2       3.218      | 25             15.538
 * . . .
 *      9       14.481     | 60             37.290
 *      10      16.090     | 65             40.398
 * 
 * @author DEJAN
 */
public class Exercise_05_06 {
    public static void main(String[] args) {
        int miles =0;
        int km = 15;
        System.out.printf("%-15s%-17s%-5s%-15s%-15s\n",
                "Miles", "Kilometers","|","Kilometers","Miles");
        while(miles <11){
            miles++;
            km+=5;
            System.out.printf("%-15d%-17.3f%-5s%-15d%-12.3f\n", miles, miles*1.609,"|",km, miles/1.609);   
        }
    }
}
