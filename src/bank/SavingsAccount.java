package bank;

public class SavingsAccount extends Bank{
    private double interestRate;

    public void setInterestRate(double rate){
        this.interestRate = rate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
    
}
