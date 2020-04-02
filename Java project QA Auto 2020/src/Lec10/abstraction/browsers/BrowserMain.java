package Lec10.abstraction.browsers;

public class BrowserMain {

    public static void main(String[] args) {
        Browser chrome = new ChromeBrowser();
        Browser fireFox = new FireFoxBrowser();

        chrome.open();
        fireFox.open();
        ChromeBrowser chrome2 = new ChromeBrowser();
        chrome2.openFevTool();

        Computer computer = new Computer();
        computer.setBrowser(chrome);
        computer.openBrowser();

        ChromeBrowser browser = (ChromeBrowser) computer.getBrowser();

    }
}
