public class PriorityExample {
    public static void main(String[] args) {
        Runnable r1 = ()-> System.out.println(Thread.currentThread().getName()) ;


        Thread thread1 = new Thread(r1 ,"karan");
        Thread thread2 = new Thread(  ()-> System.out.println(Thread.currentThread().getName()) ,"rohan");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

    }
}
