package Lec3;

public class Exercise1 {
    public static void main(String[] args) {
        float v1 = 4.0F;
        float v2 = 10.0F;
        float t1 = 38.0F;
        float t2 = 100.0F;
        float resultV;
        float resultT;
        resultV = v1+v2;
        resultT = (v1*t1+v2*t2)/resultV;
        System.out.println("Результирующий объем :"+resultV);
        System.out.println("Результирующая температура :"+resultT);
    }
}
