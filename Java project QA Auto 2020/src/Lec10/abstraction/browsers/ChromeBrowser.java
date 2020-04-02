package Lec10.abstraction.browsers;

public class ChromeBrowser extends Browser{
    public static final String CHROME = "Google chrome";

    @Override
    public void open() {
        System.out.println("Open " + CHROME);
    }

    @Override
    public void moveForward() {
        System.out.println("moveForward " + CHROME);
    }

    @Override
    public void moveBack() {
        System.out.println("moveBack " + CHROME);
    }

    public void openFevTool () {
        System.out.println("Open Dev TOols");
    }
}
