package Lec13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.trimToSize();
        List<String> arrayList = new ArrayList();

        arrayList.add("Alex");
        arrayList.add("Bob");
        arrayList.add("Anna");
        arrayList.add("John");
        arrayList.add("Vasiliy");
        arrayList.add("Bob");

//        arrayList.add(1);
//        arrayList.add(false);

        System.out.println(arrayList);

        System.out.println( arrayList.get(0));

        System.out.println("remove: "+ arrayList.remove("Alex"));
        System.out.println("remove: "+ arrayList.removeAll(Arrays.asList("Bob")));
        System.out.println("Remove: " + arrayList.remove(2));

        System.out.println(arrayList);
        System.out.println(arrayList.size());
//        arrayList.clear();
        System.out.println("contains " +arrayList.contains("Anna"));
        System.out.println("contains " +arrayList.contains("Alex"));

//                arrayList.clear();
//        System.out.println(arrayList.isEmpty());
        for (String values: arrayList) {
            System.out.println(values);
        }

        arrayList.forEach(values ->{
            System.out.println(values);
        });
        arrayList.forEach(System.out :: println);
    }
}
