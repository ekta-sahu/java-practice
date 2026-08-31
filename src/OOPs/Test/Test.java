package OOPs.Test;

import OOPs.Animal.Cat;
import OOPs.Animal.Dog;
import OOPs.Family.Child;
import OOPs.Family.Grandparent;
import OOPs.Family.Parent;
 // types of Inheritance :- Single Inheritance,
 //                         Multilevel Inheritance,
 //                         Hierarchical Inheritance,
 // java does not support Multiple Inheritance due to ambiguity and complexity

 // Polymorphism : the same method name or reference can behave differently depending on the situation/object.

public class Test {
    public static void main(String[] args) {
        // student object

        Student student = new Student(); // default constructor

        student.setName("Ekta");
        student.setAge(17);
        student.setStandard(12);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getStandard());

        System.out.println();

        // bank object

        Bank account = new Bank(2367.00);  // customised/parameterised constructor
        account.setAccountNumber(10);
        account.deposit(1000);

        System.out.println(account.getBalance());

        account.withdraw(9);

        System.out.println(account.getBalance());

        System.out.println();

        // Animal - Dog, Cat

        Dog dog = new Dog();
        dog.setName("Bob");
        dog.setAge(9);
        dog.setWeight(40);
        System.out.println(dog.getName());
        dog.sayHello();

        Cat cat = new Cat();
        cat.sayHello();

        System.out.println();

        // Grandparent - Parent - child (multilevel inheritance)

        Child child = new Child(20, "Tapu");

        Parent parent = new Parent(40,"Jethalal");

        Grandparent grandparent = new Grandparent();
        grandparent.setName("Champaklal");

        System.out.println(child.getName() + " -> " + parent.getName() + " -> " + grandparent.getName());

        System.out.println();

        child.childMethod();
    }
}