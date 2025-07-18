
import java.util.Scanner;

public class calcMethods {
    
    public static double add(double a, double b){
        return a + b;
    }
    public static double subtrac(double a, double b){
        return a - b;
    }
    public static double multiply(double a,double b){
        return a * b;
    }
    public static double divide(double a,double b){
        if(b == 0){
            System.out.println("CANT DIVIDE BY ZER0!!!");
        }
        return a / b;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 , num2; char operator; double result = 0;

        System.out.print("NUM1: ");
        num1 = scanner.nextDouble();
        System.out.print("PERATION: ");
        operator = scanner.next().charAt(0);
        System.out.print("NUM2: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = add(num1, num2);
            case '-' -> result = subtrac(num1, num2);
            case '*' -> result = multiply(num1, num2);
            case '/' -> result = divide(num1, num2);
            default -> System.out.println("INVALID");
        }
        System.out.println(result);
        scanner.close();        
    }
}
