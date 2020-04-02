package Lec10.abstraction.browsers;

public class FireFoxBrowser extends Browser {
    public static final String FIREFOX = "FIREFOX";

    @Override
    public void open() {
        System.out.println("Open " + FIREFOX);
    }

    @Override
    public void moveForward() {
        System.out.println("moveForward " + FIREFOX);
    }

    @Override
    public void moveBack() {
        System.out.println("moveBack " + FIREFOX);
    }
}
