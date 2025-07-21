import java.util.Random;
import java.util.Scanner;

public class diceRoler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice; int total = 0;

        System.out.print("ENTER NUM OF DICE ROLL: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){
            
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                System.out.println("YOU ROLLED "+ roll);
                total += roll;
                
            }
            System.out.println("TOTAL: "+total);

        }else{
            System.out.println("NUMBER OF DICE MUST BE GRATER THAN 0");
        }
    }

}
