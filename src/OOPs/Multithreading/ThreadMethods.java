package OOPs.Multithreading;

public class ThreadMethods extends Thread{
    public ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <5; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ " priority: "+Thread.currentThread().getPriority()+" count: "+ i);
        }
//        for (int i = 0; i < 5; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods("Ekta");
        ThreadMethods l = new ThreadMethods("Low Priority Thread");
        ThreadMethods m = new ThreadMethods("Medium Priority Thread");
        ThreadMethods h = new ThreadMethods("High Priority Thread");
        l.setPriority(MAX_PRIORITY);
        m.setPriority(NORM_PRIORITY);
        h.setPriority(MIN_PRIORITY);
        l.start();
        m.start();
        h.start();
        //t1.start();
        t1.join();

        // start run sleep join setPriority
    }
}
