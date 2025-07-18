import java.util.Scanner;

public class delta {
    public static double deltaCalc(double a, double b, double c){
        return b * b - 4 * a * c;
    }
    public static double root1(double a,double b,double delta){
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public static double root2(double a,double b,double delta){
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("COEFFICIENT A: ");
        a = scanner.nextDouble();
        System.out.print("COEFFICIENT B: ");
        b = scanner.nextDouble();
        System.out.print("COEFFICIENT C: ");
        c = scanner.nextDouble();

        double delta = deltaCalc(a, b, c);
        System.out.println("DELTA: "+delta);

        if (delta > 0) {
            double x1 = root1(a, b, delta);
            double x2 = root2(a, b, delta);
            System.out.println("TWO REAL ROOTS:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("ONE REAL ROOT:");
            System.out.println("x = " + x);
        } else {
            System.out.println("NO REAL ROOTS");
        }

        scanner.close();
    }
}
