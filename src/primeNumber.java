import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num; int divisor = 0;

        System.out.print("NUMBER: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if(num %i == 0){
                divisor++;
            }
        }

        if(divisor == 2){
            System.out.println("THE NUMBER IS PRIME");
        }else{
            System.out.println("THE NUMBER NOT IS PRIME");
        }

    }
    
}