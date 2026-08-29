import java.util.*;
class primeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean prime = primeNum(n);
        if (prime){
            System.out.printf("%d is a prime number.",n);
        }else{
            System.out.printf("%d is not a prime number.",n);
        }
    }

    public static Boolean primeNum(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i <= n/2 ; i++){
            if (n % i==0){
                return false;
            }
        }
        return true;
    }
}