package OOPs.LocksSynchronization.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Dead Lock : Deadlock is a condition in multithreading where two or more
// threads wait indefinitely for locks held by one another, preventing further execution.

// Through ReentrantLock , deadlocks can be prevented, as lock is counted and paired with an unlock.
// ReentrantLock reenters the lock and continues the execution.

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock(); // lock.lockInterruptabley() : allows lock to be interrupted after lock
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){

        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
