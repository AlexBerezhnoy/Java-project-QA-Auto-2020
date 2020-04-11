package Lec12.exception;

import java.net.MalformedURLException;
import java.net.URL;

public class ExcaptionExample {
    public static void main(String[] args) {
        String string = null;

        System.out.println("Start programm...");
//        System.out.println(string.isEmpty()); // NullPointerException

//        int a = 10/0; //AriphmeticException
//         Integer integer  = Integer.valueOf("sfasfda"); //NumberFormatException
        String value = "asdasda";
        URL url = null;
//        try {
//            url = new URL(value);
//            url = null;
//            String host = url.getHost();
//        } catch (MalformedURLException | NullPointerException e) {
//            if (e instanceof MalformedURLException) {
//                System.out.println("Wrong URL value: " + value);
//            }else if (e instanceof  NullPointerException) {
//                System.out.println("NPE");
//            }  else
//            e.printStackTrace();
//

//        createURT(value);
        try {
            url = new URL(value);
            url = null;
            String host = url.getHost();
        } catch (Exception e) {
            if (e instanceof MalformedURLException) {
                System.out.println("Wrong URL value: " + value);
            }else if (e instanceof  NullPointerException) {
                System.out.println("NPE");
            }  else
                e.printStackTrace();
        }

        System.out.println("Finish programm...");


    }

    private static URL createURT(String value) throws MalformedURLException{return new URL(value);}
}
