package com.sam.wordgame;

import java.util.Scanner;

public class WordScrambleGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("🧠 Welcome to the Word Scramble Trivia Game!");
        System.out.println("Unscramble the programming term! Type 'exit' to quit.\n");

        while (true) {
            String word = WordBank.getRandomWord();
            String scrambled = WordBank.shuffleWord(word);

            while (scrambled.equals(word)) {
                scrambled = WordBank.shuffleWord(word);  // Prevent same word
            }

            System.out.println("🔤 Scrambled word: " + scrambled);
            System.out.print("💡 Your guess: ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            } else if (input.equals(word)) {
                score++;
                System.out.println("✅ Correct! Score: " + score + "\n");
            } else {
                System.out.println("❌ Wrong! The correct word was: " + word + "\n");
            }
        }

        System.out.println("🎯 Final Score: " + score);
        System.out.println("Thanks for playing! 👋");

        sc.close();
    }
}
