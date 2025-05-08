
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLFetcherThread implements Runnable {
    public static void main(String[] args) {
        URLFetcherThread thread1 =new URLFetcherThread("https://www.example.com");
        URLFetcherThread thread2 =new URLFetcherThread("https://www.android.com/");

        Thread t1 = new Thread(thread1);
        t1.setName("Example link1");
        Thread t2 = new Thread(thread2);
        t2.setName("android");
        t1.start();
        t2.start();
        System.out.println("Main thread continues processing...");
    }

    private String urlstring;

    public URLFetcherThread(String urlstring) {
        this.urlstring = urlstring;
    }

    @Override
    public void run() {
        String threadname = Thread.currentThread().getName();

        try {
            URL url = new URL(urlstring);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                System.out.println("thread"+ " " + threadname+ lines);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("one thread finished processing...");
        }


    }
}
