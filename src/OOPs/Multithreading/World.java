package OOPs.Multithreading;

// to create a new thread other than main

public class World extends Thread{
    @Override
    public void run() {
        for ( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
