public class SimpleThread implements Runnable {
    
    public static void main(String[] args) {
        SimpleThread runner = new SimpleThread();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Alpha Thread");
        beta.setName("Beta Thread");
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 12; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
