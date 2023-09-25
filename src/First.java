class FirstProcess extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("first run - Iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondProcess extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second run - Iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThirdProcess extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Third run - Iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class First {
    public static void main(String[] args) {
        FirstProcess run1 = new FirstProcess();
        SecondProcess run2 = new SecondProcess();
        ThirdProcess run3 = new ThirdProcess();

        Thread[] threads = { run1, run2, run3 };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All Done.");
    }
}