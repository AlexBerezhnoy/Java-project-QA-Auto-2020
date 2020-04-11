package Lec12.exception;

public class ErrorExample {

    public static void main(String[] args) {
        String name = null;

        try {
            if (name == null) {
            throw  new CustomError("Name is Null!");
        }} catch (Exception e)
        {e.printStackTrace();}
    }
}
