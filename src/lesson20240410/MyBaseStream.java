package lesson20240410;

public interface MyBaseStream<T, S extends MyBaseStream<T, S>> {

    S parallel();
    S sequantial();


}
