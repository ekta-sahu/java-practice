package OOPs.InnerClass.AnnonymousInnerClass;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processAmount(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
