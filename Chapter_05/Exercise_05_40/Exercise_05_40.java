/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_05_40;

/**
 *
 * @author DEJAN
 */
public class Exercise_05_40 {
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        for (int i =1 ; i <1_000_000; i++){
            int coin = (int) (Math.random() * 2);
            if (coin == 1) heads++;
            else tails++;
        }
        System.out.println("Number of heads: " + heads + " number of tails: " + tails);
        System.out.println("Ratio: " + heads*1.0/tails*1.0);
    }
}
