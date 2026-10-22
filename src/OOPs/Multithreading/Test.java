package OOPs.Multithreading;

// Life Cycle of Thread:
// NEW -> RUNNABLE -> RUNNING -> BLOCKED/WAITING -> TERMINATED

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        World world = new World();
        world.start(); // initiate new thread

        World2 world2 = new World2(); // NEW
        Thread t2 = new Thread(world2);
        t2.start(); // RUNNABLE

        for ( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }


}
