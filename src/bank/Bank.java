package bank;

public class Bank {
    private String accountName;
    private String accountNumber;
    private double balance;

    public Bank(String accountName, String accountNumber,double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountName(){
        return accountName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalnace(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
        balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
}
