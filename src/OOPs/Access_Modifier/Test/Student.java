package OOPs.Access_Modifier.Test;

public class Student {

    // Static :- makes a member belong to the class itself, rather than to individual objects (instances) of the class.
    // It does not create an object,and does not require an object to be called.
    // Static method cannot use non-static data member or call non-static method directly
    // this and super 'cannot' be used in static context

    static{
        System.out.println("Hello"); // used for one time setup task
    }
    // (imp) whenever Student class will be loaded in memory ,static block will run

    public static String School = "DPS";
    public int count = 0 ;

    public Student(){
        count++;
    }

    private String name ;

    private int age ;

    private int rollNUmber ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNUmber() {
        return rollNUmber;
    }

    public void setRollNUmber(int rollNUmber) {
        this.rollNUmber = rollNUmber;
    }

    public static void getSchool(){
        System.out.println("School of all Student : "+ School);
    }

}
