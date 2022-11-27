import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            int mult = 1;
            do {
                System.out.println("Enter number from 2 to 8 ");
                number = scanner.nextInt();
            } while ( number < 2 || number > 8);
            for (int i = 1; i <= number; i++) {
                mult = mult * i;
                System.out.println(i);
            }
            System.out.println(" Factorial " + number + "! = " + mult);
        System.out.println("Merging to main branch");
        }
    }

