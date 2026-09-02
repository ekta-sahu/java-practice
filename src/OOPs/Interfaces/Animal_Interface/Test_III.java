package OOPs.Interfaces.Animal_Interface;

public class Test_III {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.sleep();
        System.out.println(dog.maxAge);
        System.out.println(Dog.maxAge);
        System.out.println(Animal.maxAge);
        Animal.info();
        dog.run();
    }
}
