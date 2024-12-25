
package Java.Thread;


class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Runnable Thread Interrupted");
            }
        }
    }
}

public class BaiscThreadInterface {
    public static void main(String[] args) {
        MyTask task = new MyTask();      // Create a Runnable object
        Thread thread = new Thread(task); // Create a Thread and pass Runnable
        thread.start();                 // Start the thread

        System.out.println("Main Thread is running...");
    }
}
