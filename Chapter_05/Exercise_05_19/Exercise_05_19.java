
package Exercise_05_19;

/**
 *
 * @author DEJAN
 */
public class Exercise_05_19 {
    public static void main(String[] args) {
        
        String out = "";
        for (int i = 0; i < 8; i++){
            for (int j =0; j < 8; j++){
               if ((j-6+i)> 0) out +=(int)Math.pow(2,(j-7+i)) + "\t";
               else out+="\t";
            }
            for (int k = 6; k > 0; k--){
                if ((k-7+i)> 0) out +=(int)Math.pow(2,(k-8+i)) + "\t";
               else out+="\t";
            }
            System.out.println(out );
            out = "";
    }
}
}

