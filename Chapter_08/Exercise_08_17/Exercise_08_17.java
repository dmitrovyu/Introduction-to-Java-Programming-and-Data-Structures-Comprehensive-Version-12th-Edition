package Exercise_08_17;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * (Financial tsunami) Banks lend money to each other. In tough economic times, if a
 * bank goes bankrupt, it may not be able to pay back the loan. A bank’s total assets are
 * its current balance plus its loans to other banks. The diagram in Figure 8.8 shows
 * five banks. The banks’ current balances are 25, 125, 175, 75, and 181 million
 * dollars, respectively. The directed edge from node 1 to node 2 indicates that bank 1
 * lends 40 million dollars to bank 2.
 * If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
 * borrowed cannot be returned to the lender, and the lender cannot count the loan in
 * its total assets. Consequently, the lender may also be unsafe, if its total assets are
 * under the limit. Write a program to find all the unsafe banks. Your program reads
 * the input as follows. It first reads two integers n and limit, where n indicates the
 * number of banks and limit is the minimum total assets for keeping a bank safe. It
 * then reads n lines that describe the information for n banks with IDs from 0 to n−1.
 * The first number in the line is the bank’s balance, the second number indicates
 * the number of banks that borrowed money from the bank, and the rest are pairs
 * of two numbers. Each pair describes a borrower. The first number in the pair is
 * the borrower’s ID and the second is the amount borrowed. For example, the input
 * for the five banks in Figure 8.8 is as follows (note the limit is 201):
 * 5 201
 * 25 2 1 100.5 4 320.5
 * 125 2 2 40 3 85
 * 175 2 0 125 3 75
 * 75 1 0 125
 * 181 1 2 125
 *  The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is unsafe.
 * After bank 3 becomes unsafe, the total assets of bank 1 fall below (125 + 40).
 * Thus, bank 1 is also unsafe. The output of the program should be
 * Unsafe banks are 3 1
 *  (Hint: Use a two-dimensional array borrowers to represent loans.
 * borrowers[i][j] indicates the loan that bank i provides to bank j. Once
 * bank j becomes unsafe, borrowers[i][j] should be set to 0.)
 *
 * @author DejanD
 */
public class Exercise_08_17 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter number of bannks and a limit: ");
        int noOfBanks = in.nextInt();
        double limit = in.nextDouble();
        double[][] borrowers = new double[noOfBanks][noOfBanks];
        double[] balance = new double[noOfBanks];
        boolean[] unsafe = new boolean[noOfBanks];
        
        
        for (int i= 0; i < noOfBanks; i++){
            System.out.print("Enter data for the bank " + i + ": ");
            balance[i] = in.nextDouble();
            int noOfBorrowers = in.nextInt();
            for (int j = 0; j < noOfBorrowers; j++){
                int borrower = in.nextInt();
                borrowers[i][borrower] = in.nextDouble(); 
            }   
        }
        
         System.out.print("Unsafe banks are "); 
         
         //Check if unsafe
         do {
             
         }while(checkAssets(borrowers, balance, limit, unsafe));
        
        for (int i = 0; i < noOfBanks; i++)
            if (unsafe[i]) System.out.print(i + " ");
         
    }
    public static boolean checkAssets(double[][] borrowers, double[] balance, double limit, boolean[] unsafe){
        for (int i = 0; i < borrowers.length; i++){
            double totalAssets = balance[i];
            for (int j = 0; j < borrowers[i].length; j++){
                totalAssets += borrowers[i][j];
            }
            if (totalAssets < limit && !unsafe[i]) {
                unsafe[i]= true;
                for (int k = 0; k < borrowers.length; k++)
                    borrowers[k][i] = 0;
                return true;
            }    
        }
        return false;
    }
}
