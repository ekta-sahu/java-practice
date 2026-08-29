public class TypeConversion {
    public static void main(String[] args){


        // Implicit conversion/ Automatic type conversion/ Widening
        int a = 10;
        double b = a; // double > int
        // byte < short < int < long < float < double

        // Explicit conversion/ Explicit type casting/ Narrowing
        double x = 10.99;
        int y = (int)x;
        // java cannot automatically convert bigger type to smaller type due to data loss
    }
}
