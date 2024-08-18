
package Exercise_06_30;

/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player. Here are some sample runs
 *
 *          You rolled 5 + 6 = 11
 *          You win
 *
 *          You rolled 1 + 2 = 3
 *          You lose
 *
 *          You rolled 4 + 4 = 8
 *          point is 8
 *          You rolled 6 + 2 = 8
 *          You win
 *
 *          You rolled 3 + 2 = 5
 *          point is 5
 *          You rolled 2 + 5 = 7
 *          You lose
 *
 * @author DejanD
 */
public class Exercise_06_30 {
    public static void main(String[] args) {
        int dice = rollDices();
        if (dice == 7 || dice == 11) {
            System.out.println("You win");
            System.exit(1);
        }
        else if (dice == 2 || dice == 3 || dice == 12){
            System.out.println("You lose");
            System.exit(1);
        }
        int point = dice;
        System.out.println("Point is " + point);
        do {
            dice = rollDices();
        } while (dice != 7 && dice != point);
        if (dice == 7) System.out.println("You lose");
        else System.out.println("You win");
        
       
            
        
    }
    public static int rollDices(){
        int dice1 = (int) (Math.random()*6)+1;
        int dice2 = (int) (Math.random()*6)+1;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1+dice2));
        return dice1+dice2;
    }
}
