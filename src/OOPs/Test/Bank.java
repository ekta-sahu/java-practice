package OOPs.Test;

public class Bank {

    // properties - variables
    // behavior - methods

    private long accountNumber ;

    private double balance ;

    // customised/parametersied constructor :-

    public Bank(){
        this.accountNumber = 1;
    }
        // overloading

    public Bank(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Bank(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public Bank(double balance){
        this.balance = balance;
    }

    // getters & setters

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount ;
            System.out.println("Deposited :" + amount);
        }
        else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(int amount){
        if ( amount >0 && amount <= balance ){
            balance -= amount ;
            System.out.println("Withdrew :" + amount);
        }
        else{
            System.out.println("Invalid amount ");
        }
    }
}
