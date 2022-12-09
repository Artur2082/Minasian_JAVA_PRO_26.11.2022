package Lesson_4_Home_Task_5;

public class HomeWorkApp {
    public static int getRandomInRange(int begin, int end) {
        double random = Math.random();
        return (int) (random * (end - begin + 1)) + begin;
    }
    public static void main(String[] args) {
printThreeWords();
checkSumSign(-2,6);
printColor();
compareNumbers();
compareBoolean();
isPositiveOrNegative();
isPositOrNeg();
printString("Artur",4);
isleapYear(2020);
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(int a, int b){
        int sum = a + b;
        if ((a+b) >= 0){
            System.out.println(sum + " - Number positive");
        }else {
            System.out.println(sum +  " - Number negative");
        }
    }
    static void printColor() {
int value = getRandomInRange(-200, 200);
if(value <= 0 ){
    System.out.println(value + " = Red");
} else if (value > 0 && value <= 100) {
    System.out.println(value + " = Yellow");
} else if(value > 100 ) {
    System.out.println(value + " = Green");
}
    }
    static void compareNumbers(){
        int a = getRandomInRange(-100,100);
        int b = getRandomInRange(-100,100);
        if (a >= b){
            System.out.println(a + " >= " + b);
        }else {
            System.out.println(a + " < " + b);
        }
    }
    static boolean compareBoolean (){
        int a = getRandomInRange(-10,10);
        int b = getRandomInRange(-10,10);
        System.out.println("a + b = " + (a + b));
        if ((a + b) >= 10 && (a + b) <= 20){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
    static void isPositiveOrNegative(){
        int number = getRandomInRange(-100,100);
        if (number >= 0) {
            System.out.println(number + "  is positive");
        } else {
            System.out.println(number + " is negative");
        }
    }
    static boolean isPositOrNeg() {
        int number = getRandomInRange(-100,100);
        System.out.println(number);
        if (number >= 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    static void printString (String message, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
    static boolean isleapYear(int year){
        if (year%4 == 0 && year% 100 != 0 || year%400 == 0) {
            System.out.println(year + " - Leap year");
            System.out.println(true);
            return true;
        }else {
            System.out.println(year + " - not tall year");
            System.out.println(false);
            return false;
        }
    }
}
