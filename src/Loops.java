public class Loops {
    public static void main(String[] args){

        //while loop
        int i = 1;                   //initialisation
        while ( i <= 10){            //condition
            System.out.println(i);
            ++i;                     //updation
        }


        //do-while loop
        int j = 1;
        do {
            System.out.println(j);
        }while(i <= 0);

        //for loop
        for (int k = 1; k <= 100000; k = k*10){        //initialisation; condition; updation
            System.out.println(k);
        }

        for (int k = 1, y = 1; y <= 6; k = k*10, y++){
            System.out.println(k);
        }

        //counting digits in an integer
        int a = 3242349;
        int result = 0;
        while( a > 0){
            a = a/ 10;
            result++;
        }
        System.out.printf("Number of digits in a is : %d%n", result);

        //factorial
        int b = 6;
        int fac = 1;
        for (int y = 0; y < b; y++){
            fac *=(b-y);
        }
        System.out.printf("Factorial of b is : %d%n", fac);

        int fac1 = 1;
        while (b > 0){
            fac1 *= b;
            b--;
        }
        System.out.printf("Factorial of b is : %d%n", fac);

     }
}
