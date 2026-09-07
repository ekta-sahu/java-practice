package OOPs.InnerClass.AnnonymousInnerClass;

public class Test_VII {
    public static void main(String[] args){

        ShoppingCart shoppingcart = new ShoppingCart(1000);
        shoppingcart.processAmount(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+ amount+ " using credit card.");
            }
        });

        shoppingcart.processAmount(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount + " using Phonepe");
            }
        });
    }
}
