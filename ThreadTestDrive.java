class MyRunnable implements Runnable {

    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

public class ThreadTestDrive {
    
    public static void main(String[] args) {
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("back in main");
    }
}
