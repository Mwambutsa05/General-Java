package JavaQuizes;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
           int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("this is an error");
        }
        finally {
            System.out.println("can not divide by zero");
        }
        System.out.println("The can continues to run");
    }
}
