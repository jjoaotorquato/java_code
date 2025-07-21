
import java.util.Scanner;

public class quiz {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        String[] qustions = {"what is the main function of a router?", 
                             "which part of computer is considered the brain?",
                             "what year facebook launched?",
                             "who is the father of computer?",
                             "what is the first programing lenguage?"};
        
        String[][] options = {{"1- storing files", "2- encrypiting data","3- directing internet","4- maging pass"},
                              {"1- CPU","2- hard drive","3-ram","4-gpu"},
                              {"1- 2000","2- 2004","3-2006","4-2008"},
                              {"1- steve jobs","2- bill gates","3-alan turing","4- charles babbege"},
                              {"1- cobol","2- C","3- fortran","4- assembly"}};
                              
    int[] answers = {3,1,2,4,3};
    int score = 0; int guess;

    Scanner scanner = new Scanner(System.in);                      

    System.out.println("===QUIZ GAME===");

    for(int i = 0; i < qustions.length; i++) {
        System.out.println(qustions[i]);
        
        for(String option : options[i]){
            System.out.println(option);
        }

        System.out.print("enter guess: ");
        guess = scanner.nextInt();

        if(guess == answers[i]){
            System.out.println("correct");
            score++;
        }else{
            System.out.println("wrong");
        }
    }
    System.out.println("final score: "+score);

    scanner.close();
    }
}
