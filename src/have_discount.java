import java.util.Scanner;
public class have_discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age; 
        boolean student; 
        String student_input; 
        double price = 10.00;
        double discount = 0;
        double final_price;
        double discount_value;


        System.out.println("How old are you?: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You are a student?: ");
        student_input = scanner.nextLine();
        student = student_input.equalsIgnoreCase("y");

        if(age <= 18 && student){
            System.out.println("Have 50% discount");
            discount = 0.50;
        }else if(age <=18 || age >=65 || student){
            System.out.println("Have 30% discount");
            discount = 0.30;
        }

        discount_value = price * discount;
        final_price = price - discount_value;

        System.out.println("Final price :"+final_price);


        scanner.close();
    }
    
}
