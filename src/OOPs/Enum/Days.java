package OOPs.Enum;

public enum Days {

    // Enum : enum (enumeration) is a special type used to represent a fixed set of constants.
    // Enum constants are implicitly public, static, and final.
    // Enums can have constructors, variables, and methods.

    SUNDAY("Sunday") , MONDAY("Monday") , TUESDAY("Tuesday") , WEDNESDAY("Wednesday") ,
    THURSDAY("Thursday") , FRIDAY("Friday") , SATURDAY("Saturday") ;

    private Days(String lower){
        System.out.println("Constructor called");
        this.lower = lower ;
    }

    public String getLower() {
        return lower;
    }

    private String lower;

    public void day(){
        System.out.println("Today is :" + this.name());
    }
}
