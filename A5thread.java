public class A5thread extends Thread {
    public static void main(String[] args) {

        A5thread t = new countingThread();
        t.start();

    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                if (i % 10 == 0) {
                    System.out.println("Some String" + i);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

}
