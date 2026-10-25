package JavaMultiThreadingFolder.MakingBasicThread;



public class ThreadUsingRunnableOnly4 {
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from A");
                System.out.println("Hello from B");
            }
        };

        Thread t = new Thread(task);
        t.start();
    }
}

