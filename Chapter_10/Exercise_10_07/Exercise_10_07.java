
package Exercise_10_07;

import java.util.Scanner;

/**
 *
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 
 * to simulate an ATM machine. Create 10 accounts in an array with id 0, 1, . . . , 9, 
 * and an initial balance of $100. The system prompts the user to 
 * enter an id. If the id is entered incorrectly, ask the user to enter a correct id. 
 * Once an id is accepted, the main menu is displayed as shown in the sample 
 * run. You can enter choice 1 for viewing the current balance, 2 for withdrawing 
 * money, 3 for depositing money, and 4 for exiting the main menu. Once you exit, 
 * the system will prompt for an id again. Thus, once the system starts, it will not stop.
 * 
 * @author DejanD
 */
public class Exercise_10_07 {
    public static Scanner in = new Scanner(System.in);
    public static Account[] accounts = new Account[10];
    
    public static void main(String[] args) {
     
        for (int i =0; i < 10; i++){
            accounts[i] = new Account(i,100);
        }
        while(true){
            System.out.print("Enter an id: ");
            int id = in.nextInt();
            if (id < 0 || id > 9) System.out.println("Wrong ID number, id number is 0-9");   
            runMachine(id);     
        }
        
    }
    public static void runMachine(int id){
        while (true) {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            int choice = in.nextInt();
            if (choice < 0 || choice > 4){
                System.out.println("Wrong choice, enter numbers 0-4");
                continue;
            }
            if (choice == 4) break;
            switch (choice) {
                case 1 -> checkBalance(id);
                case 2 -> withdraw(id);
                case 3 -> deposit(id);
                
            }
        }
    }
    public static void checkBalance(int id){
        System.out.println("The balance is: " + accounts[id].getBalance());
    }
    public static void withdraw(int id){
        System.out.print("Enter an amount to withdraw: ");
        double amm = in.nextInt();
        accounts[id].withdraw(amm);
    }
    public static void deposit(int id){
        System.out.print("Enter an amount to deposit:");
        double amm = in.nextInt();
        accounts[id].deposit(amm);
    }
    
}
