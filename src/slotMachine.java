import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    static Scanner scanner = new Scanner(System.in);
    @SuppressWarnings("unused")
    static Random random = new Random();
    public static void main(String[] args) {
        int[] figures = {1,2,3,4,5};
        System.out.println("machine figures: 1,2,3,4,5");
        System.out.println("2 equal figures = + 50$");
        System.out.println("3 equal figures = + 100$");
        int totalMoney = 0;
        boolean running = true;
        while(running){
            String choice;
            System.out.print("wanna play? y/n: ");
            choice = scanner.nextLine();
            switch(choice){
                case "y" ->{
                    int[] result = getFigure(figures);
                    System.out.println("Result: " + Arrays.toString(result));
                    int moneyChange = winCondition(result);
                    totalMoney += moneyChange;
                    if (moneyChange > 0) {
                        System.out.println("you won: "+moneyChange);
                    } else {
                        System.out.println("you lost: "+(-moneyChange));
                    }
                    System.out.println("balance: " + totalMoney);
                    if (totalMoney < -500) {
                        System.out.println("balance too low");
                        running = false;
                    }
                }
                case "n" ->{
                    running = false;
                }
            }
        }
    }
    public static int[] getFigure(int[] figuresR){
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
         int randonFig = new Random().nextInt(figuresR.length);
         result[i] = figuresR[randonFig];  
        }
        return result;        
    }
    public static int winCondition(int[] result){
        if(result[0]==result[1]&& result[1]==result[2]){
            return 100;
        }else if(result[0] == result[1] || result[0] == result[2] || result[1] == result[2]){
            return 50;
        }else{
            return -50;
        }
    }
}
