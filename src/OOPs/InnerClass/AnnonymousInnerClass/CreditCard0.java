package OOPs.InnerClass.AnnonymousInnerClass;

public class CreditCard0 implements Payment{

    private int creditCardNumber0;

    public CreditCard0(int creditCardNumber) {
        this.creditCardNumber0 = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount+ " using credit card.");
    }
}
