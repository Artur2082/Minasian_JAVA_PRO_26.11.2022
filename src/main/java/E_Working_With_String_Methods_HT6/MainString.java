package E_Working_With_String_Methods_HT6;

public class MainString {
    public static void main(String[] args) {
        findSymbolOccurance("i am study at school Hillel", 'l');
        findWordPosition("Orange", "ange");
        stringReverse("Artur");
        System.out.println(" ANNA -> " + isPalindrome("ANNA"));
    }
    static void findSymbolOccurance(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (ch == text.toCharArray()[i]) {
                count++;
            }
        }
        System.out.println("char " + ch + " = " + count);
    }

    static void findWordPosition(String source, String target) {
        System.out.println("Source : " + source);
        System.out.println("Target : " + target);
        int result = source.indexOf(target);
        System.out.println("Result : " + result);
    }
    public static String stringReverse(String text) {
        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println(text + " -> " + reverse);
        return reverse;
    }
    static boolean isPalindrome(String text) {
        String[] inputText = text.toLowerCase().split("");
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
}
