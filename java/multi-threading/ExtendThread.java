// package java.multi-threading;

public class ExtendThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); //  create a new thread

        nt.start(); //  start the thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }   catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exiting.");
    }
}

//  Create a second thread by extending Thread
class NewThread extends Thread {

    NewThread() {
        //  Create a new, second thread
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    //  This is the entry point for the seond thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}