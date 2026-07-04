import java.util.*;

public class GCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcf = 1;
        if (a>b){
            for (int i = 1; i <= a; i++){
                if (a%i==0 && b%i==0){
                    gcf = i;
                }
            }
        }
        else{
            for (int i = 1; i <= b; i++){
                if (a%i==0 && b%i==0){
                    gcf = i;
                }

            }
        }
        System.out.println("Greatest common divisor : " + gcf);
    }
}