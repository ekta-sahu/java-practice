package OOPs.Multithreading;

public class ThreadMethods2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName()+" is running..");
            Thread.yield();
        }
//        try {
//            Thread.sleep(100);
//            System.out.println("Thread is Running..");
//        } catch (InterruptedException e) {
//            throw new RuntimeException("Thread is interrupted"+e);
//        }
    }

    public static void main(String[] args){
        ThreadMethods2 t2 = new ThreadMethods2();
        ThreadMethods2 t3 = new ThreadMethods2();
        t2.start();
        t3.start();
        t2.interrupt();
// interrupt yield setDaemon yield
// DAEMON THREADS - background threads
// USER THREADS - threads that user uses to perform tasks
    }
}
