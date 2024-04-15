package lesson20240415;

public class ThreadExamples {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Action");
                System.out.println(Thread.currentThread());

                try {
                    Thread.sleep(100_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
//        thread.run();
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        try {
            Thread.sleep(100_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
