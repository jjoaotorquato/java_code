package bank;

public class Bank {
    private String name;
    private String accountNumber;
    private double balance;

    public void setName(String name){
        this.name = name;
    }

    public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getAcocuntNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public double withdraw(double amount){
        return balance -= amount;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    @Override
    public String toString(){
        return "name: " + name + " account number: "+ accountNumber + " balance: "+ balance;
    }
}
