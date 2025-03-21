


public class Java_DeadlockThreads {

	
	static final Object LOCK1 = new Object();
    static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK1) {
                System.out.println("Thread 1: Holding LOCK1...");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (LOCK2) { System.out.println("Thread 1: Holding LOCK2..."); }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LOCK2) {
                System.out.println("Thread 2: Holding LOCK2...");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (LOCK1) { System.out.println("Thread 2: Holding LOCK1..."); }
            }
        });

        t1.start();
        t2.start();
    }
}
