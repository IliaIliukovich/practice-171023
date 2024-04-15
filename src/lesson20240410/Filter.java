package lesson20240410;

@FunctionalInterface
public interface Filter <T> {

    boolean apply(T t);


}
