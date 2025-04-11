package CodingTasks;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        convertCelsiusToFahrenheit();
    }

    public static void convertCelsiusToFahrenheit(){

        System.out.println("Please Enter your Temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        float fahrenheit = (float) (celsius * (float) 9 / 5) +  (float) 32;

          if (celsius < 0){
              System.out.println("Enter a celsius Above 0");
          } else{
              System.out.println(celsius+"° c" + " is " + fahrenheit +"° F");
          }

    }
}
