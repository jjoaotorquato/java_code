import java.util.HashSet;

public class duplicateArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,7,8,9,10};
        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for(int num : numbers ){
            if(!set.add(num)){
                System.out.println(num);
                duplicate = true;
                break;
            }
        }
        if(duplicate){
            System.out.println("have duplicate");
        }else{
            System.out.println("dont have duplicate");
        }
    }
}