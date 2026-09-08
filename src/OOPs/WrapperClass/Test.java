package OOPs.WrapperClass;

public class Test {
    public static void main(String[] args){

        // Wrapper Classes : a class that converts a primitive data type into an object.
        // bcoz Java Collections such as ArrayList work with objects, not primitive types.

        int a = 1; // a is a primitive variable, value is stored in stack directly.
        Integer b = 1; // b is a reference variable , value is stored in heap memory.
        Boolean c = true;
        Character d = 'a';
        Short e = 1;
        Byte f = 1;
        Long g = 2132l;
        Float h = 845.34f;
        Double i = 7362.93;

        // Boxing (auto)

        Integer x = 1; //Integer.valueOf(1);

        // Unboxing (auto)
        int y = x; // x.intvalue();
    }
}
