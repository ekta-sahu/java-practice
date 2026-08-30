package OOPs.Test;

public class Student {
    //properties/instance variables & behavior
    // local variable : declared inside a method (method)
    // instance variable : declared inside a class but outside a method (object)

    // properties - variables
    // behavior - methods

    //A constructor is a special method in Java that is automatically called when an object is created. It is used to initialize the object's data.
    // constructor has the same name as the class , it has not return type

    // Encapsulation : wrapping data and the methods that operate on that data into one class, while controlling direct access to the data.

        // instance variables

    private String name ;
    private int age ;
    private  int standard ;

        // getters and setters

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
        if (age < 0) {
            System.out.println("Invalid age");
        } else{
            this.age = age;             // this. - current instance
        }
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}