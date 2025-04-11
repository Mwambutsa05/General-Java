package JavaQuizes;

import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
         calculator();
         temperature();
         number();
        System.out.println(substract(10, 5));
        alarm();
        evenOrOdd();
    }
    public static void calculator(){
        double num= 42.5;
        System.out.println(num);
    }
    public static void temperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your temperature");
        int temp = scanner.nextInt();
        if (temp > 30){
            System.out.println("Hot");
        } else {
            System.out.println("Cold");
        }
    }
    public static void number(){
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
        }
    }
    public static int substract(int a, int b){
        return a-b;
    }
    public static void alarm(){
        int num = 4;
        int i = 0;
        while( i < num){
             num--;
            System.out.println("beep");
        }
    }
    public static void evenOrOdd(){
        Scanner even = new Scanner(System.in);
        System.out.println("please enter your number");
        int num = even.nextInt();
        if (num%2 == 0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
