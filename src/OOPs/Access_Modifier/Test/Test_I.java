package OOPs.Access_Modifier.Test;

import OOPs.Access_Modifier.Utils.Utils;
import OOPs.Access_Modifier.Utils.Utils_1;

public class Test_I {
    // Access Modifiers type :-
    // Public - can be accessed from anywhere
    // Protected -  same class & same package & subclass(other package)
    // Default - same class & same package (not a keyword)
    // private - + not from same package (can be used in the same class only)

    // top level class can only be public or default


    public static void main(String[] args){

        System.out.println( Utils.getInstance());

        // dog object
        Dog dog = new Dog("Bob");
        dog.barking();
        dog.makeSound();
        dog.setSound("woof");
        dog.makeSound();

        // Student object

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println(Student.School);
        // each object has the same School as the class( static keyword makes it connected to the class)

        System.out.println(student1.count);
        // each student has its own count as count is not connected to the class

        Student.getSchool();
        // Static getSchool method

        System.out.println(Utils_1.PI);
        Utils_1 a = Utils_1.getUtil();

    }
}
