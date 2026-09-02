package OOPs.InnerClass.MemberInnerClass;

public class Car {

    // Inner class :- inner class is a class that is declared inside another class or interface.

    // Member (Regular) inner class - A member inner class is declared directly inside another class, outside any method.
    private String model ;

    private boolean isEngineOn ;

    public Car( String model){
        this.model = model ;
        this.isEngineOn = false ;
    }

    class Engine {

        void start(){
            if (!isEngineOn){
                isEngineOn = true ;
                System.out.println(model + " engine started.");
            }else{
                System.out.println(model + " engine is already on.");
            }
        }

        void stop(){
            if (isEngineOn){
                isEngineOn = false ;
                System.out.println(model + " engine turned off.");
            }else{
                System.out.println(model + " engine is already turned off.");
            }
        }
    }

}
