package JavaQuestions;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
         System.out.println("Enter your number:");
         Scanner scanner = new Scanner(System.in);

         int num = scanner.nextInt();

         if (num % 2 == 0){
             System.out.println("Your number is even");
         } else{
             System.out.println("Your Number is odd");
         }
         scanner.close();
    }
}
