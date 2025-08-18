package company;

public class Main {
    public static void main(String[] args) {
    
    Employee employee1 = new Employee();
    employee1.setName("bob");
    employee1.setSalary(4500);
    System.out.println(employee1);

    Manager manager1 = new Manager();
    manager1.setName("bob 2");
    manager1.setSalary(4500);
    manager1.setBonus(3500);
    System.out.println(manager1);
    }
}
