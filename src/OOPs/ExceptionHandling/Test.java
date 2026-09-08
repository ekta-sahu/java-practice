package OOPs.ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

public class Test {

    // Exception : exception is an event that disrupts the normal flow pf the program.
    // It is an *object* which is thrown at runtime.
    public static void main(String[] args){
        int[] num = {10,200,30,40};
        int[] deno = {1,2,0,4};
        for (int i = 0; i < num.length; i++){
            System.out.println(divide( num[i], deno[i]));
        }
        System.out.println();

        // Stack Trace

        try {
            level1();
        }catch (Exception a){
            a.printStackTrace();
        }
    }

    public static float divide(int a , int b){
        try {
            return a / b;
        }catch (ArithmeticException e){ // Parent/Super class reference can also work
            System.out.println(e);
            return -1;
        }
    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }


}
