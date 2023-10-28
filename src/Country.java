public class Country {
    String countryName;
    Float square;
    Float countryPopulation;
    String capitalName;
    Float capitalPopulation;

    public Country(String countryName, float square, float countryPopulation, String capitalName, float capitalPopulation) {
        this.capitalName = capitalName;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.capitalPopulation = capitalPopulation;
        this.square = square;

    }

    public Country(String countryName, Float square, Float countryPopulation) {
        this.countryName = countryName;
        this.square = square;
        this.countryPopulation = countryPopulation;
    }

    public static void printAll(Country[] countries) {
        for (Country country : countries) {
            country.print();
        }
    }

    public static void fillArrayAndPrint() {
        Country[] countriesArray = new Country[]{
                new Country("Russia", 17100f, 146700f, "Moscow", 12600f),
                new Country("Finland", 338f, 5500f, "Helsinki", 655f),
                new Country("France", 643.8f, 67800f, "Moscow", 2100f),
                new Country("Andorra", 467f, 85.4f, "Moscow", 22.6f),
                new Country("Singapore", 725f, 5700f),
        };
        printAll(countriesArray);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if (countryName == null) throw new IllegalArgumentException("строка не может быть null");
        this.countryName = countryName;
    }

    public Float getSquare() {
        return square;
    }

    public void setSquare(Float square) {
        if (square <= 0) throw new IllegalArgumentException("недопустимое значение");
        this.square = square;
    }

    public Float getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Float countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public Float getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(Float capitalPopulation) {
        this.capitalPopulation = capitalPopulation;

    }

    public Float getCountryDensity() {
        return this.countryPopulation / this.square;
    }
//Russia, 17,1 млн кв. км., 146,7 млн чел., Moscow, 12,6 млн чел.;
// Finland, 338 тыс. кв. км., 5,5 млн чел., Helsinki, 655 тыс. чел.;
// France, 643,8 тыс. кв. км., 67,8 млн чел., Paris, 2,1 млн чел.;
// Andorra, 467 кв. км., 85,4 тыс. чел., Andorra la Vella, 22,6 тыс. чел.;
// Singapore, 725 кв. км., 5,7 млн чел., —

    public void clearCountryName() {
        this.countryName = null;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_name='" + countryName + '\'' +
                ", square=" + square +
                ", country_population=" + countryPopulation +
                ", capital_name='" + capitalName + '\'' +
                ", capital_population=" + capitalPopulation +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}


