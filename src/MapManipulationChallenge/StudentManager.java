package MapManipulationChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class StudentManager {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        try {
            addStudent(students, 1, "Mwambutsa");
            addStudent(students, 2, "Anne");
            addStudent(students, 3, "Chanelle");
            // Uncomment to test errors
            // addStudent(students, -1, "");
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nStudent List:");
        System.out.println(students);

        System.out.println("\nSorted List of Students:");
        sortStudents(students);

        System.out.println("\nSearch Student with ID 2:");
        searchStudents(students, 2);

        System.out.println("\nRemove Student with ID 1:");
        removeStudent(students, 1);

        System.out.println("\nFind Student with Highest ID:");
        findStudentWithHighestId(students);

        System.out.println("\nFind Student with Lowest ID:");
        findStudentWithLowestId(students);
    }

    public static void addStudent(Map<Integer, String> students, int studentId, String name) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID cannot be negative or zero!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty!");
        }

        students.put(studentId, name);
        System.out.println("Student added: ID = " + studentId + ", Name = " + name);
    }

    public static void sortStudents(Map<Integer, String> students) {
        System.out.println(new TreeMap<>(students));
    }

    public static void searchStudents(Map<Integer, String> students, int studentId) {
        if (students.containsKey(studentId)) {
            System.out.println("Found: ID = " + studentId + ", Name = " + students.get(studentId));
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public static void removeStudent(Map<Integer, String> students, int studentId) {
        if (students.containsKey(studentId)) {
            String removed = students.remove(studentId);
            System.out.println("Removed student: ID = " + studentId + ", Name = " + removed);
        } else {
            System.out.println("Cannot remove. Student with ID " + studentId + " does not exist.");
        }
    }

    public static void findStudentWithHighestId(Map<Integer, String> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        int maxId = Collections.max(students.keySet());
        System.out.println("Highest ID = " + maxId + ", Name = " + students.get(maxId));
    }

    public static void findStudentWithLowestId(Map<Integer, String> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        int minId = Collections.min(students.keySet());
        System.out.println("Lowest ID = " + minId + ", Name = " + students.get(minId));
    }
}
