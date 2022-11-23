package org.example;

public class Main {
    public static void main(String[] args) {
        String[] words = {"The", "cat", "in", "the", "hat"};
        char input = 't';
        String sentence = "The cat in the hat";

        System.out.println(Strings.wordCount(words, input));
        System.out.println(Strings.wordInString(sentence, input));
    }
}