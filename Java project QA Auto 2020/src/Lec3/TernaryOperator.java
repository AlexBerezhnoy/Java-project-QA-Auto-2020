package Lec3;

public class TernaryOperator {
    public static void main(String[] args) {
        String name = "John Snow";
        String result = "";
//        if (name == "John Snow") {
//            result = name+" boyfriend of Mather of Dragon";
//        } else {
//            result = "looser!!!";
//        }
//
        result = name == "John Snow"? name+" boyfriend of Mather of Dragon" : "looser!!!";
        System.out.println(result);
    }
}
