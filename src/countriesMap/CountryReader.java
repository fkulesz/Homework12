package countriesMap;

import java.util.Map;
import java.util.Scanner;

public class CountryReader {
    public static void getCountryDetailsByCountryCode(Map<String, Country> countryMap){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
            String countryCode = scanner.nextLine();
            Country country =  countryMap.get(countryCode);
            System.out.println(country.getCountryName() + " (" + countryCode + ") " + " ma " + country.getPopulation() + " ludnosci");
            scanner.close();
    }
}
