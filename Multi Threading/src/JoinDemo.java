public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try { Thread.sleep(1000); }
                catch(Exception e){}
            }
        });
        t1.start();
        t1.join();
        System.out.println("Main continues after T1 finishes");
    }
}
