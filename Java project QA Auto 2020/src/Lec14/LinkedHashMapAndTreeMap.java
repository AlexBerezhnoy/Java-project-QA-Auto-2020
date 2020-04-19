package Lec14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);

        Map<Integer, String> treeHashMap = new TreeMap<>();
        fillMap(treeHashMap);
        System.out.println(treeHashMap);
    }

    public static void fillMap(Map map) {
        map.put(3, "apple");
        map.put(1, "bananas");
        map.put(2, "orange");
        map.put(4, "kiwi");
    }
}
