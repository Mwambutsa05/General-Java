package CodingTasks2;
import java.util.Scanner;

public class PersonalATM {
    public double balance ;

    public static void main(String[] args) {
        PersonalATM atm = new PersonalATM(500);
        atm.deposit(600);
        atm.withdraw(200);
        atm.checkBalance();
    }

    public PersonalATM() {}

    public PersonalATM(double balance) {
        this.balance = balance;
    }

    public void deposit(double newBalance) {
        if (newBalance > this.balance) {
            balance = balance + newBalance;
            System.out.println("Your deposition was successfully! Your New Balance is:" + balance);
        }
        else {
            System.out.println("Your didn't make any deposition! Your Balance is" + balance );
        }
    }
    public void withdraw(double newBalance) {
        if (newBalance < this.balance) {
            balance =balance - newBalance;
            System.out.println("You've made a withdrawal! Your New Balance is:" + balance);
        }
        else{
            System.out.println("you didn't make any withdrawal! Your Balance is" + balance );
        }
    }
    public void checkBalance() {
            System.out.println("Your deposition was successfully! Your New Balance is:" + balance);
        }
    }

