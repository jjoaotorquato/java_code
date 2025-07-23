import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArraysUso {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = {1,2,3,4,5,5,2};
    System.out.println("1- duplicate");
    System.out.println("2- list");
    System.out.println("3- max/min");
    System.out.println("4- order");
    System.out.println("5- exit");
    boolean run = true;
    while(run){
        System.out.print("choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1 -> duplicate(array);
            case 2 -> list(array);
            case 3 -> max(array);
            case 4 -> order(array);
            case 5 ->{
                run = false;
            }
        }
    }
    }
    static void duplicate(int [] array){
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        int totalDuplicate = 0;
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
                System.out.println("duplicate: "+array[i]);
                totalDuplicate++;
            }else{
                set.add(array[i]);
            }
        }
        if(hasDuplicate){
            System.out.println("no duplicate");
        }
        System.out.println("total duplicate: "+totalDuplicate);
    }
    static void list(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static void max(int [] array){
        int max = array[0];
        int min = array[0];
        for(int num : array){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
    static void order(int [] array){
        Arrays.sort(array);
        System.out.println("order: "+Arrays.toString(array));
    }
}
