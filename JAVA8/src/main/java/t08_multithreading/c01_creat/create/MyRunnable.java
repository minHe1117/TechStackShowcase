package t08_multithreading.c01_creat.create;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}
