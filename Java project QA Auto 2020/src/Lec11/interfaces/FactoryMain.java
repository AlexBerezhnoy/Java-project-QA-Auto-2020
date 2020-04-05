package Lec11.interfaces;

public class FactoryMain {

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop(1, "Flower");
//        flowerShop.sell();
//        flowerShop.showInfo();
        BakeryShop bakeryShop = new BakeryShop(2, "Bakery", "134566432");
//        bakeryShop.sell();
//        bakeryShop.showInfo();
        InternetShop internetShop = new InternetShop(3, "InetShop", "http:///inet.ua");
//        internetShop.sell();
//        internetShop.showInfo();
        InformationDashBoard dashBoard = new InformationDashBoard();
        dashBoard.showProducts(flowerShop);
        dashBoard.showProducts(bakeryShop);
    }

}
