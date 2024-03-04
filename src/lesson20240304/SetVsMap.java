package lesson20240304;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SetVsMap {

    public static void main(String[] args) {

        // Set<Key> ------ Map<Key, Value>
        // TreeSet ----- TreeMap
        // HashSet ----- HashMap

        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 4);
        map.put("R", 1);
        map.put("H", 9);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

    }




}
