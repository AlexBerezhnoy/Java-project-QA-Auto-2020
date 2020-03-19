package Lec6;

public class StringMethodsExample {
    public static void main(String[] args) {
//        String userName = "oberezhniy";
//
//        if (userName.equals("oberezhniy")) {
//            System.out.println("Test Passed");
//            } else  {
//            System.out.println("Test Failed");
//        }

//        String helloHillelLowerCase = userName.toLowerCase();
//        System.out.println(helloHillelLowerCase);
//        String helloHillelUpperCase = userName.toUpperCase();
//        System.out.println(helloHillelUpperCase);

//         if (userName.equalsIgnoreCase("OBerezhniy")) {
//            System.out.println("Test Passed");
//            } else  {
//            System.out.println("Test Failed");
//        }

//        String email = "cooluser@gmail.com";
//        if (email.contains("@gmail.com"))
//            System.out.println("Correct email");
//        else System.out.println("Wrong email");
//
//        int length = email.length();
//        System.out.println(length);
//
//        String user = " user1 ";
//        String expectedUser = "user1";
//        if (user.trim().equalsIgnoreCase(expectedUser)) {
//            System.out.println("Test Passed");
//            } else  {
//            System.out.println("Test Failed");
//
//         String welcomeMessage = " Dear, Alex ... ";
//         if (welcomeMessage.startsWith("Dear", 1)) {
//             System.out.println("Test passed");
//         }
//
//         if (welcomeMessage.endsWith(".. ")) {
//             System.out.println("Correct end");
//         }
//
//        String email = "cooluser@gmail.com";
//        String replacedEmail = email.replace("@gmail.com", "-username");
//        System.out.println(email);
//        System.out.println(replacedEmail);

        String username = "user12121";
        String s = username.replace("1", "-").replace("2", "-");
        System.out.println(s);
        String s2 = username.replaceAll("[0-9]", "-");
        System.out.println(s2);


    }

}
