package lesson20240304;

import java.util.Arrays;

public class Dictionary {

    public static void main(String[] args) {
        String text = "Mr and Mrs Dursley, of number four, Privet Drive, were proud to\n" +
                "say that they were perfectly normal, thank you very much. They\n" +
                "were the last people you’d expect to be involved in anything\n" +
                "strange or mysterious, because they just didn’t hold with such\n" +
                "nonsense.\n" +
                "Mr Dursley was the director of a firm called Grunnings, which\n" +
                "made drills. He was a big, beefy man with hardly any neck,\n" +
                "although he did have a very large moustache. Mrs Dursley was\n" +
                "thin and blonde and had nearly twice the usual amount of neck,\n" +
                "which came in very useful as she spent so much of her time craning\n" +
                "over garden fences, spying on the neighbours. The Dursleys had a\n" +
                "small son called Dudley and in their opinion there was no finer\n" +
                "boy anywhere.\n" +
                "The Dursleys had everything they wanted, but they also had a\n" +
                "secret, and their greatest fear was that somebody would discover\n" +
                "it. They didn’t think they could bear it if anyone found out about\n" +
                "the Potters. Mrs Potter was Mrs Dursley’s sister, but they hadn’t\n" +
                "met for several years; in fact, Mrs Dursley pretended she didn’t\n" +
                "have a sister, because her sister and her good-for-nothing husband\n" +
                "were as unDursleyish as it was possible to be. The Dursleys\n" +
                "shuddered to think what the neighbours would say if the Potters\n" +
                "arrived in the street. The Dursleys knew that the Potters had a\n" +
                "small son, too, but they had never even seen him. This boy was\n" +
                "another good reason for keeping the Potters away; they didn’t\n" +
                "want Dudley mixing with a child like that. \n";

        String[] words = text.split("\\W");
        System.out.println(Arrays.toString(words));


    }



}
