package Lec8.sub;

public class User {

    public String userName;
    public int age;
    public int yearsOfExpirience;
    public String email;

    public  User () {

    }

    public User(String userName, int age ,String email) {
        this.userName = userName;
        this.age = age;
        this.email = email;
    }
    public User (String userName) {
        this.userName = userName;
    }

    public User(String userName, String email, int yearsOfExpirience) {
        this.userName = userName;
        this.email = email;
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public void printEmail() {
        System.out.println("User email: " + email);
    }

    public boolean isAdulb() {
        return age >= 18;
    }

}
