import java.time.Month;

public class TestSwitchExpressionArrowYieldEnum {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY -> {yield "winter";}
            case MARCH, APRIL, MAY -> {yield "spring";}
            case JUNE, JULY, AUGUST -> {yield "summer";}
            case SEPTEMBER, OCTOBER, NOVEMBER -> {yield "autumn";}
        };
        System.out.println("The season is " + season);
    }
}