package Lec12.enums;

public class Shop {

    public void showProducts (User user) {
        Role role = user.getRole();
        switch (role) {
            case ADMIN:
                System.out.println("Show products for admin");
                break;
            case GUEST:
                System.out.println("Show products for guest");
                break;
            case AUTHUSER:
                System.out.println("Show products for authUser");
                break;
        }
    }

    public void showBasket (User user){
        Role role = user.getRole();

        if (role.getPermission()==0) {
            System.out.println("Product for admin");
        }else {
            System.out.println("Else product");
        }

    }
}
