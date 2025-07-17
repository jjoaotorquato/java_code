import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a; double b; double result = 0; char operator;

        System.out.print("A: ");
        a = scanner.nextDouble();
        System.out.print("B: ");
        b = scanner.nextDouble();
        System.out.print("OPERATION: ");
        operator = scanner.next().charAt(0);
        switch(operator){
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }
        System.out.println("RESULT: "+result);
        
    }
    
}
