package dayConverter;

public class ConverterTest {
    private static int daysInTheWeek = 7;
    public static void convertDay(){
    CalandarConverter calandarConverter = new CalandarConverter();
        for (int i = 1; i <= daysInTheWeek; i++) {
           String dayDescription = calandarConverter.convertDayToString(i);
            System.out.println(i + " dzien tygodnia to "+ dayDescription);
        }
    }
}
