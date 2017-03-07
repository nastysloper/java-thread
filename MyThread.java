public class MyThread extends Thread {

    public void run() {
        for (int count = 1, row = 1; row < 20; row++, count++) {
           for (int j = 0; j < count; j++) {
               System.out.println("*");
           }
           System.out.println('\n');
        }
    }
}
