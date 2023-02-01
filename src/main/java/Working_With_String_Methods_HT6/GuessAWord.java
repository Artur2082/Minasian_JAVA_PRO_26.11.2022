package Working_With_String_Methods_HT6;

import java.util.Random;
import java.util.Scanner;

public class GuessAWord {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord = words[random.nextInt(words.length)];
        System.out.println(" Guess a word : ");
        String word = scanner.next().toLowerCase();
        int hintCharacter = 2;
        while (!randomWord.equals(word)) {
            StringBuilder stringBuilder = new StringBuilder("###############");
            System.out.println(stringBuilder.replace(0, hintCharacter, randomWord.substring(0, hintCharacter)));
            System.out.println(" Try again ! ");
            word = scanner.next().toLowerCase();
            if (hintCharacter + 2 <= randomWord.length()) {
                hintCharacter += 2;
            }
        }
        System.out.println("Correct! You won !!!");
    }
}

