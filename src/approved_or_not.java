import java.util.Scanner;

public class approved_or_not {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name; double grade; double media; double sum = 0;

        System.out.print("Name of Student: ");
        name = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(name + " GPA " + (i + 1) + ": ");
            grade = scanner.nextDouble();
            sum += grade;
        }

        media = sum/3;

        System.out.println("MEDIA: "+media);

        if(media >= 60){
            System.out.println("APROVED");
        }else{
            System.out.println("REPROVED");
        }
        scanner.close();
    }
}
