package bank;

public class Main {
    public static void main(String[] args) {
       Bank account = new Bank();
       account.setName("joao");
       account.setAccountNumber("0123-456");
       account.setBalance(70000);
       System.out.println(account);
    }
}
   