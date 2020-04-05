package Lec11.interfaces;

public class InformationDashBoard {

    public void showProducts(ProductQuantity productQuantity) {
        System.out.println( productQuantity.getName() + " shop, quantity: "+productQuantity.getProductQuantity());
    }
}

