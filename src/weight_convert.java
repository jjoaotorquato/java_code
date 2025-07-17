import java.util.Scanner;
public class weight_convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight; double new_weight;
        int choice;

        System.out.print("Your weight: ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("KGS TO LBS PRESS 1");
        System.out.println("LBS TO KGS PRESS 2");
        choice = scanner.nextInt();

        if(choice == 1){
            new_weight = weight * 2.20462;
            System.out.println("Weight in pounds: " + new_weight);
        }else if(choice == 2){
            new_weight = weight * 0.45392;
            System.out.println("Weight in kilograms: " + new_weight);
        }
    }
}
