package lesson20240327;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {


    public static void main(String[] args) {

        // 1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
        System.out.println(Pattern.matches("[\\d]{4}", "1234"));
        System.out.println(Pattern.matches("[\\d]{4}", "124"));
        System.out.println(Pattern.matches("[\\d]{4}", "12345"));
        System.out.println(Pattern.matches("[\\d]{4}", "1s34"));

        //2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
        // F1-F9 F10-F12
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F9"));
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F12"));
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F20"));


        //3) Напишите регулярное выражение, которое соответствует любому номеру телефона.
        //Телефонный номер состоит из 7 цифр подряд, 1234567, или из 3х цифр, пробела или тире, а затем из 4 цифр (123-4567, 123 4567).
//        System.out.println(Pattern.matches("[\\d]{7}|([\\d]{3}[-\\s][\\d]{4})", "1234567"));
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "1234567"));
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "123 4567"));
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "123-4567"));


        // 4) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
        System.out.println(Pattern.matches("https://[a-z]+[.][a-z]+", "https://someaddress.someending"));

        // 5) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем php на java.
        String text = "Php is the best programming language in the world. I study php.";
        Pattern pattern = Pattern.compile("[pP]hp");
        Matcher matcher = pattern.matcher(text);
        String replaced = matcher.replaceAll("java");
        System.out.println(replaced);

        String result = text.replaceAll("[pP]hp", "java");
        System.out.println(result);

        // 6) Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
        text = "Some text's with different words for test-Turpose. This can be anything... t";
        List<String> words = findWordsStartingWith(text, 't');
        System.out.println(words);
    }

    public static List<String> findWordsStartingWith(String text, Character letter) {
        List<String> words = new ArrayList<>();
//        Pattern pattern = Pattern.compile("\\b[" + Character.toLowerCase(letter) + Character.toUpperCase(letter) + "][a-zA-Z]*");
        Pattern pattern = Pattern.compile("\\b" + letter + "[a-zA-Z']*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            words.add(word);
        }
        return words;
    }


}
