//package BufferReader;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Student {
//    public static void main(String[] args) {
//       String fileLocation = "C:\\Users\\Elitebook\\IdeaProjects\\JavaProjects\\src\\BufferReader\\Students.txt";
//
//       try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
//          String line;
//          while ((line = reader.readLine()) != null){
//              System.out.println(line);
//          }
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//
//       List<Student> students = new ArrayList<Student>();
//
//       students.add(new Student("Mwambutsa", "Daryce", 20));
//       students.add(new Student("Muhimpundu", "Anne", 20));
//       students.add(new Student("Ingabire", "Chanelle", 19));
//
//        fileLocation = "Students.txt";
//
//
//
//        try(BufferedWriter writer = new BufferedWriter(new fileWriter(fileLocation))){
//            System.out.println(students);
//            writer.write(students.toString());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
//    public String firstName;
//    public String lastName;
//    public int age;
//
//    public Student(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//}
