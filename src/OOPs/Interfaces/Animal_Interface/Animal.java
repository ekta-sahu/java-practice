package OOPs.Interfaces.Animal_Interface;

public interface Animal {
    // An abstract class can have abstract methods as well as concrete methods.

    // Interface :- Blueprint for class , has abstract methods, static constants, static methods, default methods
    // static constants - final (cannot be changed , inherited , overridden) and static ( shared by all objects )
    // Implementation - Multiple inheritance and Abstraction

    int maxAge = 11;   // automated static constant final, static

    void eat() ;     // automated abstract methods

    void sleep() ;  // public access modifier is redundant

    // Static methods in interface - can be called thorough interface class only

    public static void info(){
        System.out.println("This is an Animal interface.");
    }

    // Default methods in interface - can be called through instance only,cannot be used by the interface class
    // "default" methods need not to be implemented through each implemented classes like abstract
    // each instance will inherit default method in inheritance

    public default void run(){
        this.eat();
        System.out.println("Animal is running.");
    }
}
