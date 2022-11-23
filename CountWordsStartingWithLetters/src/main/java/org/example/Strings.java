package org.example;

public class Strings {
    public static int wordCount (String[] words, char x){
        int count = 0;
        for (String word: words){
            if(word.toLowerCase().charAt(0) == x){
                count++;
            }
        }
        return count;
    }
    public static int wordInString (String sentence, char x){
        String[] sentenceBrokenDown = sentence.split(" ");
        return wordCount(sentenceBrokenDown, x);
    }
}
