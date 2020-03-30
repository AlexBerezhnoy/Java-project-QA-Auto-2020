package Lec9.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Plant plant = new Plant("MaskPlant ltd.","masks",2018);
//        plant.setName("MaskPlant ltd.");
//        plant.setStartYear(2018);
//        plant.setType("masks");

        int production = plant.startProduceProduction();
        System.out.println("Mask production: " + production);

        SellerPlant cupPlant = new SellerPlant("Cup company", "cup", 2010);
//        cupPlant.setName("Cup company");
//        cupPlant.setStartYear(2010);
//        cupPlant.setType("cup");
        cupPlant.getName();

        int cupProduction = cupPlant.startProduceProduction();
        System.out.println("Cup production: " + cupProduction);
        int productionAfterSell = cupPlant.sellProduction(cupProduction);
        System.out.println("sellProduction: " + productionAfterSell);

        OverPerformedPlant mivinaPlant = new OverPerformedPlant("Mivina company","food", 2000 );
        System.out.println(mivinaPlant.startProduceProduction(10));
//        mivinaPlant.setName("Mivina company");
//        mivinaPlant.setStartYear(2000);
//        mivinaPlant.setType("food");

        int mivinaProduction = mivinaPlant.startProduceProduction();
        System.out.println("Mivina production: " + mivinaProduction);

    }
}
