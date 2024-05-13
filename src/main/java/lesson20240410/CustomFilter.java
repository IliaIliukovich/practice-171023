package lesson20240410;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class CustomFilter {
// Написать метод T[] filter(T[] t, Filter<T> filter), который принимает на вход массив (любого типа)
//и производит фильтрацию данных согласно реализации интерфейса Filter (например, через лямбда-выражение)
//Интерфейс Filter имеет метод apply (T t), с помощью которого можно будет указывать способ фильтрации.
//interface Filter {
//   boolean apply(T t);
//}
//Проверьте как работает метод на строках или других объектах.

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
        Integer[] filtered = customFilter(ints, (integer) -> integer % 2 == 0);
        System.out.println(Arrays.toString(filtered));

        String[] strings = {"adsgg", "ABC", "qwe", "BEF", "dkfbffbkw", "FDF", "qwqeqww"};
        String[] filteredStrings = customFilter(strings, (s) -> s.length() == 3);
        System.out.println(Arrays.toString(filteredStrings));
    }


//    public static <T> T[] customFilter(T[] data, Predicate<T> filter) {
    public static <T> T[] customFilter(T[] data, Filter<? super T> filter) {
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isValid = filter.apply(data[i]);
            if (isValid) {
                data[j++] = data[i];
            }
        }
//        T[] t = (T[]) Array.newInstance(data.getClass(), data.length);
        T[] result = Arrays.copyOf(data, j);
        return result;
    }


}
