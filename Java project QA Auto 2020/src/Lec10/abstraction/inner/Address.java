package Lec10.abstraction.inner;

public class Address {

    private String street;
    private int number;
    private GeoPosition geoPosition;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GeoPosition setGeoPosition () {
        GeoPosition geoPosition = new GeoPosition();
        geoPosition.setLat(142.25);
        geoPosition.setLon(2.5);
        this.geoPosition = geoPosition;
        return geoPosition;
    }

    class  GeoPosition {
        private double lat;
        private double lon;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        @Override
        public String toString() {
            return "GeoPosition{" +
                    "lat=" + lat +
                    ", lon=" + lon +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", geoPosition=" + geoPosition +
                '}';
    }
}
