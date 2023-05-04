import java.util.concurrent.*;

public class FixedThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            MyThread t1 = new MyThread();
            executor.execute(t1);
        }
        System.out.println("Max number: " + executor.getMaximumPoolSize() + "");//  line 2
        executor.shutdown();
    }
}

class MyThread implements Runnable {

    MyThread() {
        System.out.println("New thread is created.");   //  line 1
    }

    @Override
    public void run() {

        try {
            System.out.println("Am from mytread...");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}