import java.util.Locale;

public class print_locale{
    public static void main(String[] args){
        double a = 13234424.45;
        System.out.printf("Default %,.2f%n",a);
        System.out.printf(Locale.CHINA, "China %,.2f%n",a);
        System.out.printf(Locale.CANADA, "Canada  %,.2f%n",a);
        System.out.printf(Locale.GERMANY, "Germany %,.2f%n",a);
        System.out.printf(Locale.FRANCE,"France %,.2f%n",a);
    }
}