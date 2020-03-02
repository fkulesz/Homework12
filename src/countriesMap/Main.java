package countriesMap;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();
        countryMap = FileInput.readsCountryDetailsFromFile("countries.txt");
        CountryReader.getCountryDetailsByCountryCode(countryMap);

    }

}
