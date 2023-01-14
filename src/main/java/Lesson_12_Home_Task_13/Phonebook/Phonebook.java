package Lesson_12_Home_Task_13.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private static List<Recording> phoneBook = new ArrayList<>();

    public static void main(String[] args) {
        phoneBook.add(new Recording("Olga", 458946));
        phoneBook.add(new Recording("Artur", 332567));
        phoneBook.add(new Recording("Artur", 555555));
        phoneBook.add(new Recording("Denis", 674490));
        for (Recording recording : phoneBook) {
            System.out.println(recording.toString());
        }
        find("Olga");
        find("Artur");
        findAll("Artur");

    }

    public static void find(String name) {
        for (Recording recording : phoneBook) {
            if (recording.getName().equalsIgnoreCase(name)) {
                System.out.println("Searching name - " + recording.getName() + ", number = " + recording.getNumber());
                break;
            }
        }
    }
    public static void findAll(String name) {
        System.out.println("Finding all ");
        for (Recording recording : phoneBook) {
            if (recording.getName().equalsIgnoreCase(name)) {
                System.out.println("name - " + recording.getName() + ", number = " + recording.getNumber());
            }
        }
    }
}