package OOPs.Access_Modifier.Test;

import javax.crypto.spec.PSource;

public class Dog extends Animal{

    // Super refers to the immediate parent class.
    // Super cannot be used in a static context because it refers to an object.

    public Dog(String name){
        super(name , "Bark");
    }

    public void barking(){
        System.out.println( getName() + " is barking");
    }

    private String getName(){
        return getClass().getSimpleName();
    }
    // getClass()- which class
    // getSimpleName()- simple name of that class as a string

    protected void setSound(String newSound){
        changeSound(newSound);
    }
}
