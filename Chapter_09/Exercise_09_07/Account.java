package Exercise_09_07;

import java.util.Date;

/**
 *
 * @author DejanD
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private final Date dateCreated = new Date();
    
    public Account(){
        
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate ;
    }
    public void setAnnualInterestRate(double intRate){
        annualInterestRate = intRate;   
    }
    public void setId(int id){
        this.id  = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.getAnnualInterestRate()/12;
    }
    public double getMonthlyInterest(){
        return this.balance * this.getMonthlyInterestRate()/100;
    }
    public void withdraw(double removeFromBalance){
        balance -= removeFromBalance;
    }
    public void deposit(double deposit){
        this.balance += deposit;
    }
    
}
