package countriesMap;

public class Country {
    private String countryCode;
    private String countryName;
    private int population;

    public Country(String countryCode, String countryName, int population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }
}
