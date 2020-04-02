package Lec10.abstraction.inner;

public class AddressMain  {

    public static void main(String[] args) {
        Address myAddress = new Address("Kirova st.", 15);
        Address.GeoPosition geoPosition = myAddress.setGeoPosition();
        System.out.println(myAddress);
    }
}
