package bank;

public class Main {
    public static void main(String[] args) {
        Bank account = new Bank("joao","123-456-789",5000000);
        System.out.println("Account holder: "+account.getAccountName());
        System.out.println("Account number: "+account.getAccountNumber());
        account.deposit(5000);
        System.out.println("balance: "+account.getBalnace());
        account.withdraw(3000);
        System.out.println("balance: "+account.getBalnace());
    }
}
