package CodingTasks3;

public class BookClass {
    public String title;
    public String author;

    public static void main(String[] args) {
         BookClass book1 = new BookClass("Java Basics", "Elitebook");
         book1.displayInfo();
         BookClass book2 = new BookClass(null, null);
         book2.displayInfo();
    }

    public BookClass(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo(){
        if(title != null && author != null){
        System.out.println("Title: " + title +","+ " Author: " + author);
        }
        else{
            System.out.println("Title: Unknown, Author: Anonymous"  );
        }
    }
}
