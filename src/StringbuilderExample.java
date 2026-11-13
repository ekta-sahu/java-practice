public class StringbuilderExample {

//StringBuilder is a class used to create and modify
// strings without creating a new object every time a change is made.
//allows method chaining, mutable
    public static void main(String[] args){
        StringBuilder  sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
//StringBuffer is a mutable class used to create and modify strings without creating a new object for every modification.
// It is very similar to StringBuilder, but the main difference is that StringBuffer is synchronized (thread-safe).


}
