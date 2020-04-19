package Lec14;

import java.util.*;

public class ComparableExample  {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        fillMap(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

//        Collections.sort(arrayList, new ReversInNumber());
        arrayList.sort(new ReversInNumber());
        System.out.println(arrayList);


//        Map<Integer, String> treeHashMap = new TreeMap<>();
//        fillMap(treeHashMap);
//        System.out.println(treeHashMap);
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
//            integer1 > integer2 = 1;
//            integer1 < integer2 = -1;
//            integer1 == integer2 = 0;
            if (integer1 > integer2 ) {return -1;}
            else if (integer1 < integer2) {return 1;}
            else {return 0;}
        }
    }
}
