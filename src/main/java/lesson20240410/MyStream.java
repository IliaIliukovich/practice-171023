package lesson20240410;

import java.util.function.Predicate;

public interface MyStream<T> extends MyBaseStream<T, MyStream<T>>{

    MyStream<T> filter(Predicate<T> predicate);


    public static void main(String[] args) {
        MyStream<String> stream = null;

        MyStream<String> filtered = stream
                .filter(string -> string.length() == 3)
                .parallel()
                .filter(string -> string.startsWith("A"))
                .sequential();
    }


}
