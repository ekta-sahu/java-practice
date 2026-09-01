package OOPs.Access_Modifier.Utils;

public class Utils_1 {

    public final static double PI = 3.14159;

    // final variables can only be assigned value once

//    static {
//        PI = 3.14159;
//    }

    public static Utils_1 util;

    public  Utils_1(){

    }

    public static Utils_1 getUtil() {
        return util;
    }
}
