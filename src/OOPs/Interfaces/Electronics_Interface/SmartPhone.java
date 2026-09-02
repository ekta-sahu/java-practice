package OOPs.Interfaces.Electronics_Interface;

public class SmartPhone implements Phone, Camera, Music_Player {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo via smartphone");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking video via smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music via smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping to play music via smartphone");
    }

    @Override
    public void makeCall(long num) {
        System.out.println( "Calling " + num + "..");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call..");
    }
// Interfaces supports multiple inheritance.

}
