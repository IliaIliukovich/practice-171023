package lesson20240205;

import lesson20240131.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    // 1. Создать generic класс Box<Item>, в котором можно хранить предметы любого типа.
    //Реализовать методы:
    //- put(Item item) - положить предмет
    //- get() - извлечь предмет
    //- remove() - извлечь и удалить предмет
    //2. Написать generic метод makeList(), который преобразует массив в список.
    //3. Напишите метод, который меняет местами элементы одномерного массива из String в обратном порядке.
    //Не используйте дополнительный массив для хранения результатов.
    //Input:
    //	data = {"One", "Two", "Three"}
    //Result:
    //	data = {"Three", "Two", "One"}
    //
    //4. Создать метод transpose(), который будет транспонировать матрицу (заменять строки на столбцы).
    //Input:
    //	1 2 3 4
    //	5 6 7 8
    //	9 0 0 0
    //Output:
    //	1 5 9
    //	2 6 0
    //	3 7 0
    //	4 8 0
    //


    public static void main(String[] args) {
        Object[] objects = new Object[5];

        objects[0] = 1;
        objects[1] = 2.2;
        objects[2] = "String value";
        objects[3] = new Student("Ivan");

        Double value = (Double) objects[1];
        System.out.println(value);

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

}
