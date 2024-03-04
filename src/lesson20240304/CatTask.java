package lesson20240304;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CatTask {

    //У вас есть приют для животных, в которых живут коты.
//Есть объект Cat с данными: имя, возраст, вес, порода.
//создайте Map, ключом которого будет имя, а значением объект Cat.
//1.информация о котах должна храниться в упорядоченном виде по имени.
//2.выведите имена котов, порода которых равна N (на ваше усмотрение).
//3.выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//4.* найдите кота с самым большим весом и возрастом одновременно.

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", "white", 2, 5.0);
        Cat cat2 = new Cat("Cat", "grey", 2, 3.0);
        Cat cat3 = new Cat("Tom", "black", 2, 6.0);
        Cat cat4 = new Cat("Steve", "white", 2, 5.6);
        Cat cat5 = new Cat("Mike", "black", 2, 5.2);

        Map<String, Cat> catMap = new TreeMap<>();
        catMap.put(cat1.getName(), cat1);
        catMap.put(cat2.getName(), cat2);
        catMap.put(cat3.getName(), cat3);
        catMap.put(cat4.getName(), cat4);
        catMap.put(cat5.getName(), cat5);

        System.out.println(catMap);
        for (Map.Entry<String, Cat> entry : catMap.entrySet()){
            if ("white".equals(entry.getValue().getBreed())) {
                System.out.println(entry.getKey());
            }
        }




    }


}
