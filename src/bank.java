import java.util.Scanner;

public class bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("1-SHOW BALANCE");
            System.out.println("2-DEPOSIT");
            System.out.println("3-WITHDRAW");
            System.out.println("4-EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
            }
        }
    }

    static void showBalance(double balance) {
        System.out.println("BALANCE: " + balance);
    }


    static double deposit(){
        double amount;

        System.out.println("AMOUNT TO DEPOSIT: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("AMOUNT CANT BE NEGATIVE!");
        }else{
            return amount;
        }

        return 0;
    }
    static double withdraw(double balance){
        double amount; double balance1 = balance;

        System.out.println("AMOUNT TO WITHDRAW: ");
        amount = scanner.nextDouble();

        if(amount > balance1){
            System.out.println("YOU DONT HAVE THAT MONEY");
        }else{
            return amount;
        }
        return 0;
    }
}
