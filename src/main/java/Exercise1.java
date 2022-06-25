import java.time.LocalTime;
import java.util.Timer;

public class Exercise1 {

    public static void main(String[] args) throws InterruptedException {
        showTime();
        Thread.sleep(5000);
        showEveryFiveSeconds();
    }

    private static void showEveryFiveSeconds() {
        new Thread(new Runnable() {
            final Thread thread = Thread.currentThread();
            public void run() {
                while (!thread.isInterrupted()){

                    System.out.println("Прошло 5 секунд");
                    threadSleep(thread,5000);
                }
            }
        }).start();
    }

    private static void showTime() {
        new Thread(new Runnable() {
            final Thread thread = Thread.currentThread();
            public void run() {
                while (!thread.isInterrupted()){
                    threadSleep(thread,1000);
                    System.out.println(LocalTime.now());

                }
            }
        }).start();
    }

    private static void threadSleep(Thread thread, int i){
        try {
            thread.sleep(i);
        } catch (InterruptedException e){
            System.out.println(Thread.currentThread());
        }
    }
}
