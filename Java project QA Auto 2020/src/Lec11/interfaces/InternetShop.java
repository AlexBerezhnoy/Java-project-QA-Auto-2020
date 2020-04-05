package Lec11.interfaces;

public class InternetShop extends Shop {
    private String url;

    public InternetShop(int id, String name, String url) {
        super(id, name);
        this.url = url;
    }

    @Override
    public void sell() {
        System.out.println("InternetShop sell some products...");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void showInfo(){
        System.out.println( getName() + " shop");
    }
}

