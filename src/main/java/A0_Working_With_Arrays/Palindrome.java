package A0_Working_With_Arrays;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(" ANNA -> " + isPalindrome("ANNA"));
        System.out.println("121 -> " + isPalindromeNumber(121));
        isPalindromeNumberAnotherImplementation(232);
    }

    static boolean isPalindrome(String text) {
        String[] inputText = text.toLowerCase().split("");
        System.out.println(Arrays.toString(inputText));
        boolean isPalindrome = false;
        for (int i = 0; i <= inputText.length / 2; i++) {
            if (inputText[i].equals(inputText[inputText.length - 1 - i])) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean isPalindromeNumber(int num) {
        char[] x = String.valueOf(num).toCharArray();
        System.out.println(Arrays.toString(x));
        boolean check = true;
        for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
            if (x[i] == x[j]) {
                check = true;
            } else {
                return false;
            }
        }
        return check;
    }

    public static void isPalindromeNumberAnotherImplementation(int num) {
        int reverseNum = 0, initialNum, remainder;
        initialNum = num;
        while (num != 0) {
            remainder = num % 10;
            reverseNum = (reverseNum * 10) + remainder;
            num = num / 10;
        }
        if (initialNum == reverseNum) {
            System.out.println("Yes, the given number " + initialNum + " is a palindrome.");
        } else {
            System.out.println("No, the given number " + initialNum + " is not a palindrome.");
        }
    }
}


