import java.time.Month;

public class TestSwitchExpressionYieldEnum {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY -> {
                String value = "winter";
                yield value;
            }
            case MARCH, APRIL, MAY -> "spring";
            case JUNE, JULY, AUGUST -> {
                String value = "summer";
                yield value;
            }
            case SEPTEMBER, OCTOBER, NOVEMBER -> "autumn";
        };
        System.out.println("The season is " + season);
    }
}