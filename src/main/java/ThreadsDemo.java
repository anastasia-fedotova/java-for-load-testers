public class ThreadsDemo {
    public static void main(String[] args) {
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();

        while (true) {
            System.out.println("main");
        }
    }
}

class Worker implements Runnable {
    private static int current = 0;
    private int id;

    public Worker() {
        id = current++;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
