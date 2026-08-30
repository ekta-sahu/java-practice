package OOPs.Family;

public class Child extends Parent{

    public Child(int age ,String name ){
        super(age , name );
        System.out.println("Child constructor called");
    }

    public void  childMethod(){
        super.parentMethod();
        System.out.println("Child method called");
    }
}
