package OOPs.LocksSynchronization;

// Types of lock statements:
// lock(), trylock(), trylock(time), unlock()
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private final Lock lock = new ReentrantLock();

    private int balance = 100;

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawn " + amount);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " invalid amount :" + amount);
                }
            }else {
                System.out.println(Thread.currentThread().getName()+" could not acquire lock,we will proceed later.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }if (Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName()+" is interrupted");
        }
    }
}

