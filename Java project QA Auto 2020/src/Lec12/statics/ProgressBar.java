package Lec12.statics;

public class ProgressBar {


    private String name;

    static int value;

    static  {
        value = 46;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int calculate (int a) {
        return a+1;
    }
}
