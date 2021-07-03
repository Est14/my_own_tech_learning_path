package co.com.est14.domain.location;

public abstract class Location {

    protected String locationName;
    protected String locationCountry;
    protected String locationCity;
    protected String locationAddress;

    public Location(String locationName, String locationCountry, String locationCity, String locationAddress) {
        this.locationName = locationName;
        this.locationCountry = locationCountry;
        this.locationCity = locationCity;
        this.locationAddress = locationAddress;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationName='" + locationName + '\'' +
                ", locationCountry='" + locationCountry + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                '}';
    }
}
