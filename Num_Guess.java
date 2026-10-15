

import java.util.*;
public class Num_Guess{
public static void main(String[] args) {
        int maxrange = 100;
        int minrange = 1;
        int MaxAttempt= 5;
        boolean hasWon = false;
        Scanner sc = new Scanner(System.in);
        Random Rn = new Random();
        int target = Rn.nextInt((maxrange - minrange)+1);
        System.out.println(target);
        int attemptTaken = 0;
        System.out.println("you have "+ MaxAttempt + "to guess the number");
        while(attemptTaken < MaxAttempt){
            attemptTaken++;
            System.out.print("Attempt " + attemptTaken + "/" + MaxAttempt + " - Enter your guess: ");
            if(!sc.hasNextInt()){
                System.out.println("Invalid input! Please enter a whole number.\n");
                sc.next(); 
                attemptTaken--; 
                continue;
            }
            int userGuess = sc.nextInt();
            if(userGuess == target){
                hasWon = true;
                break;
            }
            if(userGuess < target){
                System.out.println("It is too low! Try a higher number");

            }
            else{
                System.out.println("It is too high ! Try a low number");
            }
        }
         System.out.println("─────────────── GAME OVER ───────────────");
        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + attemptTaken + " attempts.");
        } else {
            System.out.println("You've run out of attempts. The correct number was: " + target);
        }
        System.out.println("─────────────────────────────────────────");
        sc.close();
    }
}