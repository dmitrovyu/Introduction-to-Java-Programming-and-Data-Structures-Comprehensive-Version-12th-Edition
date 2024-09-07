
package Exercise_07_29;

/**
 *(Game: pick four cards) Write a program that picks four cards from a deck of 52 
 * cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12, 
 * and 11, respectively. 
 * Your program should display the number of picks that yields the sum of 24.
 * @author DejanD
 */
public class Exercise_07_29 {
    public static void main(String[] args) {
        int count = 0;
        do {
            count++;
        }while(pickFourCards() != 24);
        System.out.println("Number of picks before sum is 24: " + count);
    }
    
    //Pick four differnt cards and return sum of cards
    public static int pickFourCards() {
        int[] pick = new int[4];
        int pickedDifferent = 0;
        while (pickedDifferent < 4){
            int card = (int) (Math.random()*52 + 1);
            if (pick[0] != card && pick[1] != card && pick[2] != card && pick[3] != card){
                pick[pickedDifferent] = card;
                pickedDifferent++;
                System.out.print("Picked card: " + cardName(card)+ ", ");
            }
        }
       
        int sum = 0;
        for (int i : pick){
            sum += (i %13);
        }
        System.out.println("\nSum of cards: " + sum);
        return sum;
    }
    
    //Return card name
    public static String cardName(int num){
        String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
        String cardName = "";
        cardName += ranks[num % 13]+ " of ";
        cardName += suit[(num-1)/13];
        return cardName;
            
    }
}
