package OOPs.InnerClass.MemberInnerClass;

public class Engine1 {

    private Car1 car ;

    public Engine1 (Car1 car){
        this.car = car ;
    }

    public void start(){
        if (!car.isEngineOn()){
            car.setEngineOn(true);
            System.out.println(car.getModel()+" engine started.");
        }else{
            System.out.println(car.getModel()+" engine is already on.");
        }

    }

    public void stop(){
        if (car.isEngineOn()){
            car.setEngineOn(false);
            System.out.println(car.getModel()+" engine turned off.");
        }else{
            System.out.println(car.getModel()+" engine is already off.");
        }
    }
}
