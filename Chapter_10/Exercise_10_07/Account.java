package Exercise_10_07;

import java.util.Date;

/**
 *
,-----------------------------------------------------.
|Account                                              |
|-----------------------------------------------------|
|-id : int                                            |
|-balance : double                                    |
|{static} -annualIntersestRate : double               |
|-dateCreated : String                                |
|+Account()                                           |
|+Account(newid: int, newBalance: double)             |
|+setId(newId : int)                                  |
|+setBalance(newBalance : double)                     |
|+setAnnualInterestRate(newAnnualInterestRate: double)|
|+getId(): int                                        |
|+getBalance(): double                                |
|+getAnnualInterestRate(): double                     |
|+getDateCreated(): String                            |
|getMonthlyInterestRate(): double                     |
|+getMonthlyInterest(): double                        |
|+withdraw(amount: double)                            |
|+deposit(amount: double)                             |
`-----------------------------------------------------'
* UML done by https://www.plantuml.com/
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
