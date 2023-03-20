package A0_Working_With_Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(" ANNA -> " + isPalindrome("ANNA"));
    }
    static boolean isPalindrome(String text) {
String [] inputText = text.toLowerCase().split("");
boolean isPalindrome = false;
for (int i = 0; i <= inputText.length/2; i++){
    if (inputText[i].equals(inputText [inputText.length - 1 - i] )){
        isPalindrome = true;
    }else {
        isPalindrome = false;
        break;
    }
}
return isPalindrome;
    }
}


