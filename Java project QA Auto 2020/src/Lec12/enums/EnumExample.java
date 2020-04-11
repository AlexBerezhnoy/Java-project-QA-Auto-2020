package Lec12.enums;

public class EnumExample {

    public static void main(String[] args) {
        User admin = new User ("Bob", Role.ADMIN);
        User guest = new User ("Bob", Role.GUEST);
        User authUser = new User ("Bob", Role.AUTHUSER);

        Shop shop = new Shop();

        shop.showProducts(admin);
        shop.showProducts(guest);
        shop.showProducts(authUser);
        shop.showBasket(admin);
        shop.showBasket(guest);

    }
}
