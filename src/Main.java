public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("T1"));
        Thread t2 = new Thread(() -> System.out.println("T2"));
        Thread t3 = new Thread(() -> System.out.println("T3"));

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}