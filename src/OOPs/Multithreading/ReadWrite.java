package OOPs.Multithreading;

// ReadWriteLock : ReadWriteLock is a locking mechanism that allows multiple
// threads to read shared data simultaneously but allows only one thread to write at a time.
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
}
