package Q_Exercise_With_Lambdas_HT_20;

public class LambdasEx {
    public static void main(String[] args) {
        LambdasEx lambda = new LambdasEx();
        Operation operation;
        boolean result;
        String answer;
        operation = lambda.isOdd();
        int number = 4;
        result = lambda.checker(operation, number);
        answer = (result) ? "ODD" : "EVEN";
        System.out.println(number + " is " + answer);
        operation = lambda.isPrime();
        int number1 = 11;
        result = lambda.checker(operation, number1);
        answer = (result) ? "PRIME" : "COMPOSITE";
        System.out.println(number1 + " is " + answer);
        operation = lambda.isPalindrome();
        int number2 = 9229;
        result = lambda.checker(operation, number2);
        answer = (result) ? "PALINDROME" : "NOT PALINDROME";
        System.out.println(number2 + " is " + answer);
    }

    public boolean checker(Operation o, int num) {
        return o.check(num);
    }

    public Operation isOdd() {
        return number -> number % 2 != 0;
    }

    public Operation isPrime() {
        return number -> {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public Operation isPalindrome() {
        return number -> number == Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
