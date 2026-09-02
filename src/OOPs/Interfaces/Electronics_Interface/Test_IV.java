package OOPs.Interfaces.Electronics_Interface;

public class Test_IV {
    public static void main(String[] args){

        SmartPhone android1 = new SmartPhone() ;
        android1.makeCall(998140260);

        android1.endCall();

        SmartPhone iphone17 = new SmartPhone();
        iphone17.takePhoto();

        // Abstraction : has instance variables which needs to be initialized thorough constructors,
        // a class can only extend one abstract class
        // Interfaces : has static constants,a class can implement multiple interfaces
    }
}
