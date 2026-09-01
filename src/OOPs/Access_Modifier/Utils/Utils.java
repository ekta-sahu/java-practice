package OOPs.Access_Modifier.Utils;

public class Utils {

    // Singleton Design Pattern :  only one object can be created in that class throughout the program

    private static Utils instance ;

    private Utils(){

    }

    public static Utils getInstance(){
        if ( instance == null ){
            instance = new Utils();
        }
        return instance;
    }

}

