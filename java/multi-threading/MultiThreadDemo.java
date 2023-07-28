// package java.multi-threading;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("one");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");

        //  start the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            //  wait for other threads to end
            Thread.sleep(10000);
        }   catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main Thread Exiting.");
    }
}

//  Create multiple threads
class NewThread implements Runnable {
    String name;    //  name of thread
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    //  This is the entry point for thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }   catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting");
    }
}
