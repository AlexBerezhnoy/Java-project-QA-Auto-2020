package Lec3;

public class Exercise2 {
    public static void main(String[] args) {
        float grn=200;

        float courseUsd = 1/24.890800F;
        float courseFunts = 1/31.902500F;
        float courseEur = 1/27.704700F;
        float courseRub = 1/0.378360F;
        System.out.println(grn+" гривень в долларах : "+courseUsd * grn);
        System.out.println(grn+" гривень в фунтах : "+courseFunts * grn);
        System.out.println(grn+" гривень в евро : "+courseEur * grn);
        System.out.println(grn+" гривень в рублях : "+courseRub * grn);


    }
}
