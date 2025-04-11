package JavaLists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
       TaskManager manage = new TaskManager();
       List<String> arrayList = new ArrayList<>();
       manage.addTask(arrayList, "task1");
       manage.addTask(arrayList, "task2");
        manage.sortTasks(arrayList);
        System.out.println("Sorted list: " + arrayList);
       manage.searchTask(arrayList, "task2");
       manage.removeTask(arrayList, "task2");
       manage.findLongestTask(arrayList);
       manage.getTasks(arrayList, 1);
    }
    public static void addTask(List<String> tasks, String task) {
        tasks.add(task);
        System.out.println("The ArrayList" + task);
    }
    public void sortTasks(List<String> tasks) {
        tasks.sort(null);
    }
    public static void searchTask(List<String> tasks, String target) {
        tasks.lastIndexOf(target);
        System.out.println(target);
    }
    public static void removeTask(List<String> tasks, String task) {
        tasks.remove(task);
        System.out.println(task);
    }
    public static void findLongestTask(List<String> tasks) {
         String longest = "";
         for (String task : tasks) {
             if (task.length() > longest.length()) {
                 longest = task;
             }
         }
        System.out.println(longest);
    }
    public static void getTasks(List<String> tasks, int index) {
        try{
            System.out.println(tasks.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("There is no task");
        }
    }

}
