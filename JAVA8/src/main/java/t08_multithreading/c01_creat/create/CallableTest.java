package t08_multithreading.c01_creat.create;

import java.util.concurrent.Callable;


public class CallableTest {

    public static void main(String[] args) {
        final int n = 10;
        // anonymous class
        Callable<Integer> sumTask = new Callable<Integer>() {
            @Override
            public Integer call() {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        try {
            // have return value
            Integer call = sumTask.call();
            System.out.println(call);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }
}
