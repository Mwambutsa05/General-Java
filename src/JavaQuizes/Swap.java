package JavaQuizes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//public class Swap {
//    public static <T> void swapElements(List<T>list ,int i1,int i2) {
//        T temp = list.get(i1);
//        list.set(i1, list.get(i2));
//        list.set(i2, temp);
//    }
//
//    public static void main(String[] args) {
//        List<Integer>numbers = Arrays.asList(1, 2);
//       System.out.println("numbers before swap: " + numbers);
//        swapElements(numbers, 0 , 1);
//        System.out.println("numbers after swap: " + numbers);
//   }
//}

//    class Box<T>{
//        public T age;
//
//        public void setAge(T age) {
//            this.age = age;
//        }
//
//        public T getAge() {
//            return age;
//        }
//
//        public static void main(String[] args) {
//            Box <Integer> age1 = new Box<>();
//            age1.setAge(18);
//            System.out.println(age1.getAge());
//
//            Box <String> age2 = new Box<>();
//            age2.setAge("Eighteen");
//            System.out.println(age2.getAge());
//        }
//    }

//class Muttable{
//    public static void main(String[] args) {
//        List<String> fruits = List.of("apple", "banana", "cherry");
//        System.out.println(fruits);
//    }
//}

//interface Add{
//    public int sum(int a, int b);
//}
//
//class lambda{
//    public static void main(String[] args) {
//        Add sum1 = (a, b) -> a + b;
//        System.out.println(sum1.sum(2,4));
//    }
//}

//Implement the Runnable interface using a lambda expression.
//The run() method in your lambda should print the message "Lambda Runnable is running!" to the console.


//interface LambdaS{
//    public String run(String s);
//}
//class Lambda2{
//    public static void main(String[] args) {
//        LambdaS str = (s) -> s;
//        System.out.println(str.run("Lambda Runnable is running!"));
//    }
//}
//interface Names{
//    public String run(String n1, String n2);
//}
// class Main {
//    public static void main(String[] args) {
//
//        Names compare = (n1, n2) ->
//                n1.equals(n2) ? "Same" : "Different";
//
//        System.out.println(compare.run("Daryce", "Ineza"));       // Different
//
//    }
//}

//Given a List<Integer> named numbers, write a Java Stream pipeline using the filter() operation
//and a lambda expression to create a new list containing only the numbers greater than 10 from the original list.

//class Streams{
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(27, 80, 4, 10, 20, 30, 29, 89, 9, 50);
//        List<Integer> sorted = numbers.stream().filter(number -> number < 10).collect(Collectors.toList());
//        System.out.println(sorted);
//    }
//}

//You have a List<String> called words. Use a Java Stream pipeline with the map() operation and
//a method reference to convert each string in the list to uppercase and collect the results into a new List<String>.
//Use String::toUpperCase as your method reference.

//class Lists{
//    public static void main(String[] args) {
//        List<String> words = Arrays.asList("Ineza" , "Mwambutsa", "Daryce");
//        List<String> upperCaseWords = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
//        System.out.println(upperCaseWords);
//    }
//}
