package OOPs.Abstraction;

public  abstract  class Animal_I {

    // Abstraction : hiding the internal implementation details and showing only the essential features
    // object for an abstract class can not be created, but it can be used as a reference class to create child object

    //Encapsulation → How to protect data
    // Abstraction → What to show, what to hide

    // Abstract method : without body
    // Concrete method : with body

    public  abstract void sayHello();

    private String name ;

    private int age ;

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

}
