package com.sam.wordgame;

import java.util.*;

public class WordBank {
    private static final String[] WORDS = {
        "java", "python", "inheritance", "polymorphism", "variable",
        "function", "loop", "object", "class", "compiler"
    };

    public static String getRandomWord() {
        Random rand = new Random();
        return WORDS[rand.nextInt(WORDS.length)];
    }

    public static String shuffleWord(String word) {
        List<Character> chars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }

        Collections.shuffle(chars);

        StringBuilder scrambled = new StringBuilder();
        for (char c : chars) {
            scrambled.append(c);
        }

        return scrambled.toString();
    }
}
