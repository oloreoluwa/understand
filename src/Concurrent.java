import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Concurrent {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();


        Future<Integer> future = executor.submit(() -> {

            Thread.sleep(2000);
            return 42;
        });



        try {

            int result = future.get();


            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }


        executor.shutdown();
    }
}
