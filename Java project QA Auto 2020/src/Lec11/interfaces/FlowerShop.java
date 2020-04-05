package Lec11.interfaces;

public class FlowerShop extends Shop implements ProductQuantity {
    public FlowerShop(int id, String name) {
        super(id, name);
    }

    @Override
    public void sell() {
        System.out.println("FlowerShop sell flower ...");
    }
    public void showInfo(){
        System.out.println( getName() + " shop, quantity: "+getProductQuantity());
    }


    @Override
    public int getProductQuantity() {
        return 100;
    }
}
