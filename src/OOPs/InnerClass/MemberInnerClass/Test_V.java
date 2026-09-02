package OOPs.InnerClass.MemberInnerClass;

public class Test_V {
    public static void main(String[] args) {

        // Member inner class
        Car car = new Car("Ferrari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        //Without Member inner class
        Car1 car1 = new Car1("Buggati");
        Engine1 engine1 = new Engine1(car1);
        engine1.start();
        engine1.stop();
    }
}
