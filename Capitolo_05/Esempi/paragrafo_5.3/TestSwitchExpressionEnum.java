import java.time.Month;

public class TestSwitchExpressionEnum {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY -> "winter";
            case MARCH, APRIL, MAY -> "spring";
            case JUNE, JULY, AUGUST -> "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "autumn";
        };
        System.out.println("The season is " + season);
    }
}