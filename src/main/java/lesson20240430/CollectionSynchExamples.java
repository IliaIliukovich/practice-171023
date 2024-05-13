package lesson20240430;

import java.util.*;

public class CollectionSynchExamples {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors() / 2);

        // example 1
        HashMap<String, String> hm = new HashMap<String, String>();
        Map<String, String> map = Collections.synchronizedMap(hm);
        addValue("ABC", "123", map);


        // example 2
        List list;
        list = Collections.synchronizedList(new ArrayList<String>());
        // печать значений коллекции
        synchronized(list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }

        // example 3
        list = Collections.synchronizedList(new ArrayList<String>());
        // печать значений коллекции
        synchronized(list) {
            try {
                for (Iterator i = list.iterator(); i.hasNext(); ) {
                    System.out.println(i.next().toString());
                }
            } catch (ConcurrentModificationException e) {
            }
        }
    }

    private static void addValue(String key, String value, Map<String, String> map) {
        synchronized(map) {
            if (!map.containsKey(key))
                map.put(key, value);
        }
    }


}
