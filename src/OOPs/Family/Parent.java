package OOPs.Family;

public class Parent extends Grandparent {

    public Parent(int age , String name){
        super();
        System.out.println("Parent constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }
}
