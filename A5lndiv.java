public class A5lndiv extends Thread 
{

    int startValue;
    static int maxDivCount = 0, num = 0;

    A5lndiv(int startValue) {
        this.startValue = startValue;
    }

    public static void main(String[] args) {
        A5lndiv t1 = new A5lndiv(1);
        A5lndiv t3 = new A5lndiv(1000);
        A5lndiv t2 = new A5lndiv(2000);
        A5lndiv t4 = new A5lndiv(3000);
        A5lndiv t5 = new A5lndiv(4000);
        A5lndiv t6 = new A5lndiv(5000);
        A5lndiv t7 = new A5lndiv(6000);
        A5lndiv t8 = new A5lndiv(7000);
        A5lndiv t9 = new A5lndiv(8000);
        A5lndiv t10 = new A5lndiv(9000);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        } catch (Exception e) {
        }
        System.out.println("Number is " + num + " and largest number of divisors are " + maxDivCount);
    }

    public void run() {
        int div = 0;
        for (int i = this.startValue; i <= this.startValue + 1000; i++) {
            div = 0;
            for (int j = 1; j < 100000; j++) {
                if (i % j == 0) {
                    div += 1;
                }

            }
            if (div > maxDivCount) {
                maxDivCount = div;
                num = i;
            }
        }
    }
}