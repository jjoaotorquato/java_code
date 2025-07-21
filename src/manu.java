import java.util.Scanner;

public class manu {
    static String[] itens = {"pizza", "hamburger", "soda"};
    static double[] price = {35.0, 15.0, 5.0};
    static int[] request = new int[10];
    static int requestCount = 0;
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenuOptions(); 
            choice = scanner.nextInt(); 
            switch (choice) {
                case 1 -> showItems();
                case 2 -> makeOrder(scanner);
                case 3 -> showOrder();
                case 0 -> System.out.println("CLOSING SYSTEM.");
                default -> System.out.println("INVALID OPTION.");
            }

        } while (choice != 0);

        scanner.close();
    }
    public static void showMenuOptions() {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - SHOW MENU");
        System.out.println("2 - MAKE ORDER");
        System.out.println("3 - SHOW ORDER");
        System.out.println("0 - EXIT");
        System.out.print("Enter your choice: ");
    }
    public static void showItems() {
        System.out.println("\n=== MENU ITEMS ===");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + " - " + itens[i] + " | PRICE: $" + price[i]);
        }
    }
    public static void makeOrder(Scanner scanner) {
        showItems();
        System.out.print("Enter item number to order: ");
        int item = scanner.nextInt();

        if (item >= 1 && item <= itens.length) {
            if (requestCount < request.length) {
                request[requestCount] = item - 1;
                requestCount++;
                System.out.println("Item added!");
            } else {
                System.out.println("Your order is full!");
            }
        } else {
            System.out.println("Invalid item.");
        }
    }
    public static void showOrder() {
        System.out.println("\n=== YOUR ORDER ===");
        double total = 0;

        if (requestCount == 0) {
            System.out.println("Your order is empty.");
        } else {
            for (int i = 0; i < requestCount; i++) {
                int index = request[i];
                System.out.println(itens[index] + " - $" + price[index]);
                total += price[index];
            }
            System.out.println("TOTAL: $" + total);
        }
    }
}