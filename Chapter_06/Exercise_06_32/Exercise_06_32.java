
package Exercise_06_32;

import static Exercise_06_30.Exercise_06_30.rollDices;

/**
 *
 * (Game: chance of winning at craps) Revise Programming Exercise 6.30 to run it 
 * 10,000 times and display the number of winning games.
 * 
 * @author DEJAN
 */
public class Exercise_06_32 {
    public static void main(String[] args) {
        int wins = 0;
        for (int i = 0; i < 10000; i++){
            if (playGame()) wins++;
        }
        
        System.out.println("Total games played: 10000 \nYou won : " + wins + " times\nYou lost: " + 
                (10000-wins) + " times");
    }
    public static boolean playGame(){
        int dice = rollDices();
        if (dice == 7 || dice == 11) {
            System.out.println("You win");
            return true;
        }
        else if (dice == 2 || dice == 3 || dice == 12){
            System.out.println("You lose");
            return false;
        }
        int point = dice;
        System.out.println("Point is " + point);
        do {
            dice = rollDices();
        } while (dice != 7 && dice != point);
        if (dice == 7) {
            System.out.println("You lose");
            return false;
        }
        else {
            System.out.println("You win");
            return false;
        }
    }
    public static int rollDices(){
        int dice1 = (int) (Math.random()*6)+1;
        int dice2 = (int) (Math.random()*6)+1;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1+dice2));
        return dice1+dice2;
    }
}
