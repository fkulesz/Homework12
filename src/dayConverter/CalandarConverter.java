package dayConverter;

public class CalandarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public String convertDayToString(int dayNumber){
        String dayDescription = "";
        switch(dayNumber){
            case MONDAY: dayDescription = "Poniedziałek";
                break;
            case TUESDAY : dayDescription = "Wtorek";
                break;
            case WEDNESDAY : dayDescription = "Sroda";
                break;
            case THURSDAY : dayDescription = "Czwartek";
                break;
            case FRIDAY : dayDescription = "Piątek";
                break;
            case SATURDAY : dayDescription = "Sobota";
                break;
            case SUNDAY : dayDescription = "Niedziela";
                break;
            default: dayDescription = "zły dzień tygodnia";
        }

        return dayDescription;
    }

}
