import java.time.Month;

public class TestSwitchSeasonArrowEnum {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season = null;
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> season = "winter" ;
            case MARCH, APRIL, MAY -> season = "spring" ;
            case JUNE, JULY, AUGUST -> season = "summer" ;
            case SEPTEMBER, OCTOBER, NOVEMBER -> season = "autumn" ;
        }
        System.out.println("The season is " + season);
    }

}