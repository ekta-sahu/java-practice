public class pattern {
    public static void main(String[] args){
        int n= 5;
        for (int i = 1; i <= n; i++){
            for (int k= 1; k<=i; k++){
                if( i==3 && k==2 || i==4 && k==2 || i==5 && k==2 || i==4 &&  k==3 || i==5 && k==3 || i==5 && k==4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            int spaces = (n-i)*2;
            for (int j = 1; j <= spaces ; j++){
                System.out.print("   ");
            }
            for (int k = 1; k<= i; k++){
                if( i==3 && k==2 || i==4 && k==2 || i==5 && k==2 || i==4 &&  k==3 || i==5 && k==3 || i==5 && k==4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            for (int k= 1; k<=i; k++){
                if( i==3 && k==2 || i==4 && k==2 || i==5 && k==2 || i==4 &&  k==3 || i==5 && k==3 || i==5 && k==4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            int spaces = (n-i)*2;
            for (int j = 1; j <= spaces ; j++){
                System.out.print("   ");
            }
            for (int k = 1; k<= i; k++){
                if( i==3 && k==2 || i==4 && k==2 || i==5 && k==2 || i==4 &&  k==3 || i==5 && k==3 || i==5 && k==4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
