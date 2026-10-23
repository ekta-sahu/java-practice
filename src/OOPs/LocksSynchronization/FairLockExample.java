package OOPs.LocksSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Starvation : thread starvation is a situation in which a thread is unable to get sufficient CPU time or access
// to a required resource because other threads keep getting priority or access instead.
// fair thread prevents this situation.

public class FairLockExample {

    private final Lock fairLock = new ReentrantLock(true);

    public void accessResource(){
        fairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            fairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" lock released");
        }
    }

    public static void main(String[] args){
        UnfairLockExample example = new UnfairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1 = new Thread(task, " Thread 1");
        Thread t2 = new Thread(task, " Thread 2");
        Thread t3 = new Thread(task, " Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}