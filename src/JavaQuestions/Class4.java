package JavaQuestions;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        repeatMsg();
    }

    public static void repeatMsg(){
        System.out.println("enter your message");
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.next();
        int times = 3;
        for (int i = 0; i <times; i++) {
            System.out.println(msg);
        }
    }
}
