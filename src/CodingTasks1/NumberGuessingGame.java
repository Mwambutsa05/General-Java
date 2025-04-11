package CodingTasks;

import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = 30;
        System.out.println("Game start! Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        for (int trial = 1; trial <=5; trial++) {
           int guesses = scanner.nextInt();
           if(guesses > secretNumber){
               System.out.println(guesses + "is too high");
               System.out.println("Try another number");
           }
           else if (guesses < secretNumber) {
               System.out.println(guesses + "is too low");
               System.out.println("Try another number");
           }
           else {
               System.out.println(guesses + "is Correct");
               System.out.println("Congratulations! You've Guessed the number");
               break;
           }
        }
    }
}
