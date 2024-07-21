package Exercise_05_07;

/**
 * **5.7 (Financial application: compute future tuition) Suppose that the tuition for a
 * university is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the total
 * cost of four years’ worth of tuition after the tenth year.
 *
 * @author DejanD
 * */
public class Exercise_05_07 {
    public static void main(String[] args) {
        double tutition =10_000;
        double increase = 1.05; // 5% increase
        double tenthYear = 0;
        double total =0;
        
        
        for (int i = 1; i < 15; i++){
            tutition *=increase;
            if (i ==10) tenthYear = tutition;
            if (i> 10) total+=tutition;
        }
        System.out.printf("In the tenth year the tuition will be: $%-10.2f\n",tenthYear);
        System.out.printf("Total cost of four years’ worth of tuition "
                + "starting after the tenth year: $%-10.2f",total);
        
    }
  
   
}
