public class ThredNameExample   {
    Runnable r1 = () -> System.out.println(Thread.currentThread().getName() + " is running");

    public static void main(String[] args) {
        ThredNameExample tname = new ThredNameExample();
        Runnable task = () -> System.out.println("Running in: " + Thread.currentThread().getName());

      Thread thread = new Thread(tname.r1 );
      Thread thread2 = new Thread(task);
      thread2.start();
      thread.setName("karan");
      thread.start();

    }
}

