package Lec11.interfaces;

public abstract class Shop {
    int id;
    private String name;

    public abstract void sell();
    public abstract void showInfo();

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
