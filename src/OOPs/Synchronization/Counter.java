package OOPs.Synchronization;

//Synchronization : is a mechanism used to control access to shared resources by multiple
// threads, ensuring that only one thread at a time can execute a synchronized section protected by the same lock.

public class Counter {

    private int count = 0;

// synchronized keyword : written in critical section/method to achieve mutual exclusion

    public void increment(){ //public synchronized void increment()
        synchronized (this){ //here this indicates one instance(only one thread can access)
            count++;}
    }

    public int getCount() {
        return count;
    }
}

// synchronized instances, synchronized blocks, synchronized methods