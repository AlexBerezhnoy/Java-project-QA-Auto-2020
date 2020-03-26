package Lec8;

import Lec8.sub.User;

public class ObjectExample {
    public static void main(String[] args) {
        User user = new User("Alex", 34, "dinnylol221@gmail.com");
//        user.userName = "Alex";
//        user.age = 34;
//        user.email = "dinnylol221@gmail.com";
        System.out.println(user);

        printUserInfo(user);
//        printUserInfo( userName2, age2, email2);

        user.email = "knjgglkgdf@mail.ru";
        printUserInfo(user);

        User user2 = new User("John",31,"john@gmail.com");
//        user2.userName = "John";
//        user2.age = 31;
//        user2.email = "john@gmail.com";
        printUserInfo(user2);

        user.age = 40;
        user2.email = "gsdgs@rambler.ru";
        printUserInfo(user);
        printUserInfo(user2);

        user.printEmail();
        System.out.println(user.isAdulb());
//        User user3 = new User("Bob");
//        System.out.println(user3.userName);

    }

    public static  void printUserInfo (User user)
    {
        System.out.println(String.format("My name is %s, age %s, email %s",  user.userName, user.age, user.email));
    }

}
