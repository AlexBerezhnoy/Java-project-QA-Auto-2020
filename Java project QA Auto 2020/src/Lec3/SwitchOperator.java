package Lec3;

public class SwitchOperator {
    public static void main(String[] args) {
//        int price = 26;
//
//        switch (price) {
//            case 50:
//                System.out.println("Succes putchase");
//                break;
//            case 100:
//                System.out.println("Not luck");
//                break;
//            case 25:
//                System.out.println("You have discount!");
//                break;
//            default:
//                System.out.println("Good buy!!");
//        }

        String name = "Geralt";

        switch (name) {
            case "Geralt":
                System.out.println("The  witcher!");
                break;
            case "Yenifer":
                System.out.println("The wizard");
                break;
            case "Lutik":
                System.out.println("The bard");
                break;
            default:
                System.out.println(name+" unknown");
        }

    }
}
