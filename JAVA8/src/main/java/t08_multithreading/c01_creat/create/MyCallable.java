package t08_multithreading.c01_creat.create;

import java.util.concurrent.Callable;


public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    }
}
