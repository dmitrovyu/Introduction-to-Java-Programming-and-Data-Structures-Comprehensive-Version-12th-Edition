package Exercise_03_24;

/**
 * **3.24 (Game: pick a card) Write a program that simulates picking a card
 * from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4,
 * 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts,
 * Spades) of the card. Here is a sample run of the program: The card you picked
 * is Jack of Hearts
 *
 * @author DejanD
 *
 */
public class Exercise_03_24 {

    public static void main(String[] args) {

        int rankNum = (int) (Math.random() * 13) + 2;
        int suitNum = (int) (Math.random() * 4) + 1;
        String rank = "";
        String suit = "";
        switch (rankNum) {
            case 11:
                rank = "Ace";
                break;
            case 12:
                rank = "Jack";
                break;
            case 13:
                rank = "Queen";
                break;
            case 14:
                rank = "King";
                break;
            default:
                rank = "" + rankNum;
        }
        switch (suitNum) {
            case 1:
                suit = "Clubs";
                break;
            case 2:
                suit = "Diamonds";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Spades";
                break;
        }
        System.out.println(" The card you picked is " + rank + " of " + suit);
    }

}

