import java.time.Month;

public class TestSwitchSeasonEnum {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season;
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = "winter";
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season = "spring";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = "summer";
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = "autumn";
                break;
            default:
                season = "not identifiable";
                break;
        }
        System.out.println("The season is " + season);
    }
}
