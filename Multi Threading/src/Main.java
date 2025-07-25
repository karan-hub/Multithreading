//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        THred Clss
//        ThredClassDemo demo = new ThredClassDemo();
//         demo.start();
//        for (int i = 0; i <10; i++) {
//            System.out.println("main");
//        }

//        Runnable Interface
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread= new Thread(runnableDemo);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main th");
        }
        }
    }
