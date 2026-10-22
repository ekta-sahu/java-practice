package OOPs.Multithreading;

// Use Runnable method to create a new thread when a class is already extending another class
public class World2 implements Runnable {
    @Override
    public void run() {
        for ( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
