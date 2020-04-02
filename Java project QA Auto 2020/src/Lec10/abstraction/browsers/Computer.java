package Lec10.abstraction.browsers;

public class Computer {

    private Browser browser;

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void openBrowser () {
        browser.open();
    }

    public Browser getBrowser() {
        return browser;
    }
}
