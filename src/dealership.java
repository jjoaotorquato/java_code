import java.util.Scanner;

public class dealership {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    String[] brands = {"bmw","mercedes","audi"};
    String[][] bmwCars = {{"M5", "100000"},{"M4", "85000"},{"M3", "78000"}};
    String[][] mercdesCars = {{"AMG", "95000"},{"CLS", "87000"},{"GLK", "65000"}};
    String[][] audiCars = {{"R8", "120000"},{"RS4", "90000"},{"RS6", "93000"}};

    boolean running = true;
    System.out.println("1- see brands");
    System.out.println("2- see cars");
    System.out.println("3- exit");
    while(running){
        System.out.print("choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1 -> seeBrands(brands);
            case 2 -> seeCars(bmwCars, mercdesCars, audiCars);
            case 3 -> {
                running = false;
            }
        }

    }   
    }
    static void seeBrands(String[] brands){
    for(String brand : brands){
        System.out.println(brand);
    }
    }
    static void seeCars(String[][] bmwCasrs, String[][] mercedesCars, String[][] audiCars){
        System.out.print("wanna see bmw, mercedes or audi?: ");
        String choiceCar = scanner.nextLine();
            if(choiceCar.equalsIgnoreCase("bmw")){
                for(String[] car : bmwCasrs){
                    System.out.println(car[0] + " - $" + car[1]);
                }
            }else if(choiceCar.equalsIgnoreCase("mercedes")){
                for(String[] car : mercedesCars){
                    System.out.println(car[0] + " - $" + car[1]);
                }
            }else if(choiceCar.equalsIgnoreCase("audi")){
                for(String[] car : audiCars){
                    System.out.println(car[0] + " - $" + car[1]);
                }
            }else{
                System.out.println("not found");
            }

    }    
}