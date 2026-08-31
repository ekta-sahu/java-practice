package OOPs.Test;

import OOPs.Animal.Animal;
import OOPs.Animal.Cat;
import OOPs.Animal.Dog;

public class Test_I {

    //Polymorphism :- (many forms) method performs different task based on the object
    // compile time polymorphism - method overloading
    // runtime polymorphism - method overriding / Dynamic method dispatch

    // Compile time Polymorphism

    public int add(int a , int b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b + c;
    }

    public double add( double a,double b){
        return a + b;
    }

    public static void main(String[] args){

        Test_I cal = new Test_I();
        System.out.println(cal.add(10,15));
        System.out.println(cal.add(10,5,10));
        System.out.println(cal.add(10.0, 5.0));

        // Run time Polymorphism / Dynamic Method Dispatch

        Animal a = new Animal();
        a.sayHello();

        Animal d = new Dog(); //upcasting
        d.sayHello();

        Cat c = new Cat(); // since the reference is Animal class,  c can only access methods from Animal class
        c.sayHello();

        Dog newDog = (Dog) d; //downcasting

        double x = 133.435;
        int y = (int) x;
    }
}
