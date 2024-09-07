
package Exercise_07_24;

/**
 *
 * * **7.24 (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to repeatedly pick
 * objects from a set of objects and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from
 * a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in the deck
 * before picking another. Write a program to simulate the number of picks needed
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice). Here is a sample run of the program:
 *
 *      Queen of Spades
 *      5 of Clubs
 *      Queen of Hearts
 *      4 of Diamonds
 *      Number of picks: 12
 *
 * @author DejanD
 */
public class Exercise_07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        boolean[] found = new boolean[4];
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        //Initialize deck
        for (int i = 0; i < deck.length; i++) deck[i]=i;
        //Shuffle cards
        for (int i = 0; i < deck.length; i++){
            int index = (int) (Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        int numberOfPicks = 0;
        int count = 0;
        // Count occurrence in each suit
        while (count < 4){
            numberOfPicks++;
            int index = (int) (Math.random()*deck.length);
            if (!found [index / 13] ){
                found[index/13] = true;
                count++;
                String suit = suits[index/13];
                String rank = ranks[index % 13];
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println("Total number of picks: " + numberOfPicks);
        
    }
}
