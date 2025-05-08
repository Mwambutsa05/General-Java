package Multithreads;

public class Main {
    public static void main(String[] args) {
          Thread t1 = new MyThread();
          t1.setName("Daryce");
//          Thread  t1 = new MyThread(() -> t1.run());
//          t1.start();
        t1.run();
    }
}

class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
