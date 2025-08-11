package bank;

public class Main {
    public static void main(String[] args) {
       Bank account = new Bank();
       account.setName("joao");
       account.setAccountNumber("0123-456");
       account.setBalance(70000);
       System.out.println(account);


       SavingsAccount account2 = new SavingsAccount();

       account2.setName("joao");
       account2.setAccountNumber("0123-456-789");
       account2.setBalance(120000);
       account2.setInterestRate(0.10);
       account2.applyInterest();
       account2.deposit(30000);

       System.out.println(account2);
    }
}
   