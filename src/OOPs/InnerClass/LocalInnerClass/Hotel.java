package OOPs.InnerClass.LocalInnerClass;

public class Hotel {

    //Local Inner Class : a class that is declared inside a method, constructor, or block of another class.
    //It is called local because its scope is limited to that particular method/block.

    private String name;

    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator{
            boolean validate(){
                if (guestName == null || guestName.isBlank()){
                    System.out.println("Invalid guest name!");
                    return false;
                }
                if (numOfRooms < 0){
                    System.out.println("Invalid number of rooms!");
                    return false;
                }
                if (reservedRooms  + numOfRooms >= totalRooms){
                    System.out.println("Rooms not available.");
                    return false;
                }
                else{
                    return true;
                }
            }
        }

        ReservationValidator validator= new ReservationValidator();
        if (validator.validate()){
            System.out.println(numOfRooms+" rooms booked for "+guestName);
        }else{
            System.out.println("Reservation failed");
        }
    }
}
