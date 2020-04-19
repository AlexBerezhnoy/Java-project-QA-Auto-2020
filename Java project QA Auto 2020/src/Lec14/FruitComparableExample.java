package Lec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitComparableExample {

    public static void main(String[] args) {

        List<Fruit> arrayList = new ArrayList<>();
        arrayList.add ( new Fruit(4, "sttutberry"));
        arrayList.add (new Fruit(2, "bananas"));
        arrayList.add ( new Fruit(3, "orange"));
       arrayList.add (new Fruit(1, "apple"));


        arrayList.add ( new Fruit(5, "sttutberry"));

        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
//        System.out.println(arrayList);
//
////        Collections.sort(arrayList, new ReversInNumber());
//        arrayList.sort(new ReversInNumber());
//        System.out.println(arrayList);
//
//
////        Map<Integer, String> treeHashMap = new TreeMap<>();
////        fillMap(treeHashMap);
////        System.out.println(treeHashMap);
    }

    public static void fillMap(List map) {
        map.add(3);
        map.add(5);
        map.add(4);
        map.add(1);
        map.add(2);

    }

    static class ReversInNumber implements Comparator<Integer> {
        @Override
        public int compare(Integer integer1, Integer integer2) {
            if (integer1 > integer2 ) {return -1;}
            else if (integer1 < integer2) {return 1;}
            else {return 0;}
        }
    }
}
