package OOPs.InnerClass.StaticNestedClass;

import OOPs.InnerClass.AnnonymousInnerClass.Payment;
import OOPs.InnerClass.AnnonymousInnerClass.ShoppingCart;

public class Test_VI {

    public static void main(String[] args){

        Computer computer = new Computer("HP","ABC","XYZ");
        computer.getOs().info();

        Computer.USB usb = new Computer.USB("type A");
        System.out.println(usb.getType());

    }
}
