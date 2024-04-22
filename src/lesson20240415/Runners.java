package lesson20240415;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Runners {

    // Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
    // Каждый бегун земеряет свой результат и сообщает его тренеру.
    // В конце забега выводится информация о победителе. Реализовать данную модель с помощью запуска отдельных потоков.
    // Бегуна представить через класс Runner implements Runnable.

    static class Runner implements Runnable {
        String name;
        long result;

        public Runner(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            System.out.println(name + " running...");
            Random random = new Random();
            try {
                Thread.sleep(10_000 + random.nextInt(10_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished");
            long end = System.currentTimeMillis();
            result = end - start;
        }

        @Override
        public String toString() {
            return "Runner{" +
                    "name='" + name + '\'' +
                    ", result=" + result +
                    '}';
        }
    }

    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner 1");
        Runner runner2 = new Runner("Runner 2");
        Runner runner3 = new Runner("Runner 3");
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);

        thread1.start();
        thread2.start();
        thread3.start();

        // Ready! Steady! Go!

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("Race is over");
            System.out.println(runner1);
            System.out.println(runner2);
            System.out.println(runner3);
            System.out.println("The winner: " + Stream.of(runner1, runner2, runner3).min(Comparator.comparingLong(o -> o.result)).get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






}
