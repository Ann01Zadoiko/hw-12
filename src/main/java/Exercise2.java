import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exercise2 {

    public static synchronized void fizzbuzz(int n) throws InterruptedException {

            for (int i = 1; i <= n; i++) {

                if (i % 15 == 0) {
                    Thread.sleep(100);
                      new Thread(() -> System.out.print("fizzbuzz ")).start();

                } else if (i % 3 == 0) {
                    Thread.sleep(100);
                     new Thread(() -> System.out.print("fizz ")).start();

                } else if (i % 5 == 0) {
                    Thread.sleep(100);
                    new Thread(() -> System.out.print("buzz ")).start();

                } else {
                    Thread.sleep(100);
                    int finalI = i;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print(finalI + " ");
                        }
                    }).start();

                }
            }
        }
}
