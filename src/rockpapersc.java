import java.util.Random;
import java.util.Scanner;

public class rockpapersc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissor"};

        int user_choice;
    
        System.out.println("1 - rock");
        System.out.println("2 - paper");
        System.out.println("3 - scissor");
        System.out.println("4 - exit");

        while (true) {
            System.out.print("your chose: ");
            user_choice = scanner.nextInt();
            if(user_choice == 4){
                break;
            }
        int machine_choice = random.nextInt(3) + 1;
        String user_pick = choices[user_choice - 1];
        String machine_pick = choices[machine_choice - 1];

        System.out.println("You chose: " + user_pick);
        System.out.println("Machine chose: " + machine_pick);

        if (user_choice == machine_choice) {
                System.out.println("tie");
            } else if ((user_choice == 1 && machine_choice == 3) || (user_choice == 2 && machine_choice == 1) ||(user_choice == 3 && machine_choice == 2)) {
                System.out.println("you win");
            } else {
                System.out.println("machine wins");
            }
        }
    }
}