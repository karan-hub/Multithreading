public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for(int i=1; i<=3; i++){
                System.out.println(Thread.currentThread().getName() + " running " + i);
                Thread.yield();
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t1.join();
        t2.start();
    }
}
