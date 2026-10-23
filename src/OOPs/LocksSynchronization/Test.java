package OOPs.LocksSynchronization;

// locks : locks are mechanisms that control access to shared resources in multithreaded programs. They help prevent multiple
// threads from modifying the same data simultaneously and causing race conditions.

// Lock is an interface, we use it using an object by implementing a class

// Types :
// 1.Intrinsic lock (monitor lock)- Every Java object has an intrinsic monitor lock. The synchronized keyword uses this lock.
// 2.Explicit locks (Lock interface)-Java also provides explicit locks through the java.util.concurrent.locks package, such as ReentrantLock.
// implicit/ automated locks are built in and are not seen, they are also in objects,methods etc.
public class Test {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
