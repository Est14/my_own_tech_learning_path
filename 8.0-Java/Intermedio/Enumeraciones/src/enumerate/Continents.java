package enumerate;

public enum Continents {

    AFRICA(53, "South Africa"),
    EUROPE(46,"Germany" ),
    AMERICA(34, "EE.UU"),
    ASIA(44, "China"),
    OCEANIA(14, "Australia");

    private final int countries;
    private final String bestCountry;

    Continents(int countries, String bestCountry){
        this.countries = countries;
        this.bestCountry = bestCountry;
    }

    public int getCountries() {
        return this.countries;
    }

    public String getBestCountry(){
        return this.bestCountry;
    }
}
