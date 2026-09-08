package OOPs.Vehicles;

// Final class - cannot be inherited ( extended )

public final class Car extends Vehicle{

    // Final Variable - value cannot be changed

    private final int speedLimit;

    // final variables can only be assigned value once

    public Car(){
        speedLimit = 200 ;
    }

    //final keyword cannot be used on constructors bcuz final is used in methods to prevent overriding,
    //but constructors are not overriden

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    // Final method - method cannot be overridden

    public final void airBags(){
        System.out.println(" 4 airbags");
    }
}
