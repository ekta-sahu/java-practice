package OOPs.Enum;

public class Test {

    public enum Months{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }
    public static void main(String[] args){
//        System.out.println(Days.SUNDAY);
//        System.out.println(Days.MONDAY);
//        System.out.println(Days.TUESDAY);
//
//        Days.MONDAY.day();

        Days day = Days.MONDAY;
        System.out.println(day.getLower());

        String result = switch (day){
            case MONDAY -> "monday";
            case TUESDAY -> "tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "thursday";
            case FRIDAY -> "friday";
            default -> "weekend!";
        };
        System.out.println(result);

        System.out.println(Months.JANUARY);
    }
}
