package OOPs.InnerClass.MemberInnerClass;

public class Car1 {

    // Without inner class

    private String model ;

    private  boolean isEngineOn ;

    public Car1 ( String model){
        this.model = model ;
        this.isEngineOn = false ;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isEngineOn() {
        return this.isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.isEngineOn = engineOn;
    }
}
