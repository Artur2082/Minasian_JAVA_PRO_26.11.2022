package Lesson_12_Home_Task_13.Phonebook;

public class Recording {
    private String name;
    private int number;

    public Recording(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{" +
                "name =' " + name + '\'' +
                ", number = " + number +
                '}';
    }
}
