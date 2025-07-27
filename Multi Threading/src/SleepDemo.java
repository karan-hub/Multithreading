
    class sleepDemo {
        public static void main(String[] args) throws InterruptedException {
            Thread t = new Thread(() -> {
                for(int i=1; i<=3; i++){
                    System.out.println(Thread.currentThread().getName() + " count: " + i);
                    try { Thread.sleep(10000);  }
                    catch(Exception e){}
                }
            });
            t.start();
        }
    }


