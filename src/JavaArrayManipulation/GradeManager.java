package JavaArrayManipulation;

import java.util.Arrays;

public class GradeManager {
    public static void main(String[] args) {
        GradeManager student1 = new GradeManager();
        int[] grades = {60, 10, 50, 80, 99, 90};
        System.out.println("The Grades in ascending order is:");
        student1.sortGrades(grades);
        student1.searchGrades(grades, 10);
        student1.calculateAverage(grades);
        student1.findHighestGrade(grades);
        student1.findLowestGrade(grades);
    }
    public static void sortGrades(int[] grades) {
        Arrays.sort(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }
    public static void searchGrades(int[] grades, int target) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                System.out.println(grades[i]);
            }
        }
    }
    public static void calculateAverage(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double average = sum / grades.length;
        try{
            average = average / grades[0];
        }
        catch(Exception e){
            System.out.println("The average is incorrect");
        }
        finally {
            System.out.println("It's still an average");
        }
        if (average < 0){
            throw new IllegalArgumentException("The average is invalid");
        }
        System.out.println("The average is: " + average);
    }
    public static void findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] > highest) {
                highest = grades[i];
            }
        }
        System.out.println("the Highest Grade is: " + highest);
    }
    public static void findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        System.out.println("the Lowest Grade is: " + lowest);
    }
}
