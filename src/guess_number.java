import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess; 
        int random_num = random.nextInt(0, 11);
        int attemps = 0;

        System.out.println("GUESS THE NUMBER TO WIN!");
        System.out.println("GUESS A NUMBER BETWEEN 1-10");
        
        do { 
            System.out.print("GUESS: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess < random_num){
                System.out.println("GUESS TO LOW");
            }else{
                System.out.println("GUESS TO HIGH");
            }
            
        } while (guess != random_num);
        System.out.println("YOU WIN! THE RIGHT NUMBER IS: "+random_num);
        System.out.println("ATTEMPS: "+attemps);

        scanner.close();
    }
    
}